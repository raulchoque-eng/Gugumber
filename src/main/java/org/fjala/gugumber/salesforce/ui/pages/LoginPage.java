/*
 * @(#) LoginPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 *
 */

package org.fjala.gugumber.salesforce.ui.pages;

import org.fjala.gugumber.salesforce.common.ReaderApplicationProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * LoginPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class LoginPage extends BasePage {

    /**
     * Constant for the title of home page.
     */
    public static final String HOME_PAGE_TITLE = "Home Page ~ Salesforce - Developer Edition";

    /**
     * Web element for the user name text-box.
     */
    @FindBy(id = "username")
    private WebElement userNameTxtb;

    /**
     * Web element for the password text-box.
     */
    @FindBy(id = "password")
    private WebElement passwordTxtb;

    /**
     * Web element for the login button.
     */
    @FindBy(id = "Login")
    private WebElement loginBtn;

    /**
     * Web element for login form to use in the wait.
     */
    @FindBy(id = "theloginform")
    private WebElement loginForm;

    /**
     * Waits until page object is loaded.
     */
    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginForm));
    }

    /**
     * Log in in the application.
     *
     * @param userName of the user.
     * @param password of the user.
     */
    public void login(final String userName, final String password) {
        setUserName(ReaderApplicationProperties.getInstance().getAppProperties().get(userName));
        setPassword(ReaderApplicationProperties.getInstance().getAppProperties().get(password));
        clickSignInBtn();
        wait.until(ExpectedConditions.titleIs(HOME_PAGE_TITLE));
    }

    /**
     * Sets the user name in the text-box of the login form.
     *
     * @param userName for the log in.
     */
    public void setUserName(final String userName) {
        userNameTxtb.sendKeys(userName);
    }

    /**
     * Sets the password in the text-box of the log in form.
     *
     * @param password for the log in.
     */
    public void setPassword(final String password) {
        passwordTxtb.sendKeys(password);
    }

    /**
     * Clicks on sing in button.
     */
    public void clickSignInBtn() {
        loginBtn.click();
    }
}

