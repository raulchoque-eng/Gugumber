/*
 * @(#) LoginSteps.java Copyright (c) 2019 Jala Foundation.
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

<<<<<<< HEAD

import cucumber.api.java.en.And;
=======
>>>>>>> e9b7db69858b721b0e72be0760c02bb62e013266
import cucumber.api.java.en.Given;
import org.fjala.gugumber.salesforce.ui.LoginPage;
import org.fjala.gugumber.salesforce.ui.PageTransporter;
import org.fjala.gugumber.salesforce.ui.pages.HomePage;

/**
 * LoginSteps class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class LoginSteps {
    private PageTransporter pageTransporter = PageTransporter.getInstance();
    private LoginPage loginPage;
    private HomePage homePage;


    @Given("^I am logged in SalesForce with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void logInWithUsernameAdminAndPasswordAdmin(String username, String password) {
        loginPage = pageTransporter.navigateToLoginPage();
        loginPage.login(username, password);
        homePage = pageTransporter.navigateToHomePage();
    }

    @And("^I navigate home page$")
    public void navigateHomePage() {
        homePage = pageTransporter.navigateToHomePage();
        context.setHomePage(homePage);
    }
}



