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

package org.fjala.gugumber.salesforce.ui;

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
    @FindBy(id = "username")
    private WebElement userNameTxtBox;

    @FindBy(id = "password")
    private WebElement passwordTxtBox;

    @FindBy(id = "Login")
    private WebElement loginBtn;

    @FindBy(id = "theloginform")
    private WebElement loginForm;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginForm));
    }
    public void login(String userName, String password){
        setUserName(ReaderApplicationProperties.getInstance().getAppProperties().get(userName));
        setPassword(ReaderApplicationProperties.getInstance().getAppProperties().get(password));
        clickNextSignInBtn();
    }

    public void setUserName(String userName) {
        userNameTxtBox.sendKeys(userName);
    }

    public void setPassword(String password) {
        passwordTxtBox.sendKeys(password);
    }

    public void clickNextSignInBtn() {
        loginBtn.click();
    }
}
