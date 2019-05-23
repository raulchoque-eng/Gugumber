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


import cucumber.api.java.en.Given;
import org.fjala.gugumber.salesforce.ui.LoginPage;
import org.fjala.gugumber.salesforce.ui.PageTransporter;

/**
 * LoginSteps class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class LoginSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();
    private LoginPage loginPage;

    @Given("^I log in with a valid username and password$")
    public void logInWithAValidUsernameAndPassword() {
        loginPage = pageTransporter.navigateToLoginPage();
//        loginPage.login("usernameAdmin","passwordAdmin");
    }
}
