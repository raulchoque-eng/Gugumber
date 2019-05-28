/*
 * @(#) NavBarClassic.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.classic;

import org.fjala.gugumber.salesforce.ui.pages.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.classic.accounts.AccountsClassicPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * NavBarClassic class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class NavBarClassic extends NavBar {

    /**
     * Web element of tab-bar.
     */
    @FindBy(id = "tabBar")
    private WebElement tabBar;

    /**
     * Web element for the account option.
     */
    @FindBy(id = "Account_Tab")
    private WebElement accountOption;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(tabBar));
    }

    /**
     * Returns the account classic page after clicking on account option.
     *
     * @return a account classic page.
     */
    @Override
    public AccountsClassicPage clickAccountsOption() {
        accountOption.click();
        return new AccountsClassicPage();
    }
}