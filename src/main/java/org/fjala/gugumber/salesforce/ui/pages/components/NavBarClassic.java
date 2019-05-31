/*
 * @(#) GeneratorReport.java Copyright (c) 2019 Jala Foundation.
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

import org.fjala.gugumber.salesforce.ui.pages.account.AccountsClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.account.AccountsPage;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactClassicPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactLightningPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactPageAbstract;
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
    @FindBy(xpath = "//li[@id='Account_Tab']//a")
    private WebElement accountOption;

    /**
     * Web element for the contact option.
     */
    @FindBy(id = "Contact_Tab")
    private WebElement contactMenuBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(tabBar));
    }

    /**
     * Contact menu button.
     */
    private void clickContactOption() {
        contactMenuBtn.click();
    }

    /**
     * Click in the contact button.
     * @return Contact Lightning Page.
     */
    @Override
    public ContactClassicPageAbstract goToContactPage() {
        clickContactOption();
        return new ContactClassicPageAbstract();
    }

    /**
     * Returns the account classic page after clicking on account option.
     *
     * @return a account classic page.
     */
    @Override
    public AccountsPage clickAccountsOption() {
        accountOption.click();
        return new AccountsClassicPage();
    }

}
