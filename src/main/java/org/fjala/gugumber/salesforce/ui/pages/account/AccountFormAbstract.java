/*
 * @(#) AccountFormAbstract.java Copyright (c) 2019 Jala Foundation.
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

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;

import java.util.HashMap;
import java.util.Map;

import static org.fjala.gugumber.salesforce.keys.AccountKeys.*;

/**
 * AccountFormAbstract abstract class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public abstract class AccountFormAbstract extends BasePage {

    /**
     * Enters a name of account in the form.
     *
     * @param accountName to set the account name.
     */
    public abstract void setNameAccountOnTxtB(String accountName);

    /**
     * Enters a parent account in the form.
     *
     * @param parentAccount to set the parent account.
     */
    public abstract void setParentAccountTxtb(String parentAccount);

    /**
     * Enters an account number in the form.
     *
     * @param accountNumber to set the account number.
     */
    public abstract void setAccountNumberOnTxtb(String accountNumber);

    /**
     * Enters an account site in the form.
     *
     * @param accountSite to set the account site.
     */
    public abstract void setAccountSiteOnTxtb(String accountSite);

    /**
     * Selects an account type in the form.
     *
     * @param type to set the account type.
     */
    public abstract void setTypeOnCmbb(String type);

    /**
     * Selects an industry type in the form.
     *
     * @param industry to set the account type.
     */
    public abstract void setIndustryOnCmbb(String industry);

    /**
     * Sets an annual revenue in the form.
     *
     * @param annualRevenue to set the account type.
     */
    public abstract void setAnnualRevenueOnTxtb(String annualRevenue);

    /**
     * Selects a rating in the form.
     *
     * @param rating to set the account type.
     */
    public abstract void setRatingOnCmbb(String rating);

    /**
     * Sets a number phone of account in the form.
     *
     * @param phone to set the account phone.
     */
    public abstract void setPhoneOnTxtb(String phone);

    /**
     * Sets a number fax of account in the form.
     *
     * @param fax to set the account fax.
     */
    public abstract void setFaxOnTxtb(String fax);

    /**
     * Sets the website of the account in the form.
     *
     * @param website to set the account website.
     */
    public abstract void setWebsiteOnTxtb(String website);

    /**
     * Sets the ticker symbol of the account in the form.
     *
     * @param tickerSymbol to set the ticker symbol.
     */
    public abstract void setTickerSymbolOnTxtb(String tickerSymbol);

    /**
     * Selects the ownership of the account in the form.
     *
     * @param ownership to set the ownership.
     */
    public abstract void setOwnershipCmbb(String ownership);

    /**
     * Sets the cant of employees of the account in the form.
     *
     * @param employees for the cant of employees.
     */
    public abstract void setEmployeesOnTxtb(String employees);

    /**
     * Sets the SIC Code of the account in the form.
     *
     * @param sICCode for the SIC Code.
     */
    public abstract void setsICCodeOnTxtb(String sICCode);

    /**
     * Sets the billing Street of the account in the form.
     *
     * @param billingStreet for the billing street.
     */
    public abstract void setBillingStreetOnTxtb(String billingStreet);

    /**
     * Sets the billing Zip or Postal Code of the account in the form.
     *
     * @param billingZipOrPostalCode for the billing Zip or Postal Code.
     */
    public abstract void setBillingZipOrPostalCodeOnTxtb(String billingZipOrPostalCode);

    /**
     * Sets the billing city of the account in the form.
     *
     * @param billingCity for the billing city.
     */
    public abstract void setBillingCityOnTxtb(String billingCity);

    /**
     * Sets the billing State or Province of the account in the form.
     *
     * @param billingStateOrProvince for the billing State or Province.
     */
    public abstract void setBillingStateOrProvinceOnTxtb(String billingStateOrProvince);

    /**
     * Sets the billing country of the account in the form.
     *
     * @param billingCountry for the billing country.
     */
    public abstract void setBillingCountryOnTxtb(String billingCountry);

    /**
     * Sets the shipping Street of the account in the form.
     *
     * @param shippingStreet for the shipping Street.
     */
    public abstract void setShippingStreetOnTxtb(String shippingStreet);

    /**
     * Sets the shipping Zip or Postal Code of the account in the form.
     *
     * @param shippingZipOrPostalCode for the shipping Zip or Postal Code.
     */
    public abstract void setShippingZipOrPostalCodeOnTxtb(String shippingZipOrPostalCode);

    /**
     * Sets the shipping city of the account in the form.
     *
     * @param shippingCity for the shipping city.
     */
    public abstract void setShippingCityOnTxtb(String shippingCity);

    /**
     * Sets the shipping State Or Province of the account in the form.
     *
     * @param shippingStateOrProvince for the shipping State Or Province.
     */
    public abstract void setShippingStateOrProvinceOnTxtb(String shippingStateOrProvince);

    /**
     * Sets the shipping country of the account in the form.
     *
     * @param shippingCountry for the shipping country.
     */
    public abstract void setShippingCountryOnTxtb(String shippingCountry);

    /**
     * Sets the customer priority of the account in the form.
     *
     * @param customerPriority for the customer priority.
     */
    public abstract void setCustomerPriorityOnCmbb(String customerPriority);

    /**
     * Sets the SLA Expiration Date of the account in the form.
     *
     * @param sLAExpirationDate for the SLA Expiration Date.
     */
    public abstract void setSLAExpirationDateOnTxtb(String sLAExpirationDate);

    /**
     * Sets the number Of Locations of the account in the form.
     *
     * @param numberOfLocations for the number Of Locations.
     */
    public abstract void setNumberOfLocationsOnTxtb(String numberOfLocations);

    /**
     * Sets the active type of the account in the form.
     *
     * @param active for the active type.
     */
    public abstract void setActiveOnCmbb(String active);

    /**
     * Sets the SLA type of the account in the form.
     *
     * @param sLA for the SLA type.
     */
    public abstract void setSLAOnCmbb(String sLA);

    /**
     * Sets the SLA Serial Number of the account in the form.
     *
     * @param sLASerialNumber for the SLA Serial Number.
     */
    public abstract void setSLASerialNumberOnTxtb(String sLASerialNumber);

    /**
     * Sets the upsell Opportunity type of the account in the form.
     *
     * @param upsellOpportunity for the upsell Opportunity type.
     */
    public abstract void setUpsellOpportunityOnCmbb(String upsellOpportunity);

    /**
     * Sets the description of the account in the form.
     *
     * @param description for the description.
     */
    public abstract void setDescriptionOnTxtb(String description);

    /**
     * Returns an Account Profile page after clicking on save button of the footer.
     *
     * @return an account profile page.
     */
    public abstract AccountProfilePageAbstract clickOnSaveBtnFoot();

    /**
     * Sets the values of an Account sending a map with the information to set.
     *
     * @param accountMap to set the information.
     */
    public void setAccountInformationOnForm(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = composeStrategyMap(accountMap);
        accountMap.keySet().forEach(key -> strategyMap.get(key).executeMethod());
    }

    /**
     * Returns a map with the information the account.
     *
     * @param accountMap to set the information.
     * @return strategyMap with the information of account.
     */
    private HashMap<String, StrategySetter> composeStrategyMap(final Map<String, String> accountMap) {
        HashMap<String, StrategySetter> strategyMap = new HashMap<>();
        strategyMap.put(NAME_ACCOUNT, () -> setNameAccountOnTxtB(accountMap.get(NAME_ACCOUNT)));
        strategyMap.put(PARENT_ACCOUNT, () -> setParentAccountTxtb(accountMap.get(PARENT_ACCOUNT)));
        strategyMap.put(ACCOUNT_NUMBER, () -> setAccountNumberOnTxtb(accountMap.get(ACCOUNT_NUMBER)));
        strategyMap.put(ACCOUNT_SITE, () -> setAccountSiteOnTxtb(accountMap.get(ACCOUNT_SITE)));
        strategyMap.put(TYPE, () -> setTypeOnCmbb(accountMap.get(TYPE)));
        strategyMap.put(INDUSTRY, () -> setIndustryOnCmbb(accountMap.get(INDUSTRY)));
        strategyMap.put(ANNUAL_REVENUE, () -> setAnnualRevenueOnTxtb(accountMap.get(ANNUAL_REVENUE)));
        strategyMap.put(RATING, () -> setRatingOnCmbb(accountMap.get(RATING)));
        strategyMap.put(PHONE, () -> setPhoneOnTxtb(accountMap.get(PHONE)));
        strategyMap.put(FAX, () -> setFaxOnTxtb(accountMap.get(FAX)));
        strategyMap.put(WEBSITE, () -> setWebsiteOnTxtb(accountMap.get(WEBSITE)));
        strategyMap.put(TICKER_SYMBOL, () -> setTickerSymbolOnTxtb(accountMap.get(TICKER_SYMBOL)));
        strategyMap.put(OWNERSHIP, () -> setOwnershipCmbb(accountMap.get(OWNERSHIP)));
        strategyMap.put(EMPLOYEES, () -> setEmployeesOnTxtb(accountMap.get(EMPLOYEES)));
        strategyMap.put(SIC_CODE, () -> setsICCodeOnTxtb(accountMap.get(SIC_CODE)));
        strategyMap.put(BILLING_STREET, () -> setBillingStreetOnTxtb(accountMap.get(BILLING_STREET)));
        strategyMap.put(BILLING_ZIP_POSTAL_CODE, () -> setBillingZipOrPostalCodeOnTxtb(
                accountMap.get(BILLING_ZIP_POSTAL_CODE)));
        strategyMap.put(BILLING_CITY, () -> setBillingCityOnTxtb(accountMap.get(BILLING_CITY)));
        strategyMap.put(BILLING_STATE_PROVINCE, () -> setBillingStateOrProvinceOnTxtb(
                accountMap.get(BILLING_STATE_PROVINCE)));
        strategyMap.put(BILLING_COUNTRY, () -> setBillingCountryOnTxtb(accountMap.get(BILLING_COUNTRY)));
        strategyMap.put(SHIPPING_STREET, () -> setShippingStreetOnTxtb(accountMap.get(SHIPPING_STREET)));
        strategyMap.put(SHIPPING_ZIP_POSTAL_CODE, () -> setShippingZipOrPostalCodeOnTxtb(
                accountMap.get(SHIPPING_ZIP_POSTAL_CODE)));
        strategyMap.put(SHIPPING_CITY, () -> setShippingCityOnTxtb(accountMap.get(SHIPPING_CITY)));
        strategyMap.put(SHIPPING_STATE_PROVINCE, () -> setShippingStateOrProvinceOnTxtb(
                accountMap.get(SHIPPING_STATE_PROVINCE)));
        strategyMap.put(SHIPPING_COUNTRY, () -> setShippingCountryOnTxtb(accountMap.get(SHIPPING_COUNTRY)));
        strategyMap.put(CUSTOMER_PRIORITY, () -> setCustomerPriorityOnCmbb(accountMap.get(CUSTOMER_PRIORITY)));
        strategyMap.put(SLA_EXPIRATION_DATE, () -> setSLAExpirationDateOnTxtb(accountMap.get(SLA_EXPIRATION_DATE)));
        strategyMap.put(NUMBER_OF_LOCATIONS, () -> setNumberOfLocationsOnTxtb(accountMap.get(NUMBER_OF_LOCATIONS)));
        strategyMap.put(ACTIVE, () -> setActiveOnCmbb(accountMap.get(ACTIVE)));
        strategyMap.put(SLA, () -> setSLAOnCmbb(accountMap.get(SLA)));
        strategyMap.put(SLA_SERIAL_NUMBER, () -> setSLASerialNumberOnTxtb(accountMap.get(SLA_SERIAL_NUMBER)));
        strategyMap.put(UPSELL_OPPORTUNITY, () -> setUpsellOpportunityOnCmbb(accountMap.get(UPSELL_OPPORTUNITY)));
        strategyMap.put(DESCRIPTION_ACCOUNT, () -> setDescriptionOnTxtb(accountMap.get(DESCRIPTION_ACCOUNT)));
        return strategyMap;
    }
}
