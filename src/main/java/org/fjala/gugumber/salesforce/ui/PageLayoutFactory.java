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
import org.fjala.gugumber.salesforce.ui.pages.classic.HomeClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.classic.NavBarClassic;
import org.fjala.gugumber.salesforce.ui.pages.classic.accounts.AccountsClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.common.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.lightning.HomeLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.NavBarLightning;
import org.fjala.gugumber.salesforce.ui.pages.lightning.accounts.AccountsLightningPage;

/**
 * PageLayoutFactory class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class PageLayoutFactory {

    private static PageLayoutType type;

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
                homePage = new HomeClassicPage();
                break;
        }
        return homePage;
    }

    /**
     * Returns the navigation bar according the page layout.
     *
     * @param type of page layout.
     * @return a the navigation bar.
     */
    public static NavBar getNavBar(PageLayoutType type) {
        NavBar navBar;
        switch (type) {
            case CLASSIC:
                navBar = new NavBarClassic();
                break;
            case LIGHTNING:
                navBar = new NavBarLightning();
                break;
            default:
                navBar = new NavBarLightning();
                break;
        }
        return navBar;
    }

    /**
     * Returns the accounts page bar according the page layout.
     *
     * @param type of page layout.
     * @return a the accounts page.
     */
    public static AccountsPage getAccountsPage(PageLayoutType type) {
        AccountsPage accountsPage;
        switch (type) {
            case CLASSIC:
                accountsPage = new AccountsClassicPage();
                break;
            case LIGHTNING:
                accountsPage = new AccountsLightningPage();
                break;
            default:
                accountsPage = new AccountsClassicPage();
                break;
        }
        return accountsPage;
    }
}
