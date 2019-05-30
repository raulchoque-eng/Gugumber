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
import org.fjala.gugumber.salesforce.ui.pages.abstracts.account.AccountsPage;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.BaseAppPage;

/**
 * BaseAppSteps class for steps definition.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class BaseAppSteps {

    /**
     * Variable for the accounts page.
     */
    private AccountsPage accountsPage;

    /**
     * Variable for the base app page.
     */
    private BaseAppPage baseAppPage;

    /**
     * Navigates to the accounts page.
     */
    @When("^I navigate to the Accounts page$")
    public void navigateToAccountsPage() {
        baseAppPage = PageLayoutFactory.getBaseAppPage();
        accountsPage = baseAppPage.getNavBar().clickAccountsOption();
    }
}
