/*
 * @(#) AccountProfilePageAbstract.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.account;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;
import org.fjala.gugumber.salesforce.ui.pages.utils.UrlComponents;

/**
 * AccountProfilePageAbstract abstract class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public abstract class AccountProfilePageAbstract extends BasePage {

    /**
     * Returns the Name of account from a header profile.
     *
     * @return the name of account as string.
     */
    public abstract String getNameAccountFromProfileHeader();

    /**
     * Returns an account details according the page layout.
     *
     * @return an account details.
     */
    public abstract AccountDetailsAbstract getAccountDetails();

    /**
     * Return the id from url.
     *
     * @return id as string.
     */
    public String getIdFromUrl() {
        return UrlComponents.splitUrlToId(driver.getCurrentUrl());
    }

    /**
     * Returns the accounts page after deleting an account.
     *
     * @return Accounts page.
     */
    public abstract AccountsPageAbstract clickOnDeleteBtn();
}
