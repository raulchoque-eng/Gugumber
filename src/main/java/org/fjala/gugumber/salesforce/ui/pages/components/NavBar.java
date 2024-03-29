/*
 * @(#) NavBar.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.components;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountsPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactPageAbstract;

/**
 * NavBar class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public abstract class NavBar extends BasePage {

    /**
     * Returns Contact page after clicking on contact option.
     *
     * @return an Contact page.
     */
    public abstract ContactPageAbstract goToContactPage();

    /**
     * Returns Account page after clicking on account option.
     *
     * @return an Account page.
     */
    public abstract AccountsPageAbstract clickAccountsOption();
}
