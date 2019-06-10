/*
 * @(#) AccountSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.steps;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.fjala.gugumber.salesforce.api.AccountAPI;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.ui.PageLayoutFactory;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountDetailsAbstract;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountFormAbstract;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountProfilePageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountsPageAbstract;
import org.testng.Assert;

/**
 * AccountSteps class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountSteps {

    /**
     * Variable for the account page.
     */
    private AccountsPageAbstract accountsPage;

    /**
     * Variable for the account form.
     */
    private AccountFormAbstract accountForm;

    /**
     * Variable for the profile account page.
     */
    private AccountProfilePageAbstract accountProfilePage;

    /**
     * Variable for the account details page.
     */
    private AccountDetailsAbstract accountDetails;

    /**
     * Variable for the response of request to API.
     */
    private Response response;

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Constructor of account steps sending the context.
     *
     * @param context init the context.
     */
    public AccountSteps(final Context context) {
        this.context = context;
    }

    /**
     * Opens the account form from accounts page.
     */
    @When("^I open the Account form from Accounts page$")
    public void openTheAccountFormFromAccountsPage() {
        accountsPage = PageLayoutFactory.getAccountsPage();
        accountForm = accountsPage.clickNewBtn();
    }

    /**
     * Creates a new account sending the information.
     *
     * @param accountMap for the information of account.
     */
    @When("^I create a new Account with the following information$")
    public void createANewAccountWithTheFollowingInformation(final Map<String,String> accountMap) {
        context.getAccount().setAccountInformation(accountMap);
        accountForm.setAccountInformationOnForm(accountMap);
        accountProfilePage = accountForm.clickOnSaveBtnFoot();
        context.getAccount().setId(accountProfilePage.getIdFromUrl());
    }

    /**
     * Verifies the information in the profile account.
     */
    @Then("^the account name should be displayed in the Account page$")
    public void displayAccountNameOnTheAccountPage() {
        Assert.assertEquals(accountProfilePage.getNameAccountFromProfileHeader(), context.getAccount().getAccountName());
    }

    /**
     * Verifies that account is displayed on recents list of account page.
     */
    @Then("^the account should be displayed on Accounts page$")
    public void displayAccountOnAccountsPage() {
        accountsPage = PageLayoutFactory.getAccountsPage();
        Assert.assertTrue(accountsPage.getListOfAccountsName().contains(context.getAccount().getAccountName()));
    }

    /**
     * Goes to the account details from account page.
     */
    @When("^I go to the Account Details from Account page$")
    public void goToTheAccountDetailsFromAccountPage() {
        accountDetails = accountProfilePage.getAccountDetails();
    }

    /**
     * Verifies the name account on account details.
     */
    @Then("^the account name should be displayed in the Account Details$")
    public void displayAccountNameInTheAccountDetails() {
        Assert.assertTrue(accountDetails.getValueOfAccountNameField().startsWith(context.getAccount().getAccountName()));
    }

    /**
     * Creates an account by API.
     * @param newAccount
     */
    @Given("^I have a account with the following information$")
    public void haveAnAccountWithTheFollowingInformation(final Map<String, String> newAccount) {
        context.getAccount().setId(AccountAPI.getInstance().createAccount(newAccount));
    }

    /**
     * Opens the account page of an account in specific.
     */
    @When("^I open the the Account page$")
    public void openTheTheAccountPage() {
        accountsPage = PageLayoutFactory.getAccountsPage();
        accountProfilePage = accountsPage.openAccount(context.getAccount().getId());
    }

    /**
     * Deletes the account from the account page.
     */
    @When("^I delete the Account from the Account page$")
    public void deleteTheAccountFromTheAccountPage() {
        accountsPage = accountProfilePage.clickOnDeleteBtn();
    }

    /**
     * Verifies that the account deleted isn't displayed in the accounts page.
     */
    @Then("^the account name shouldn't be displayed in the Accounts page$")
    public void isNotDisplayedInTheAccountsPage() {
        Assert.assertFalse(accountsPage.getListOfAccountsName().contains(context.getAccount().getAccountName()));
    }

    /**
     * Sends a GET request for the account by id.
     */
    @When("^I send a request GET of the account$")
    public void sendARequestGETOfTheAccount() {
        response = AccountAPI.getInstance().getAccountById(context.getAccount().getId());
    }

    /**
     * Verifies that the account doesn't exist.
     *
     * @param statusCode to verify.
     */
    @Then("^I get a \"([^\"]*)\" status code as response$")
    public void getAStatusCodeAsResponse(final String statusCode) {
        Assert.assertEquals(statusCode, String.valueOf(response.getStatusCode()));
    }
}
