/*
 * @(#) AccountsLightningPage.java Copyright (c) 2019 Jala Foundation.
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

import org.fjala.gugumber.salesforce.ui.pages.abstracts.account.AccountForm;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.account.AccountsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

/**
 * AccountsLightningPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountsLightningPage extends AccountsPage {

    @FindBy(xpath = "//div[@data-aura-class='forceListViewManagerHeader']")
    private WebElement headerList;

    @FindBy(xpath = "//a[@title='New']")
    private WebElement newAccoutnBtn;

    @FindBy(css = "a[data-aura-class='forceOutputLookup']")
    private List<WebElement> AccountsNameList;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(headerList));
    }

    @Override
    public AccountForm clickNewBtn() {
        newAccoutnBtn.click();
        return new AccountLightningForm();
    }

    @Override
    public List<String> getListOfAccountsName() {
        List<String> accountsName = new ArrayList<>();
        for (WebElement accountName : AccountsNameList) {
            accountsName.add(accountName.getText());
        }
        return accountsName;
    }
}
