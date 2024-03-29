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

import org.fjala.gugumber.core.selenium.utils.DriverMethods;
import org.fjala.gugumber.core.log.Logs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;

/**
 * AccountLightningForm class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountLightningForm extends AccountFormAbstract {

    /**
     * Locator xpath to replace with the value sent for the combo-box of type, industry, rating and ownership.
     */
    public static final String LOCATOR_TO_REPLACE_IN_CMB_B = "//a[contains(.,'valueToReplace')]";

    /**
     * Locator xpath to replace with the value sent for the combo-box active.
     */
    public static final String XPATH_OF_ACTIVE_CMBB = "//a[starts-with(.,'valueToReplace')][@title='valueToReplace']";

    /**
     * Locator xpath to replace with the value sent for the combo-box of SLA.
     */
    public static final String XPATH_OF_SLA_CMBB = "//div[@class='select-options']//a[contains(.,'valueToReplace')]";

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
     * Web element for the text-box of billing street.
     */
    @FindBy(xpath = "//textarea[@id=//label[contains(.,'Street') and starts-with(.,'Billing')]/@for]")
    private WebElement billingStreetTxtb;

    /**
     * Web element for the text-box of billing Zip or Postal Code.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Zip/Postal') and starts-with(.,'Billing')]/@for]")
    private WebElement billingZipOrPostalCodeTxtb;

    /**
     * Web element for the text-box of billing City.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'City') and starts-with(.,'Billing')]/@for]")
    private WebElement billingCityTxtb;

    /**
     * Web element for the text-box of billing State or Province.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'State/Province') and starts-with(.,'Billing')]/@for]")
    private WebElement billingStateOrProvinceTxtb;

    /**
     * Web element for the text-box of billing Country.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Country') and starts-with(.,'Billing')]/@for]")
    private WebElement billingCountryTxtb;

    /**
     * Web element for the text-box of shipping Street.
     */
    @FindBy(xpath = "//textarea[@id=//label[contains(.,'Street') and starts-with(.,'Shipping')]/@for]")
    private WebElement shippingStreetTxtb;

    /**
     * Web element for the text-box of shipping Zip or Postal Code.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Zip/Postal') and starts-with(.,'Shipping')]/@for]")
    private WebElement shippingZipOrPostalCodeTxtb;

    /**
     * Web element for the text-box of shipping City.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'City') and starts-with(.,'Shipping')]/@for]")
    private WebElement shippingCityTxtb;

    /**
     * Web element for the text-box of shipping state or province.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'State/Province') and starts-with(.,'Shipping')]/@for]")
    private WebElement shippingStateOrProvinceTxtb;

    /**
     * Web element for the text-box of shipping Country.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Country') and starts-with(.,'Shipping')]/@for]")
    private WebElement shippingCountryTxtb;

    /**
     * Web element for the combo-box of customer priority.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Customer Priority')]/@id]")
    private WebElement customerPriorityCmbb;

    /**
     * Web element for the text-box of SLA Expiration Date.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'SLA Expiration Date') and starts-with(.,'SLA')]/@for]")
    private WebElement sLAExpirationDateTxtb;

    /**
     * Web element for the text-box of number of locations.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'Number of Locations') and starts-with(.,'Number')]/@for]")
    private WebElement numberOfLocationsTxtb;

    /**
     * Web element for the combo-box of active.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Active') and starts-with(.,'Active')]/@id]")
    private WebElement activeCmbb;

    /**
     * Web element for the combo-box of SLA.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'SLA')]/@id]")
    private WebElement sLACmbb;

    /**
     * Web element for the text-box of SLA serial number.
     */
    @FindBy(xpath = "//input[@id=//label[contains(.,'SLA Serial Number') and starts-with(.,'SLA')]/@for]")
    private WebElement sLASerialNumberTxtb;

    /**
     * Web element for the combo-box of upsell Opportunity.
     */
    @FindBy(xpath = "//a[@aria-describedby=//span[contains(.,'Upsell Opportunity') and starts-with(.,'Upsell')]/@id]")
    private WebElement upsellOpportunityCmbb;

    /**
     * Web element for the text-box of description.
     */
    @FindBy(xpath = "//textarea[@id=//label[contains(.,'Description') and starts-with(.,'Description')]/@for]")
    private WebElement descriptionTxtb;

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
        DriverMethods.setTxt(accountNameTxtB, accountName);
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
        DriverMethods.setTxt(accountNumberTxtB, accountNumber);
    }

    /**
     * Enters an account site in the form.
     *
     * @param accountSite to set the account site.
     */
    @Override
    public void setAccountSiteOnTxtb(final String accountSite) {
        DriverMethods.setTxt(accountSiteTxtB, accountSite);
    }

    /**
     * Selects an account type in the form.
     *
     * @param type to set the account type.
     */
    @Override
    public void setTypeOnCmbb(final String type) {
        typeCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_B, type))).click();
    }

    /**
     * Selects an industry type in the form.
     *
     * @param industry to set the account type.
     */
    @Override
    public void setIndustryOnCmbb(final String industry) {
        industryCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_B, industry))).click();
    }

    /**
     * Sets an annual revenue in the form.
     *
     * @param annualRevenue to set the account type.
     */
    @Override
    public void setAnnualRevenueOnTxtb(final String annualRevenue) {
        DriverMethods.setTxt(annualRevenueTxtB, annualRevenue);
    }

    /**
     * Selects a rating in the form.
     *
     * @param rating to set the account type.
     */
    @Override
    public void setRatingOnCmbb(final String rating) {
        ratingCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_B, rating))).click();
    }

    /**
     * Sets a number phone of account in the form.
     *
     * @param phone to set the account phone.
     */
    @Override
    public void setPhoneOnTxtb(final String phone) {
        DriverMethods.setTxt(phoneTxtB, phone);
    }

    /**
     * Sets a number fax of account in the form.
     *
     * @param fax to set the account fax.
     */
    @Override
    public void setFaxOnTxtb(final String fax) {
        DriverMethods.setTxt(faxTxtB, fax);
    }

    /**
     * Sets the website of the account in the form.
     *
     * @param website to set the account website.
     */
    @Override
    public void setWebsiteOnTxtb(final String website) {
        DriverMethods.setTxt(websiteTxtB, website);
    }

    /**
     * Sets the ticker symbol of the account in the form.
     *
     * @param tickerSymbol to set the ticker symbol.
     */
    @Override
    public void setTickerSymbolOnTxtb(final String tickerSymbol) {
        DriverMethods.setTxt(tickerSymbolTxtB, tickerSymbol);
    }

    /**
     * Selects the ownership of the account in the form.
     *
     * @param ownership to set the ownership.
     */
    @Override
    public void setOwnershipCmbb(final String ownership) {
        ownershipCmbB.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_B, ownership))).click();
    }

    /**
     * Sets the cant of employees of the account in the form.
     *
     * @param employees for the cant of employees.
     */
    @Override
    public void setEmployeesOnTxtb(final String employees) {
        DriverMethods.setTxt(employeesTxtB, employees);
    }

    /**
     * Sets the SIC Code of the account in the form.
     *
     * @param sICCode for the SIC Code.
     */
    @Override
    public void setsICCodeOnTxtb(final String sICCode) {
        DriverMethods.setTxt(sICCodeTxtB, sICCode);
    }

    /**
     * Sets the billing Street of the account in the form.
     *
     * @param billingStreet for the billing street.
     */
    @Override
    public void setBillingStreetOnTxtb(final String billingStreet) {
        DriverMethods.setTxt(billingStreetTxtb, billingStreet);
    }

    /**
     * Sets the billing Zip or Postal Code of the account in the form.
     *
     * @param billingZipOrPostalCode for the billing Zip or Postal Code.
     */
    @Override
    public void setBillingZipOrPostalCodeOnTxtb(final String billingZipOrPostalCode) {
        DriverMethods.setTxt(billingZipOrPostalCodeTxtb, billingZipOrPostalCode);
    }

    /**
     * Sets the billing city of the account in the form.
     *
     * @param billingCity for the billing city.
     */
    @Override
    public void setBillingCityOnTxtb(final String billingCity) {
        DriverMethods.setTxt(billingCityTxtb, billingCity);
    }

    /**
     * Sets the billing State or Province of the account in the form.
     *
     * @param billingStateOrProvince for the billing State or Province.
     */
    @Override
    public void setBillingStateOrProvinceOnTxtb(final String billingStateOrProvince) {
        DriverMethods.setTxt(billingStateOrProvinceTxtb, billingStateOrProvince);
    }

    /**
     * Sets the billing country of the account in the form.
     *
     * @param billingCountry for the billing country.
     */
    @Override
    public void setBillingCountryOnTxtb(final String billingCountry) {
        DriverMethods.setTxt(billingCountryTxtb, billingCountry);
    }

    /**
     * Sets the shipping Street of the account in the form.
     *
     * @param shippingStreet for the shipping Street.
     */
    @Override
    public void setShippingStreetOnTxtb(final String shippingStreet) {
        DriverMethods.setTxt(shippingStreetTxtb, shippingStreet);
    }

    /**
     * Sets the shipping Zip or Postal Code of the account in the form.
     *
     * @param shippingZipOrPostalCode for the shipping Zip or Postal Code.
     */
    @Override
    public void setShippingZipOrPostalCodeOnTxtb(final String shippingZipOrPostalCode) {
        DriverMethods.setTxt(shippingZipOrPostalCodeTxtb, shippingZipOrPostalCode);
    }

    /**
     * Sets the shipping city of the account in the form.
     *
     * @param shippingCity for the shipping city.
     */
    @Override
    public void setShippingCityOnTxtb(final String shippingCity) {
        DriverMethods.setTxt(shippingCityTxtb, shippingCity);
    }

    /**
     * Sets the shipping State Or Province of the account in the form.
     *
     * @param shippingStateOrProvince for the shipping State Or Province.
     */
    @Override
    public void setShippingStateOrProvinceOnTxtb(final String shippingStateOrProvince) {
        DriverMethods.setTxt(shippingStateOrProvinceTxtb, shippingStateOrProvince);
    }

    /**
     * Sets the shipping country of the account in the form.
     *
     * @param shippingCountry for the shipping country.
     */
    @Override
    public void setShippingCountryOnTxtb(final String shippingCountry) {
        DriverMethods.setTxt(shippingCountryTxtb, shippingCountry);
    }

    /**
     * Sets the customer priority of the account in the form.
     *
     * @param customerPriority for the customer priority.
     */
    @Override
    public void setCustomerPriorityOnCmbb(final String customerPriority) {
        customerPriorityCmbb.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_B, customerPriority))).click();
    }

    /**
     * Sets the SLA Expiration Date of the account in the form.
     *
     * @param sLAExpirationDate for the SLA Expiration Date.
     */
    @Override
    public void setSLAExpirationDateOnTxtb(final String sLAExpirationDate) {
        if (sLAExpirationDate.equals("Today")) {
            final Date date = new Date();
            DriverMethods.setTxt(sLAExpirationDateTxtb, DriverMethods.convertDateToString(date, "dd-MM-yyyy"));
            sLAExpirationDateTxtb.sendKeys(Keys.TAB);
        } else {
            Logs.getInstance().getLog().info("The date is different to Today");
            //TODO
            //Implement for other days different to Today
        }
    }

    /**
     * Sets the number Of Locations of the account in the form.
     *
     * @param numberOfLocations for the number Of Locations.
     */
    @Override
    public void setNumberOfLocationsOnTxtb(final String numberOfLocations) {
        DriverMethods.setTxt(numberOfLocationsTxtb, numberOfLocations);
    }

    /**
     * Sets the active type of the account in the form.
     *
     * @param active for the active type.
     */
    @Override
    public void setActiveOnCmbb(final String active) {
        activeCmbb.click();
        driver.findElement(By.xpath(replaceValueInLocator(XPATH_OF_ACTIVE_CMBB, active))).click();
    }

    /**
     * Sets the SLA type of the account in the form.
     *
     * @param sLA for the SLA type.
     */
    @Override
    public void setSLAOnCmbb(final String sLA) {
        sLACmbb.click();
        driver.findElement(By.xpath(replaceValueInLocator(XPATH_OF_SLA_CMBB, sLA))).click();
    }

    /**
     * Sets the SLA Serial Number of the account in the form.
     *
     * @param sLASerialNumber for the SLA Serial Number.
     */
    @Override
    public void setSLASerialNumberOnTxtb(final String sLASerialNumber) {
        DriverMethods.setTxt(sLASerialNumberTxtb, sLASerialNumber);
    }

    /**
     * Sets the upsell Opportunity type of the account in the form.
     *
     * @param upsellOpportunity for the upsell Opportunity type.
     */
    @Override
    public void setUpsellOpportunityOnCmbb(final String upsellOpportunity) {
        upsellOpportunityCmbb.click();
        driver.findElement(By.xpath(replaceValueInLocator(LOCATOR_TO_REPLACE_IN_CMB_B, upsellOpportunity))).click();
    }

    /**
     * Sets the description of the account in the form.
     *
     * @param description for the description.
     */
    @Override
    public void setDescriptionOnTxtb(final String description) {
        DriverMethods.setTxt(descriptionTxtb, description);
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
     * @param locator        to replace value.
     * @param valueToReplace to replace in locator.
     * @return a xpath as string with el value replaced for the combo-box.
     */
    private String replaceValueInLocator(final String locator, final String valueToReplace) {
        return locator.replace("valueToReplace", valueToReplace);
    }
}
