/*
 * @(#) PageLayoutFactory.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.HomePage;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.account.AccountsPage;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.classic.HomeClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.classic.accounts.AccountsClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.classic.common.NavBarClassic;
import org.fjala.gugumber.salesforce.ui.pages.lightning.HomeLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.accounts.AccountsLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.common.NavBarLightning;

/**
 * PageLayoutFactory class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class PageLayoutFactory {

    public static final String MESSAGE_FOR_UNKNOWN_LAYOUT = "Unknown layout type";

    /**
     * Constructor of PageLayoutFactory.
     */
    protected PageLayoutFactory() {}

    /**
     * Returns the home page according the page layout.
     *
     * @param type of page layout.
     * @return a home page.
     */
    public static HomePage getHomePageManager(final PageLayoutType type) {
        final HomePage homePage;
        switch (type) {
            case CLASSIC:
                homePage = new HomeClassicPage();
                break;
            case LIGHTNING:
                homePage = new HomeLightningPage();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return homePage;
    }

    /**
     * Returns the navigation bar according the page layout.
     *
     * @param type of page layout.
     * @return a the navigation bar.
     */
    public static NavBar getNavBar(final PageLayoutType type) {
        final NavBar navBar;
        switch (type) {
            case CLASSIC:
                navBar = new NavBarClassic();
                break;
            case LIGHTNING:
                navBar = new NavBarLightning();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return navBar;
    }

    /**
     * Returns the accounts page bar according the page layout.
     *
     * @param type of page layout.
     * @return a the accounts page.
     */
    public static AccountsPage getAccountsPage(final PageLayoutType type) {
        final AccountsPage accountsPage;
        switch (type) {
            case CLASSIC:
                accountsPage = new AccountsClassicPage();
                break;
            case LIGHTNING:
                accountsPage = new AccountsLightningPage();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return accountsPage;
    }
}
