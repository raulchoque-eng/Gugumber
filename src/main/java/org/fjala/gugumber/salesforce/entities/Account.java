/*
 * @(#) Account.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.entities;

import static org.fjala.gugumber.salesforce.keys.AccountKeys.*;

import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;

/**
 * Account class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class Account {

    /**
     * Variable for the id of account.
     */
    private String id;

    /**
     * Variable for the name account of an Account.
     */
    private String accountName;

    /**
     * Variable for the name of parent account.
     */
    private String parentAccount;

    /**
     * Variable for the account number of an Account.
     */
    private String accountNumber;

    /**
     * Variable for the account site of an Account.
     */
    private String accountSite;

    /**
     * Variable for the account type of an Account.
     */
    private String type;

    /**
     * Variable for the industry type of an Account.
     */
    private String industry;

    /**
     * Variable for the annual revenue of an Account.
     */
    private String annualRevenue;

    /**
     * Variable for the rating type of an Account.
     */
    private String rating;

    /**
     * Variable for the phone number of an Account.
     */
    private String phone;

    /**
     * Variable for the rating type of an Account.
     */
    private String fax;

    /**
     * Variable for the website type of an Account.
     */
    private String website;

    /**
     * Variable for the ticker symbol of an Account.
     */
    private String tickerSymbol;

    /**
     * Variable for the ownership type of an Account.
     */
    private String ownership;

    /**
     * Variable for the cant of employees of an Account.
     */
    private String employees;

    /**
     * Variable for the SIC Code of an Account.
     */
    private String sICCode;

    /**
     * Variable for the billing Street of an Account.
     */
    private String billingStreet;

    /**
     * Variable for the billing Zip or Postal Code of an Account.
     */
    private String billingZipOrPostalCode;

    /**
     * Variable for the billing city of an Account.
     */
    private String billingCity;

    /**
     * Variable for the billing State Or Province of an Account.
     */
    private String billingStateOrProvince;

    /**
     * Variable for the billing country of an Account.
     */
    private String billingCountry;

    /**
     * Variable for the shipping Street of an Account.
     */
    private String shippingStreet;

    /**
     * Variable for the shipping Zip Or Postal Code of an Account.
     */
    private String shippingZipOrPostalCode;

    /**
     * Variable for the shipping city of an Account.
     */
    private String shippingCity;

    /**
     * Variable for the shipping state or province of an Account.
     */
    private String shippingStateOrProvince;

    /**
     * Variable for the shipping country of an Account.
     */
    private String shippingCountry;

    /**
     * Variable for the customer priority of an Account.
     */
    private String customerPriority;

    /**
     * Variable for the SLA Expiration Date of an Account.
     */
    private String sLAExpirationDate;

    /**
     * Variable for the number Of Locations of an Account.
     */
    private String numberOfLocations;

    /**
     * Variable for the active of an Account.
     */
    private String active;

    /**
     * Variable for the SLA of an Account.
     */
    private String sLA;

    /**
     * Variable for the SLA serial number of an Account.
     */
    private String sLASerialNumber;

    /**
     * Variable for the upsell Opportunity of an Account.
     */
    private String upsellOpportunity;

    /**
     * Variable for the description of an Account.
     */
    private String description;

    /**
     * Returns the id of the account.
     *
     * @return the id as string.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of account sending a string.
     *
     * @param id for the account.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Returns the name account.
     *
     * @return name account as string.
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the name of an Account sending a string.
     *
     * @param accountName for the name of the account.
     */
    public void setAccountName(final String accountName) {
        this.accountName = accountName;
    }

    /**
     * Returns the parent name of an Account.
     *
     * @return parentAccount as string.
     */
    public String getParentAccount() {
        return parentAccount;
    }

    /**
     * Sets the name of parent account.
     *
     * @param parentAccount to set the parent name.
     */
    public void setParentAccount(final String parentAccount) {
        this.parentAccount = parentAccount;
    }

    /**
     * Returns the account number.
     *
     * @return the account number as string.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account number.
     *
     * @param accountNumber to set the number of account.
     */
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the account site.
     *
     * @return the accountSite as string.
     */
    public String getAccountSite() {
        return accountSite;
    }

    /**
     * Sets the account site of a account.
     *
     * @param accountSite as string.
     */
    public void setAccountSite(final String accountSite) {
        this.accountSite = accountSite;
    }

    /**
     * Returns the type of a account.
     *
     * @return type as string.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of an account.
     *
     * @param type as string.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Returns the industry type of an account.
     *
     * @return industry as string.
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the industry type of an account.
     *
     * @param industry to set in account.
     */
    public void setIndustry(final String industry) {
        this.industry = industry;
    }

    /**
     * Returns the annual revenue of an account.
     *
     * @return annual revenue as string.
     */
    public String getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Sets the annual revenue of an account.
     *
     * @param annualRevenue to set in account.
     */
    public void setAnnualRevenue(final String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    /**
     * Returns the rating type of an account.
     *
     * @return rating as string.
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the rating type of an account.
     *
     * @param rating type to set in account.
     */
    public void setRating(final String rating) {
        this.rating = rating;
    }

    /**
     * Returns an number phone the account.
     *
     * @return phone as string.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the number phone od account.
     *
     * @param phone to set in account.
     */
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * Returns the number fax of account.
     *
     * @return fax as string.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Set el number fax of account.
     *
     * @param fax to set in account.
     */
    public void setFax(final String fax) {
        this.fax = fax;
    }

    /**
     * Returns the website of account.
     *
     * @return website as string.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the website of account.
     *
     * @param website to set in account.
     */
    public void setWebsite(final String website) {
        this.website = website;
    }

    /**
     * Returns the value of ticker symbol of account.
     *
     * @return tickers ymbol as string.
     */
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Sets the ticker symbol of account.
     *
     * @param tickerSymbol to set in account.
     */
    public void setTickerSymbol(final String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    /**
     * Returns the value ownership type of account.
     *
     * @return ownership as string.
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the ownership type of account.
     *
     * @param ownership to set in account.
     */
    public void setOwnership(final String ownership) {
        this.ownership = ownership;
    }

    /**
     * Returns the cant of employees of an account.
     *
     * @return employees as string.
     */
    public String getEmployees() {
        return employees;
    }

    /**
     * Sets the cant of employees of an account.
     *
     * @param employees to set the cant.
     */
    public void setEmployees(final String employees) {
        this.employees = employees;
    }

    /**
     * Returns the SIC Code of account.
     *
     * @return SIC code as string.
     */
    public String getsICCode() {
        return sICCode;
    }

    /**
     * Sets the SIC Code of account.
     *
     * @param sICCode to set in account.
     */
    public void setsICCode(final String sICCode) {
        this.sICCode = sICCode;
    }

    /**
     * Returns the billing Street of account.
     *
     * @return billing Street as string.
     */
    public String getBillingStreet() {
        return billingStreet;
    }

    /**
     * Sets the billingStreet of account.
     *
     * @param billingStreet to set in account.
     */
    public void setBillingStreet(final String billingStreet) {
        this.billingStreet = billingStreet;
    }

    /**
     * Returns the billingZip  Or Postal Code of account.
     *
     * @return billing Zip Or Postal Code as string.
     */
    public String getBillingZipOrPostalCode() {
        return billingZipOrPostalCode;
    }

    /**
     * Sets the billing Zip Or Postal Code of account.
     *
     * @param billingZipOrPostalCode to set in account.
     */
    public void setBillingZipOrPostalCode(final String billingZipOrPostalCode) {
        this.billingZipOrPostalCode = billingZipOrPostalCode;
    }

    /**
     * Returns the billing City of account.
     *
     * @return billing City as string.
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the billing City of account.
     *
     * @param billingCity to set in account.
     */
    public void setBillingCity(final String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Returns the billing State Or Province of account.
     *
     * @return billing State Or Province as string.
     */
    public String getBillingStateOrProvince() {
        return billingStateOrProvince;
    }

    /**
     * Sets the billing State Or Province of account.
     *
     * @param billingStateOrProvince to set in account.
     */
    public void setBillingStateOrProvince(final String billingStateOrProvince) {
        this.billingStateOrProvince = billingStateOrProvince;
    }

    /**
     * Returns the billing Country of account.
     *
     * @return billing Country as string.
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the billing Country of account.
     *
     * @param billingCountry to set in account.
     */
    public void setBillingCountry(final String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * Returns the shipping Street of account.
     *
     * @return shipping Street as string.
     */
    public String getShippingStreet() {
        return shippingStreet;
    }

    /**
     * Sets the shipping Street of account.
     *
     * @param shippingStreet to set in account.
     */
    public void setShippingStreet(final String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    /**
     * Returns the shipping Zip Or Postal Code of account.
     *
     * @return shipping Zip Or Postal Code as string.
     */
    public String getShippingZipOrPostalCode() {
        return shippingZipOrPostalCode;
    }

    /**
     * Sets the shipping Zip Or Postal Code of account.
     *
     * @param shippingZipOrPostalCode to set in account.
     */
    public void setShippingZipOrPostalCode(final String shippingZipOrPostalCode) {
        this.shippingZipOrPostalCode = shippingZipOrPostalCode;
    }

    /**
     * Returns the shipping City of account.
     *
     * @return shipping City as string.
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the shipping City of account.
     *
     * @param shippingCity to set in account.
     */
    public void setShippingCity(final String shippingCity) {
        this.shippingCity = shippingCity;
    }

    /**
     * Returns the shipping State Or Province of account.
     *
     * @return shipping State Or Province as string.
     */
    public String getShippingStateOrProvince() {
        return shippingStateOrProvince;
    }

    /**
     * Sets the shipping State Or Province of account.
     *
     * @param shippingStateOrProvince to set in account.
     */
    public void setShippingStateOrProvince(final String shippingStateOrProvince) {
        this.shippingStateOrProvince = shippingStateOrProvince;
    }

    /**
     * Returns the shipping Country of account.
     *
     * @return shipping Country as string.
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the shipping Country of account.
     *
     * @param shippingCountry to set in account.
     */
    public void setShippingCountry(final String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    /**
     * Returns customer Priority of account.
     *
     * @return customer Priority as string.
     */
    public String getCustomerPriority() {
        return customerPriority;
    }

    /**
     * Sets the customer Priority of account.
     *
     * @param customerPriority to set in account.
     */
    public void setCustomerPriority(final String customerPriority) {
        this.customerPriority = customerPriority;
    }

    /**
     * Returns SLA Expiration Date of account.
     *
     * @return SLA Expiration Date as string.
     */
    public String getsLAExpirationDate() {
        return sLAExpirationDate;
    }

    /**
     * Sets the SLA Expiration Date of account.
     *
     * @param sLAExpirationDate to set in account.
     */
    public void setsLAExpirationDate(final String sLAExpirationDate) {
        this.sLAExpirationDate = sLAExpirationDate;
    }

    /**
     * Returns number Of Locations of account.
     *
     * @return number Of Locations as string.
     */
    public String getNumberOfLocations() {
        return numberOfLocations;
    }

    /**
     * Sets the number Of Locations of account.
     *
     * @param numberOfLocations to set in account.
     */
    public void setNumberOfLocations(final String numberOfLocations) {
        this.numberOfLocations = numberOfLocations;
    }

    /**
     * Returns active of account.
     *
     * @return active as string.
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the active of account.
     *
     * @param active to set in account.
     */
    public void setActive(final String active) {
        this.active = active;
    }

    /**
     * Returns SLA of account.
     *
     * @return SLA as string.
     */
    public String getsLA() {
        return sLA;
    }

    /**
     * Sets the SLA of account.
     *
     * @param sLA to set in account.
     */
    public void setsLA(final String sLA) {
        this.sLA = sLA;
    }

    /**
     * Returns SLA Serial Number of account.
     *
     * @return SLA Serial Number as string.
     */
    public String getsLASerialNumber() {
        return sLASerialNumber;
    }

    /**
     * Sets the SLA Serial Number of account.
     *
     * @param sLASerialNumber to set in account.
     */
    public void setsLASerialNumber(final String sLASerialNumber) {
        this.sLASerialNumber = sLASerialNumber;
    }

    /**
     * Returns upsell Opportunity of account.
     *
     * @return upsell Opportunity as string.
     */
    public String getUpsellOpportunity() {
        return upsellOpportunity;
    }

    /**
     * Sets the upsell Opportunity of account.
     *
     * @param upsellOpportunity to set in account.
     */
    public void setUpsellOpportunity(final String upsellOpportunity) {
        this.upsellOpportunity = upsellOpportunity;
    }

    /**
     * Returns description of account.
     *
     * @return description as string.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of account.
     *
     * @param description to set in account.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Sets the values of an Account sending a map with the information to set.
     *
     * @param accountMap to set the information.
     */
    public void setAccountInformation(final Map<String, String> accountMap) {
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
        strategyMap.put(NAME_ACCOUNT, () -> setAccountName(accountMap.get(NAME_ACCOUNT)));
        strategyMap.put(PARENT_ACCOUNT, () -> setParentAccount(accountMap.get(PARENT_ACCOUNT)));
        strategyMap.put(ACCOUNT_NUMBER, () -> setAccountNumber(accountMap.get(ACCOUNT_NUMBER)));
        strategyMap.put(ACCOUNT_SITE, () -> setAccountSite(accountMap.get(ACCOUNT_SITE)));
        strategyMap.put(TYPE, () -> setType(accountMap.get(TYPE)));
        strategyMap.put(INDUSTRY, () -> setIndustry(accountMap.get(INDUSTRY)));
        strategyMap.put(ANNUAL_REVENUE, () -> setAnnualRevenue(accountMap.get(ANNUAL_REVENUE)));
        strategyMap.put(RATING, () -> setRating(accountMap.get(RATING)));
        strategyMap.put(PHONE, () -> setPhone(accountMap.get(PHONE)));
        strategyMap.put(FAX, () -> setFax(accountMap.get(FAX)));
        strategyMap.put(WEBSITE, () -> setWebsite(accountMap.get(WEBSITE)));
        strategyMap.put(TICKER_SYMBOL, () -> setTickerSymbol(accountMap.get(TICKER_SYMBOL)));
        strategyMap.put(OWNERSHIP, () -> setOwnership(accountMap.get(OWNERSHIP)));
        strategyMap.put(EMPLOYEES, () -> setEmployees(accountMap.get(EMPLOYEES)));
        strategyMap.put(SIC_CODE, () -> setsICCode(accountMap.get(SIC_CODE)));
        strategyMap.put(BILLING_STREET, () -> setBillingStreet(accountMap.get(BILLING_STREET)));
        strategyMap.put(BILLING_ZIP_POSTAL_CODE, () -> setBillingZipOrPostalCode(
                accountMap.get(BILLING_ZIP_POSTAL_CODE)));
        strategyMap.put(BILLING_CITY, () -> setBillingCity(accountMap.get(BILLING_CITY)));
        strategyMap.put(BILLING_STATE_PROVINCE, () -> setBillingStateOrProvince(
                accountMap.get(BILLING_STATE_PROVINCE)));
        strategyMap.put(BILLING_COUNTRY, () -> setBillingCountry(accountMap.get(BILLING_COUNTRY)));
        strategyMap.put(SHIPPING_STREET, () -> setShippingStreet(accountMap.get(SHIPPING_STREET)));
        strategyMap.put(SHIPPING_ZIP_POSTAL_CODE, () -> setShippingZipOrPostalCode(
                accountMap.get(SHIPPING_ZIP_POSTAL_CODE)));
        strategyMap.put(SHIPPING_CITY, () -> setShippingCity(accountMap.get(SHIPPING_CITY)));
        strategyMap.put(SHIPPING_STATE_PROVINCE, () -> setShippingStateOrProvince(
                accountMap.get(SHIPPING_STATE_PROVINCE)));
        strategyMap.put(SHIPPING_COUNTRY, () -> setShippingCountry(accountMap.get(SHIPPING_COUNTRY)));
        strategyMap.put(CUSTOMER_PRIORITY, () -> setCustomerPriority(accountMap.get(CUSTOMER_PRIORITY)));
        strategyMap.put(SLA_EXPIRATION_DATE, () -> setsLAExpirationDate(accountMap.get(SLA_EXPIRATION_DATE)));
        strategyMap.put(NUMBER_OF_LOCATIONS, () -> setNumberOfLocations(accountMap.get(NUMBER_OF_LOCATIONS)));
        strategyMap.put(ACTIVE, () -> setActive(accountMap.get(ACTIVE)));
        strategyMap.put(SLA, () -> setsLA(accountMap.get(SLA)));
        strategyMap.put(SLA_SERIAL_NUMBER, () -> setsLASerialNumber(accountMap.get(SLA_SERIAL_NUMBER)));
        strategyMap.put(UPSELL_OPPORTUNITY, () -> setUpsellOpportunity(accountMap.get(UPSELL_OPPORTUNITY)));
        strategyMap.put(DESCRIPTION_ACCOUNT, () -> setDescription(accountMap.get(DESCRIPTION_ACCOUNT)));
        return strategyMap;
    }
}
