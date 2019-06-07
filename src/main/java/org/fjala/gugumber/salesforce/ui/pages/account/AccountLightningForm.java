/*
 * @(#) AccountLightningForm.java Copyright (c) 2019 Jala Foundation.
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

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * AccountLightningForm class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountLightningForm extends AccountFormAbstract {

    /**
     * Locator xpath to replace with the value sending for the combo-box of type, industry, rating and ownership.
     */
    public static final String LOCATOR_TO_REPLACE_IN_CMB_BOX = "//a[contains(.,'valueToReplace')]";

    /**
     * Web element for the body of the form.
     */
    @FindBy(css = "div[class='modal-body scrollable slds-modal__content slds-p-around--medium']")
    private WebElement formModalBody;

    /**
     * Web element for the text-box the account name.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Account') and starts-with(.,'Account Name')]/@for]")
    private WebElement accountNameTxtB;

    /**
     * Web element for the text-box the parent account name.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Account') and starts-with(.,'Parent')]/@for]")
    private WebElement parentAccountNameTxtB;

    /**
     * Web element for the text-box the account number.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Account Number') and starts-with(.,'Account')]/@for]")
    private WebElement accountNumberTxtB;

    /**
     * Web element for the text-box the account site.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Site') and starts-with(.,'Account')]/@for]")
    private WebElement accountSiteTxtB;

    /**
     * Web element for the combo-box the account type.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Type')]/@id]")
    private WebElement typeCmbB;

    /**
     * Web element for the combo-box the account industry type.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Industry')]/@id]")
    private WebElement industryCmbB;

    /**
     * Web element for the text-box the annual revenue.
     */
    @FindBy(xpath = "//input[@id=//label[starts-with(.,'Annual')]/@for]")
    private WebElement annualRevenueTxtB;

    /**
     * Web element for the combo-box the rating type.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Rating')]/@id]")
    private WebElement ratingCmbB;

    /**
     * Web element for the text-box of phone.
     */
    @FindBy(xpath = "//input[@id=//label[starts-with(.,'Phone')]/@for]")
    private WebElement phoneTxtB;

    /**
     * Web element for the text-box of the fax of account.
     */
    @FindBy(xpath = "//input[@id=//label[starts-with(.,'Fax')]/@for]")
    private WebElement faxTxtB;

    /**
     * Web element for the text-box website of account.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Website')]/@for]")
    private WebElement websiteTxtB;

    /**
     * Web element for the text-box ticker symbol.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Ticker Symbol')]/@for]")
    private WebElement tickerSymbolTxtB;

    /**
     * Web element for the combo-box ownership.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Ownership')]/@id]")
    private WebElement ownershipCmbB;

    /**
     * Web element for the text-box of employees.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Employees')]/@for]")
    private WebElement employeesTxtB;

    /**
     * Web element for the text-box of SIC Code.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'SIC Code')]/@for]")
    private WebElement sICCodeTxtB;

    /**
     * Web element for the button save of the footer in the form.
     */
    @FindBy(css = "[data-aura-class='uiButton--default uiButton--brand uiButton forceActionButton']")
    private WebElement saveBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(formModalBody));
    }

    /**
     * Sets the name account on the text-box the form.
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
        accountNameTxtB.sendKeys(Keys.TAB);
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
        typeCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_BOX, type))).click();
    }

    /**
     * Selects an industry type in the form.
     *
     * @param industry to set the account type.
     */
    @Override
    public void setIndustryOnCmbb(final String industry) {
        industryCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_BOX, industry))).click();
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
        ratingCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_BOX, rating))).click();
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
        ownershipCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_BOX, ownership))).click();
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
     * Returns a new profile account for the layout lightning page.
     *
     * @return a profile account lightning.
     */
    @Override
    public AccountProfilePageAbstract clickOnSaveBtnFoot() {
        saveBtn.click();
        return new AccountProfileLightningPage();
    }

    /**
     * Replaces the a value in the locator xpath to select an option in combo-box.
     *
     * @param locator to replace value.
     * @param valueToReplace to replace in locator.
     * @return a xpath as string with el value replaced for the combo-box.
     */
    private String replaceValueInLocator(final String locator, final String valueToReplace) {
        return locator.replace("valueToReplace", valueToReplace);
    }
}
