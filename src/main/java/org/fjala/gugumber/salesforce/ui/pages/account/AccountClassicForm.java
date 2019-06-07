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
     * Web element for the text=box of account name.
     */
    @FindBy(xpath = "//div[@class='requiredInput']//input")
    private WebElement accountNameTxtB;

    @FindBy(id = "acc3")
    private WebElement parentAccountNameTxtB;

    @FindBy(id = "acc5")
    private WebElement accountNumberTxtB;

    @FindBy(id = "acc23")
    private WebElement accountSiteTxtB;

    @FindBy(id = "acc6")
    private WebElement typeCmbB;

    @FindBy(id = "acc7")
    private WebElement industryCmbB;

    @FindBy(id = "acc8")
    private WebElement annualRevenueTxtB;

    @FindBy(id = "acc9")
    private WebElement ratingCmbB;

    @FindBy(id = "acc10")
    private WebElement phoneTxtB;

    @FindBy(id = "acc11")
    private WebElement faxTxtB;

    @FindBy(id = "acc12")
    private WebElement websiteTxtB;

    @FindBy(id = "acc13")
    private WebElement tickerSymbolTxtB;

    @FindBy(id = "acc14")
    private WebElement ownershipCmbB;

    @FindBy(id = "acc15")
    private WebElement employeesTxtB;

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

    @Override
    public void setParentAccountTxtb(final String parentAccount) {
        parentAccountNameTxtB.sendKeys(parentAccount);
        parentAccountNameTxtB.sendKeys(Keys.TAB);
    }

    @Override
    public void setAccountNumberOnTxtb(final String accountNumber) {
        accountNumberTxtB.sendKeys(accountNumber);
    }

    @Override
    public void setAccountSiteOnTxtb(final String accountSite) {
        accountSiteTxtB.sendKeys(accountSite);
    }

    @Override
    public void setTypeOnCmbb(final String type) {
        Select selectType = new Select(typeCmbB);
        selectType.selectByVisibleText(type);
    }

    @Override
    public void setIndustryOnCmbb(final String industry) {
        Select selectIndustry = new Select(industryCmbB);
        selectIndustry.selectByVisibleText(industry);
    }

    @Override
    public void setAnnualRevenueOnTxtb(final String annualRevenue) {
        annualRevenueTxtB.sendKeys(annualRevenue);
    }

    @Override
    public void setRatingOnCmbb(final String rating) {
        Select selectRating = new Select(ratingCmbB);
        selectRating.selectByVisibleText(rating);
    }

    @Override
    public void setPhoneOnTxtb(final String phone) {
        phoneTxtB.sendKeys(phone);
    }

    @Override
    public void setFaxOnTxtb(final String fax) {
        faxTxtB.sendKeys(fax);
    }

    @Override
    public void setWebsiteOnTxtb(final String website) {
        websiteTxtB.sendKeys(website);
    }

    @Override
    public void setTickerSymbolOnTxtb(final String tickerSymbol) {
        tickerSymbolTxtB.sendKeys(tickerSymbol);
    }

    @Override
    public void setOwnershipCmbb(final String ownership) {
        Select selectOwnership = new Select(ownershipCmbB);
        selectOwnership.selectByVisibleText(ownership);
    }

    @Override
    public void setEmployeesOnTxtb(final String employees) {
        employeesTxtB.sendKeys(employees);
    }

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
