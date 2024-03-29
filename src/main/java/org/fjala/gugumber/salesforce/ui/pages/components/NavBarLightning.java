/*
 * @(#) NavBarLightning.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 *  with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.components;

import org.fjala.gugumber.salesforce.ui.pages.account.AccountsLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountsPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactPageAbstract;
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
    @FindBy(xpath = "//one-app-nav-bar-item-root[@data-id='Account']")
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

    /**
     * Clicks in contact menu button.
     */
    public void openContactOption() {
        contactTab.click();
    }

    /**
     * Clicks in the contact button.
     *
     * @return Contact Lightning Page.
     */
    @Override
    public ContactPageAbstract goToContactPage() {
        openContactOption();
        return new ContactLightningPage();
    }

    /**
     * Returns the account lightning page after clicking on account option.
     *
     * @return a account lightning page.
     */
    @Override
    public AccountsPageAbstract clickAccountsOption() {
        accountsOption.click();
        return new AccountsLightningPage();
    }
}
