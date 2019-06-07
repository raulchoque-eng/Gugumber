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
import org.openqa.selenium.support.ui.Select;

/**
 * AccountLightningForm class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountLightningForm extends AccountFormAbstract {

    public static final String LOCATOR_TO_REPLACE_IN_CMB_BOX = "//a[contains(.,'valueToReprace')]";
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

    @FindBy(xpath = "//input[@id=//label[contains(.,'Account') and starts-with(.,'Parent')]/@for]")
    private WebElement parentAccountNameTxtB;

    @FindBy(xpath = "//input[@id=//label[contains(.,'Account Number') and starts-with(.,'Account')]/@for]")
    private WebElement accountNumberTxtB;

    @FindBy(xpath = "//input[@id=//label[contains(.,'Site') and starts-with(.,'Account')]/@for]")
    private WebElement accountSiteTxtB;

    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Type')]/@id]")
    private WebElement typeCmbB;

    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Industry')]/@id]")
    private WebElement industryCmbB;

    @FindBy(xpath = "//input[@id=//label[starts-with(.,'Annual')]/@for]")
    private WebElement annualRevenueTxtB;

    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Rating')]/@id]")
    private WebElement ratingCmbB;

    @FindBy(xpath = "//input[@id=//label[starts-with(.,'Phone')]/@for]")
    private WebElement phoneTxtB;

    @FindBy(xpath = "//input[@id=//label[starts-with(.,'Fax')]/@for]")
    private WebElement faxTxtB;

    @FindBy(xpath = "//input[@id=//label[contains(.,'Website')]/@for]")
    private WebElement websiteTxtB;

    @FindBy(xpath = "//input[@id=//label[contains(.,'Ticker Symbol')]/@for]")
    private WebElement tickerSymbolTxtB;

    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Ownership')]/@id]")
    private WebElement ownershipCmbB;

    @FindBy(xpath = "//input[@id=//label[contains(.,'Employees')]/@for]")
    private WebElement employeesTxtB;

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

    @Override
    public void setParentAccountTxtb(final String parentAccount) {
        parentAccountNameTxtB.sendKeys(parentAccount);
        accountNameTxtB.sendKeys(Keys.TAB);
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
        ownershipCmbB.click();
    }

    @Override
    public void setIndustryOnCmbb(final String industry) {
        industryCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_BOX, industry))).click();
    }

    private String replaceValueInLocator(final String locator, final String valueToReplace) {
        return locator.replace("valueToReprace", valueToReplace);
    }

    @Override
    public void setAnnualRevenueOnTxtb(final String annualRevenue) {
        annualRevenueTxtB.sendKeys(annualRevenue);
    }

    @Override
    public void setRatingOnCmbb(final String rating) {
        //TODO
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
        //TODO
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
     * Returns a new profile account for the layout lightning page.
     *
     * @return a profile account lightning.
     */
    @Override
    public AccountProfilePageAbstract clickOnSaveBtnFoot() {
        saveBtn.click();
        return new AccountProfileLightningPage();
    }
}
