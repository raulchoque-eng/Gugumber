/*
 * @(#) BaseAppSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.steps;

import cucumber.api.java.en.When;
import org.fjala.gugumber.salesforce.ui.PageLayoutFactory;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountsPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.app.BaseAppPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactPageAbstract;

/**
 * BaseAppSteps class for steps definition.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class BaseAppSteps {

    /**
     * Variable for the contact page.
     */
    private ContactPageAbstract contactPage;

    /**
     * Variable for the accounts page.
     */
    private AccountsPageAbstract accountsPage;

    /**
     * Variable for the base app page.
     */
    private BaseAppPageAbstract baseAppPage;

    /**
     * Opens the contacts page.
     */
    @When("^I go to the Contacts page$")
    public void goToTheContactsPage() {
        baseAppPage = PageLayoutFactory.getBaseAppPage();
        contactPage = baseAppPage.getNavBar().goToContactPage();
    }

    /**
     * Opens the accounts page.
     */
    @When("^I open the Accounts page$")
    public void openTheAccountsPage() {
        baseAppPage = PageLayoutFactory.getBaseAppPage();
        accountsPage = baseAppPage.getNavBar().clickAccountsOption();
    }
}
