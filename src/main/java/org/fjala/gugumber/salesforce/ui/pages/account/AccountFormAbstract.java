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

import static org.fjala.gugumber.salesforce.keys.AccountKeys.*;

import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;

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

    public abstract void setParentAccountTxtb(String parentAccount);

    public abstract void setAccountNumberOnTxtb(String accountNumber);

    public abstract void setAccountSiteOnTxtb(String accountSite);

    public abstract void setTypeOnCmbb(String type);

    public abstract void setIndustryOnCmbb(String industry);

    public abstract void setAnnualRevenueOnTxtb(String annualRevenue);

    public abstract void setRatingOnCmbb(String rating);

    public abstract void setPhoneOnTxtb(String phone);

    public abstract void setFaxOnTxtb(String fax);

    public abstract void setWebsiteOnTxtb(String website);

    public abstract void setTickerSymbolOnTxtb(String tickerSymbol);

    public abstract void setOwnershipCmbb(String ownership);

    public abstract void setEmployeesOnTxtb(String employees);

    public abstract void setsICCodeOnTxtb(String sICCode);

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
        return strategyMap;
    }
}
