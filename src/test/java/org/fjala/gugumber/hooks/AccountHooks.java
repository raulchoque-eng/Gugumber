/*
 * @(#) AccountHooks.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.hooks;

import cucumber.api.java.After;
import org.fjala.gugumber.salesforce.api.AccountAPI;
import org.fjala.gugumber.salesforce.entities.Account;
import org.fjala.gugumber.salesforce.entities.Context;

/**
 * AccountHooks class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountHooks {

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for account.
     */
    private Account account;

    /**
     * Constructor of account hooks sending the context.
     *
     * @param context init the context.
     */
    public AccountHooks(Context context) {
        this.context = context;
        account = context.getAccount();
    }

    /**
     * Deletes an account by id after scenario.
     */
    @After("@delete-account")
    public void afterScenario() {
        AccountAPI.getInstance().deleteAccount(account.getId());
    }

}
