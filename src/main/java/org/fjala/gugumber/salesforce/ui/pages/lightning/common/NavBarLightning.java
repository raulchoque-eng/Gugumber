/*
 * @(#) NavBarLightning.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.lightning.common;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.lightning.contact.ContactLightningPageAbstract;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * NavBarLightning class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class NavBarLightning extends NavBar {

    /**
     * Web element of tab-bar.
     */
    @FindBy(xpath = "//div[@class='slds-context-bar']")
    private WebElement tabBar;

    /**
     * Web element for the account option.
     */
    @FindBy(xpath = "//a[@title='Accounts']")
    private WebElement accountsOption;

    /**
     * Web element for the contact option.
     */
    @FindBy(css = "[data-id='Contact']")
    private WebElement contactTab;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(tabBar));
    }

//    /**
//     * Returns the account lightning page after clicking on account option.
//     *
//     * @return a account lightning page.
//     */
//    @Override
//    public AccountsLightningPage clickAccountsOption() {
//        accountsOption.click();
//        return new AccountsLightningPage();
//    }

    /**
     * Contact menu button.
     */
    public void clickContactOption() {
        contactTab.click();
    }

    /**
     * Returns contact lightning page after clicking in contact option.
     *
     * @return Contact lightning Page.
     */
    @Override
    public ContactPageAbstract goToContactsPage() {
        clickContactOption();
        return new ContactLightningPageAbstract();
    }
}
