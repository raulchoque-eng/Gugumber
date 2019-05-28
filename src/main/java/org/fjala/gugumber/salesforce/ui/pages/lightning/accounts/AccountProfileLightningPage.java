/*
 * @(#) AccountProfileLightningPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.lightning.accounts;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.account.AccountProfilePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * AccountProfileLightningPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountProfileLightningPage extends AccountProfilePage {

    @FindBy(css = "div[class='flexipagePage oneRecordHomeFlexipage']")
    private WebElement accountProfile;

    @FindBy(css = "span[class='custom-truncate uiOutputText']")
    private WebElement accountTitle;
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(accountProfile));
    }

    @Override
    public String getNameAccount() {
        return accountTitle.getText();
    }
}
