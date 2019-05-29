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

package org.fjala.gugumber.salesforce.ui.pages.abstracts.common;

import org.fjala.gugumber.salesforce.ui.BasePage;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPageAbstract;

/**
 * NavBar class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public abstract class NavBar extends BasePage {

//    /**
//     * Returns Account page after clicking on account option.
//     *
//     * @return an Account page.
//     */
//    public abstract AccountsPage clickAccountsOption();

    /**
     * Returns Account page after clicking on contact option.
     *
     * @return an Account page.
     */
    public abstract ContactPageAbstract goToContactPage();

}
