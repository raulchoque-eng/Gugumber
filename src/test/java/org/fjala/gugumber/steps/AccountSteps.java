/*
 * @(#) AccountSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.steps;

import cucumber.api.java.en.And;
import org.fjala.gugumber.salesforce.entities.Account;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.ui.PageTransporter;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.account.AccountForm;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.account.AccountsPage;

import java.util.Map;

/**
 * AccountSteps class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountSteps {
    private AccountsPage accountsPage;
    private AccountForm accountForm;
    private PageTransporter pageTransporter = PageTransporter.getInstance();
    Context context;

    public AccountSteps(Context context) {
        this.context = context;
    }

    @And("^I create a new Account with the following information$")
    public void createANewAccountWithTheFollowingInformation(Map<String,String> accountMap) {
        context.getAccount().setAccountInformation(accountMap);
        accountsPage = pageTransporter.getAccountPage();
        accountForm = accountsPage.clickNewBtn();
        accountForm.enterNameAccount(context.getAccount().getNameAccount());
        accountForm.clickOnSaveBtnFoot();
    }
}