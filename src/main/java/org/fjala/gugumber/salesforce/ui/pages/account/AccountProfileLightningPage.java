/*
 * @(#) AccountProfileLightningPage.java Copyright (c) 2019 Jala Foundation.
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
 * AccountProfileLightningPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountProfileLightningPage extends AccountProfilePageAbstract {

    /**
     * Web element for the body of profile account.
     */
    @FindBy(css = "div[class='flexipagePage oneRecordHomeFlexipage']")
    private WebElement accountProfile;

    /**
     * Web element for the account name of the profile header.
     */
    @FindBy(css = "span[class='custom-truncate uiOutputText']")
    private WebElement accountTitle;

    /**
     * Web element for details tab of an account.
     */
    @FindBy(css = "a[data-tab-name='detailTab']")
    private WebElement detaildTab;

    /**
     * Web element for more options button.
     */
    @FindBy(css = "a[title='Show 7 more actions']")
    private WebElement moreoptions;

    /**
     * Web element for delete options.
     */
    @FindBy(css = "a[title='Delete']")
    private WebElement optionDelete;

    /**
     * Web element for delete button of modal.
     */
    @FindBy(css = "button[title='Delete']")
    private WebElement deleteModalbtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(accountProfile));
    }

    /**
     * Return the text of name account from the profile header.
     *
     * @return the name account as string.
     */
    @Override
    public String getNameAccountFromProfileHeader() {
        return accountTitle.getText();
    }

    /**
     * Returns an account details for the lightning layout.
     *
     * @return an account details.
     */
    @Override
    public AccountDetailsAbstract getAccountDetails() {
        detaildTab.click();
        return new AccountDetailsLightning();
    }

    /**
     * Returns the accounts lightning page after deleting an account.
     *
     * @return Accounts lightning page.
     */
    @Override
    public AccountsPageAbstract clickOnDeleteBtn() {
        moreoptions.click();
        optionDelete.click();
        deleteModalbtn.click();
        return new AccountsLightningPage();
    }
}
