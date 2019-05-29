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
import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.BaseAppPage;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.classic.HomeClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.classic.common.BaseAppClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.classic.contact.ContactClassicPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.lightning.HomeLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.common.BaseAppLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.contact.ContactLightningPageAbstract;

/**
 * PageLayoutFactory class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class PageLayoutFactory {

    /**
     * Constant for the page layout type.
     */
    private static final PageLayoutType PAGE_LAYOUT_TYPE = PageLayoutConfig.getPageLayoutName();

    /**
     * Constant for the message of exception.
     */
    private static final String MESSAGE_FOR_UNKNOWN_LAYOUT = "Unknown layout type";

    /**
     * Gets the home page according the page layout.
     *
     * @return a home page.
     */
    public static HomePage getHomePageManager() {
        final HomePage homePage;
        switch (PAGE_LAYOUT_TYPE) {
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
     * Gets the Base App page according the page layout.
     *
     * @return a base app page.
     */
     public static BaseAppPage getBaseAppPage() {
        final BaseAppPage baseAppPage;
        switch (PAGE_LAYOUT_TYPE) {
            case CLASSIC:
                baseAppPage = new BaseAppClassicPage();
                break;
            case LIGHTNING:
                baseAppPage = new BaseAppLightningPage();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return baseAppPage;
    }

    /**
     * Gets the navigate navigate contact according the page layout.
     *
     * @return a contact page.
     */
    public static ContactPageAbstract getContactPage() {
        final ContactPageAbstract contactPageAbstract;
        switch (PAGE_LAYOUT_TYPE) {
            case CLASSIC:
                contactPageAbstract = new ContactClassicPageAbstract();
                break;
            case LIGHTNING:
                contactPageAbstract = new ContactLightningPageAbstract();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return contactPageAbstract;
    }
}
