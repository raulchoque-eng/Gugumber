/*
 * @(#) ContactProfilePage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;

/**
 * ContactProfilePage class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public abstract class ContactProfilePage extends BasePage {

    /**
     * Returns the Last Name of contact from a header profile.
     *
     * @return the last name of contact as string.
     */
    public abstract String getFullNameTitleContact();

    /**
     * Returns the icon of contact from a header profile.
     *
     * @return the icon of contact.
     */
    public abstract boolean isTheNewContact();
}