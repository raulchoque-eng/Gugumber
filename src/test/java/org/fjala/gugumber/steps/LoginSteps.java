/*
<<<<<<< HEAD
 * @(#) WebDriveFactory.java Copyright (c) 2019 Jala Foundation.
=======
 * @(#) LoginSteps.java Copyright (c) 2019 Jala Foundation.
>>>>>>> 42061750e865a676850d781025c2865558ebac05
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
<<<<<<< HEAD
 */

package org.fjala.gugumber.steps;import cucumber.api.java.en.Given;
=======
 *
 */

package org.fjala.gugumber.steps;

import cucumber.api.java.en.When;
>>>>>>> 42061750e865a676850d781025c2865558ebac05
import org.fjala.gugumber.salesforce.ui.LoginPage;
import org.fjala.gugumber.salesforce.ui.PageTransporter;

/**
 * LoginSteps class.
 *
<<<<<<< HEAD
 * @author Cxrisstian
 * @version 0.0.1
 */
public class LoginSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();

    // Pages
    private LoginPage loginPage;

    @Given("^I log in with a valid username and password$")
    public void logIn() {
        loginPage = pageTransporter.navigateToLoginPage();
        loginPage.login("usernameAdmin", "passwordAdmin");
    }
}
=======
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class LoginSteps {
    PageTransporter pageTransporter = PageTransporter.getInstance();

    LoginPage loginPage;

    @When("^I am logged in SalesForce with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void logInWithUsernameAdminAndPasswordAdmin(String username, String password) {
        loginPage = pageTransporter.navigateToLoginPage();
        loginPage.login(username, password);
    }
}
>>>>>>> 42061750e865a676850d781025c2865558ebac05
