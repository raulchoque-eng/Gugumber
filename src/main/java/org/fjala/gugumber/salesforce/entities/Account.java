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

import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;

import static org.fjala.gugumber.salesforce.keys.AccountKeys.*;

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

    private String parentAccount;
    private String accountNumber;
    private String accountSite;
    private String type;
    private String industry;
    private String annualRevenue;
    private String rating;
    private String phone;
    private String fax;
    private String website;
    private String tickerSymbol;
    private String ownership;
    private String employees;
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

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(final String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountSite() {
        return accountSite;
    }

    public void setAccountSite(String accountSite) {
        this.accountSite = accountSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getsICCode() {
        return sICCode;
    }

    public void setsICCode(String sICCode) {
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
