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
 */

package org.fjala.gugumber.salesforce.ui;

import java.util.Map;
import org.fjala.gugumber.salesforce.BasePage;
import org.fjala.gugumber.salesforce.common.ReaderApplicationProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * LoginPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class LoginPage extends BasePage {

    private Map<String,String> dataUser = ReaderApplicationProperties.getInstance()
        .getApplicationProperties();
    private String userName = dataUser.get("username.admin");
    private String password = dataUser.get("password.admin");
    @FindBy(id = "wrapper")
    private WebElement loginPnl;
    @FindBy(id = "idcard-identity")
    private WebElement identityTxtb;
    @FindBy(id = "password")
    private WebElement passwordTxtb;
    @FindBy(id = "Login")
    private WebElement loginBtn;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginPnl));
    }

    /**
     *
     */
    public void login() {
        setIdentity(userName);
        setPassword(password);
        loginBtn.click();
    }

    public void setIdentity(String identityName) {
        identityTxtb.clear();
        identityTxtb.sendKeys(identityName);
    }

    public void setPassword(String password) {
        passwordTxtb.clear();
        passwordTxtb.sendKeys(password);
    }
}

