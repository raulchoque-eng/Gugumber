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
        return strategyMap;
    }
}
