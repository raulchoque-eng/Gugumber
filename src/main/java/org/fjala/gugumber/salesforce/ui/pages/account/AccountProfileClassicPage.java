/*
 * @(#) AccountProfileClassicPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 *  with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * AccountProfileClassicPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountProfileClassicPage extends AccountProfilePageAbstract {

    /**
     * Web element for the body of the profile account.
     */
    @FindBy(id = "bodyCell")
    private WebElement bodyProfile;

    /**
     * Web element for the title of account on profile account.
     */
    @FindBy(css = "h2[class='topName']")
    private WebElement accountTitle;

    /**
     * Web element for the delete button of top.
     */
    @FindBy(css = "td[id='topButtonRow'] input[title='Delete']")
    private WebElement deleteTopBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(bodyProfile));
    }

    /**
     * Returns the text of the name account from profile header.
     *
     * @return the account name as string.
     */
    @Override
    public String getNameAccountFromProfileHeader() {
        return accountTitle.getText();
    }

    /**
     * Returns an account details for classic layout.
     *
     * @return an account details.
     */
    @Override
    public AccountDetailsAbstract getAccountDetails() {
        return new AccountDetailsClassic();
    }

    /**
     * Returns the accounts classic page after deleting an account.
     *
     * @return Accounts classic page.
     */
    @Override
    public AccountsPageAbstract clickOnDeleteBtn() {
        deleteTopBtn.click();
        driver.switchTo().alert().accept();
        return new AccountsClassicPage();
    }
}
