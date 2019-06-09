/*
 * @(#) ContactPageAbstract.java Copyright (c) 2019 Jala Foundation.
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

import java.util.List;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;

/**
 * ContactPageAbstract class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public abstract class ContactPageAbstract extends BasePage {

    /**
     * Returns an Contact Form page after clicking on new button.
     *
     * @return an Contact form page.
     */
    public abstract ContactFormAbstract clickNewContact();

    /**
     * Returns a list with last name from the contact page.
     *
     * @return a list of last names contact as string.
     */
    public abstract List<String> getListOfContactsName();

    /**
     * Gets check the contact list.
     *
     * @param name string.
     * @return boolean.
     */
    public abstract boolean checkContactList(String name);
}
