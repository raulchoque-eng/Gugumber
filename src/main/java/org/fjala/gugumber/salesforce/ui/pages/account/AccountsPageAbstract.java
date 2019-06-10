/*
 * @(#) AccountsPageAbstract.java Copyright (c) 2019 Jala Foundation.
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

import java.util.List;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;

/**
 * AccountsPageAbstract class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public abstract class AccountsPageAbstract extends BasePage {

    /**
     * Returns an Account Form page after clicking on new button.
     *
     * @return an account form page.
     */
    public abstract AccountFormAbstract clickNewBtn();

    /**
     * Returns a list with name accounts from the accounts page.
     *
     * @return a list of names account as string.
     */
    public abstract List<String> getListOfAccountsName();

    /**
     * Returns the account page by id of an account.
     *
     * @param id of the account.
     * @return Account page.
     */
    public abstract AccountProfilePageAbstract openAccount(String id);
}
