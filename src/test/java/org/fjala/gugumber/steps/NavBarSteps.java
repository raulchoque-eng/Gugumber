/*
 * @(#) NavBarSteps.java Copyright (c) 2019 Jala Foundation.
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
import org.fjala.gugumber.salesforce.ui.pages.AccountsPage;
import org.fjala.gugumber.salesforce.ui.pages.NavBar;

/**
 * NavBarSteps class for steps definition.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class NavBarSteps {

    private NavBar navBar;
    private AccountsPage accountsPage;

    @When("^I navigate to the Accounts page$")
    public void navigateToAccountsPage() {
        accountsPage = navBar.clickAccountsOption();
    }
}
