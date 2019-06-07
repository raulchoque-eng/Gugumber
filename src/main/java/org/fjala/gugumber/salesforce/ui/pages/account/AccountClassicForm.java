/*
 * @(#) AccountClassicForm.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 *  with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.account;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * AccountClassicForm class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountClassicForm extends AccountFormAbstract {

    /**
     * Web element for the body form of account.
     */
    @FindBy(css = "td[id=bodyCell]")
    private WebElement form;

    /**
     * Web element for the text-box of account name.
     */
    @FindBy(xpath = "//div[@class='requiredInput']//input")
    private WebElement accountNameTxtB;

    /**
     * Web element for the text-box of parent account name.
     */
    @FindBy(id = "acc3")
    private WebElement parentAccountNameTxtB;

    /**
     * Web element for the text-box of account number.
     */
    @FindBy(id = "acc5")
    private WebElement accountNumberTxtB;

    /**
     * Web element for the text-box of account site.
     */
    @FindBy(id = "acc23")
    private WebElement accountSiteTxtB;

    /**
     * Web element for the combo-box of type.
     */
    @FindBy(id = "acc6")
    private WebElement typeCmbB;

    /**
     * Web element for the combo-box of industry.
     */
    @FindBy(id = "acc7")
    private WebElement industryCmbB;

    /**
     * Web element for the text-box of annual revenue.
     */
    @FindBy(id = "acc8")
    private WebElement annualRevenueTxtB;

    /**
     * Web element for the combo-box of rating.
     */
    @FindBy(id = "acc9")
    private WebElement ratingCmbB;

    /**
     * Web element for the text-box of phone.
     */
    @FindBy(id = "acc10")
    private WebElement phoneTxtB;

    /**
     * Web element for the text-box of fax.
     */
    @FindBy(id = "acc11")
    private WebElement faxTxtB;

    /**
     * Web element for the text-box of website.
     */
    @FindBy(id = "acc12")
    private WebElement websiteTxtB;

    /**
     * Web element for the text-box of ticker symbol.
     */
    @FindBy(id = "acc13")
    private WebElement tickerSymbolTxtB;

    /**
     * Web element for the combo-box of ownership.
     */
    @FindBy(id = "acc14")
    private WebElement ownershipCmbB;

    /**
     * Web element for the text-box of employees.
     */
    @FindBy(id = "acc15")
    private WebElement employeesTxtB;

    /**
     * Web element for the text-box of SIC Code.
     */
    @FindBy(id = "acc16")
    private WebElement sICCodeTxtB;

    /**
     * Web element for the button save of footer.
     */
    @FindBy(css = "td[id='bottomButtonRow'] input[name='save']")
    private WebElement saveBtnfoot;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(form));
    }

    /**
     * Enters the name for the account sending a string.
     *
     * @param accountName to set the account name.
     */
    @Override
    public void setNameAccountOnTxtB(final String accountName) {
        accountNameTxtB.sendKeys(accountName);
    }

    /**
     * Enters a parent account in the form.
     *
     * @param parentAccount to set the parent account.
     */
    @Override
    public void setParentAccountTxtb(final String parentAccount) {
        parentAccountNameTxtB.sendKeys(parentAccount);
        parentAccountNameTxtB.sendKeys(Keys.TAB);
    }

    /**
     * Enters an account number in the form.
     *
     * @param accountNumber to set the account number.
     */
    @Override
    public void setAccountNumberOnTxtb(final String accountNumber) {
        accountNumberTxtB.sendKeys(accountNumber);
    }

    /**
     * Enters an account site in the form.
     *
     * @param accountSite to set the account site.
     */
    @Override
    public void setAccountSiteOnTxtb(final String accountSite) {
        accountSiteTxtB.sendKeys(accountSite);
    }

    /**
     * Selects an account type in the form.
     *
     * @param type to set the account type.
     */
    @Override
    public void setTypeOnCmbb(final String type) {
        Select selectType = new Select(typeCmbB);
        selectType.selectByVisibleText(type);
    }

    /**
     * Selects an industry type in the form.
     *
     * @param industry to set the account type.
     */
    @Override
    public void setIndustryOnCmbb(final String industry) {
        Select selectIndustry = new Select(industryCmbB);
        selectIndustry.selectByVisibleText(industry);
    }

    /**
     * Sets an annual revenue in the form.
     *
     * @param annualRevenue to set the account type.
     */
    @Override
    public void setAnnualRevenueOnTxtb(final String annualRevenue) {
        annualRevenueTxtB.sendKeys(annualRevenue);
    }

    /**
     * Selects a rating in the form.
     *
     * @param rating to set the account type.
     */
    @Override
    public void setRatingOnCmbb(final String rating) {
        Select selectRating = new Select(ratingCmbB);
        selectRating.selectByVisibleText(rating);
    }

    /**
     * Sets a number phone of account in the form.
     *
     * @param phone to set the account phone.
     */
    @Override
    public void setPhoneOnTxtb(final String phone) {
        phoneTxtB.sendKeys(phone);
    }

    /**
     * Sets a number fax of account in the form.
     *
     * @param fax to set the account fax.
     */
    @Override
    public void setFaxOnTxtb(final String fax) {
        faxTxtB.sendKeys(fax);
    }

    /**
     * Sets the website of the account in the form.
     *
     * @param website to set the account website.
     */
    @Override
    public void setWebsiteOnTxtb(final String website) {
        websiteTxtB.sendKeys(website);
    }

    /**
     * Sets the ticker symbol of the account in the form.
     *
     * @param tickerSymbol to set the ticker symbol.
     */
    @Override
    public void setTickerSymbolOnTxtb(final String tickerSymbol) {
        tickerSymbolTxtB.sendKeys(tickerSymbol);
    }

    /**
     * Selects the ownership of the account in the form.
     *
     * @param ownership to set the ownership.
     */
    @Override
    public void setOwnershipCmbb(final String ownership) {
        Select selectOwnership = new Select(ownershipCmbB);
        selectOwnership.selectByVisibleText(ownership);
    }

    /**
     * Sets the cant of employees of the account in the form.
     *
     * @param employees for the cant of employees.
     */
    @Override
    public void setEmployeesOnTxtb(final String employees) {
        employeesTxtB.sendKeys(employees);
    }

    /**
     * Sets the SIC Code of the account in the form.
     *
     * @param sICCode for the SIC Code.
     */
    @Override
    public void setsICCodeOnTxtb(final String sICCode) {
        sICCodeTxtB.sendKeys(sICCode);
    }

    /**
     * Returns a new account profile after clicking on save button.
     *
     * @return a new account profile classic page.
     */
    @Override
    public AccountProfilePageAbstract clickOnSaveBtnFoot() {
        saveBtnfoot.click();
        return new AccountProfileClassicPage();
    }
}
