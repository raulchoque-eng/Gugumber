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

import org.fjala.gugumber.salesforce.ui.pages.HomePage;
import org.fjala.gugumber.salesforce.ui.pages.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPage;
import org.fjala.gugumber.salesforce.ui.pages.classic.HomeClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.classic.NavBarClassic;
import org.fjala.gugumber.salesforce.ui.pages.classic.contact.ContactClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.HomeLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.NavBarLightning;
import org.fjala.gugumber.salesforce.ui.pages.lightning.contact.ContactLightningPage;

/**
 * PageLayoutFactory class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class PageLayoutFactory {

    /**
     * Gets the home page according the page layout.
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

    public static NavBar getNavigateToNavBar(final PageLayoutType type) {
        final NavBar navBar;
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

    public static ContactPage getNavigateContact(final PageLayoutType type) {
        final ContactPage contactPage;
        switch (type) {
            case CLASSIC:
                contactPage = new ContactClassicPage();
                break;
            case LIGHTNING:
                contactPage = new ContactLightningPage();
                break;
            default:
                contactPage = new ContactLightningPage();
                break;
        }
        return contactPage;
    }
}
