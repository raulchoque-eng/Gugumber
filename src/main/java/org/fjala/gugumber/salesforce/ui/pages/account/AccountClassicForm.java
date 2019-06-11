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

import org.fjala.gugumber.core.selenium.utils.DriverMethods;
import org.fjala.gugumber.core.log.Logs;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
     * Web element for the text-box of billing Street.
     */
    @FindBy(id = "acc17street")
    private WebElement billingStreetTxtb;

    /**
     * Web element for the text-box of billing Zip or Postal Code.
     */
    @FindBy(id = "acc17zip")
    private WebElement billingZipOrPostalCodeTxtb;

    /**
     * Web element for the text-box of billing city.
     */
    @FindBy(id = "acc17city")
    private WebElement billingCityTxtb;

    /**
     * Web element for the text-box of billing state or province.
     */
    @FindBy(id = "acc17state")
    private WebElement billingStateOrProvinceTxtb;

    /**
     * Web element for the text-box of billing country.
     */
    @FindBy(id = "acc17country")
    private WebElement billingCountryTxtb;

    /**
     * Web element for the text-box of shipping Street.
     */
    @FindBy(id = "acc18street")
    private WebElement shippingStreetTxtb;

    /**
     * Web element for the text-box of shipping Zip or Postal code.
     */
    @FindBy(id = "acc18zip")
    private WebElement shippingZipOrPostalCodeTxtb;

    /**
     * Web element for the text-box of shipping city.
     */
    @FindBy(id = "acc18city")
    private WebElement shippingCityTxtb;

    /**
     * Web element for the text-box of shipping state or province.
     */
    @FindBy(id = "acc18state")
    private WebElement shippingStateOrProvinceTxtb;

    /**
     * Web element for the text-box of shipping country.
     */
    @FindBy(id = "acc18country")
    private WebElement shippingCountryTxtb;

    /**
     * Web element for the combo-box of customer priority.
     */
    @FindBy(xpath = "//select[@id=//label[starts-with(.,'Customer')]/@for]")
    private WebElement customerPriorityCmbb;

    /**
     * Web element for the text-box of SLA Expiration Date.
     */
    @FindBy(xpath = "//input[@id=//label[starts-with(.,'SLA Expiration Date')]/@for]")
    private WebElement sLAExpirationDateTxtb;

    /**
     * Web element for the link of Date.
     */
    @FindBy(css = "span[class='dateFormat'] a")
    private WebElement dateLnk;

    /**
     * Web element for the text-box of number pf locations.
     */
    @FindBy(xpath = "//input[@id=//label[starts-with(.,'Number of Locations')]/@for]")
    private WebElement numberOfLocationsTxtb;

    /**
     * Web element for the combo-box of active.
     */
    @FindBy(xpath = "//select[@id=//label[starts-with(.,'Active')]/@for]")
    private WebElement activeCmbb;

    /**
     * Web element for the combo-box of SLA.
     */
    @FindBy(xpath = "//select[@id=//label[starts-with(.,'SLA')]/@for]")
    private WebElement sLACmbb;

    /**
     * Web element for the text-box of SLA serial number.
     */
    @FindBy(xpath = "//input[@id=//label[starts-with(.,'SLA Serial Number')]/@for]")
    private WebElement sLASerialNumberTxtb;

    /**
     * Web element for the combo-box of upsell Opportunity.
     */
    @FindBy(xpath = "//select[@id=//label[starts-with(.,'Upsell Opportunity')]/@for]")
    private WebElement upsellOpportunityCmbb;

    /**
     * Web element for the text-box of description.
     */
    @FindBy(id = "acc20")
    private WebElement descriptionTxtb;

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
        parentAccountNameTxtB.sendKeys(Keys.TAB);
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
        DriverMethods.selectOptionFromComboBox(typeCmbB, type);
    }

    /**
     * Selects an industry type in the form.
     *
     * @param industry to set the account type.
     */
    @Override
    public void setIndustryOnCmbb(final String industry) {
        DriverMethods.selectOptionFromComboBox(industryCmbB, industry);
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
        DriverMethods.selectOptionFromComboBox(ratingCmbB, rating);
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
        DriverMethods.selectOptionFromComboBox(ownershipCmbB, ownership);
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
        sICCodeTxtB.sendKeys(sICCode);
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
        DriverMethods.selectOptionFromComboBox(customerPriorityCmbb, customerPriority);
    }

    /**
     * Sets the SLA Expiration Date of the account in the form.
     *
     * @param sLAExpirationDate for the SLA Expiration Date.
     */
    @Override
    public void setSLAExpirationDateOnTxtb(final String sLAExpirationDate) {
        if (sLAExpirationDate.equals("Today")) {
            dateLnk.click();
        } else {
            Logs.getInstance().getLog().info("The date is not Today");
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
        DriverMethods.selectOptionFromComboBox(activeCmbb, active);
    }

    /**
     * Sets the SLA type of the account in the form.
     *
     * @param sLA for the SLA type.
     */
    @Override
    public void setSLAOnCmbb(final String sLA) {
        DriverMethods.selectOptionFromComboBox(sLACmbb, sLA);
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
        DriverMethods.selectOptionFromComboBox(upsellOpportunityCmbb, upsellOpportunity);
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
