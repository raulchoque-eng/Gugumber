/*
 * @(#) AccountsLightningPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.account;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * AccountsLightningPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountsLightningPage extends AccountsPageAbstract {

    /**
     * Web element to the header the accounts page.
     */
    @FindBy(xpath = "//div[@data-aura-class='forceListViewManagerHeader']")
    private WebElement accountsHeaderPage;

    /**
     * Web element for the button new of accounts page.
     */
    @FindBy(xpath = "//a[@title='New']")
    private WebElement newAccoutnBtn;

    /**
     * List of web elements for accounts name.
     */
    @FindBy(css = "a[class='slds-truncate outputLookupLink slds-truncate forceOutputLookup']")
    private List<WebElement> accountsNameList;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(accountsHeaderPage));
    }

    /**
     * return a new account form for the layout lightning after clicking on new button.
     *
     * @return a account lightning form.
     */
    @Override
    public AccountFormAbstract clickNewBtn() {
        newAccoutnBtn.click();
        return new AccountLightningForm();
    }

    /**
     * Returns a list with the account name from accounts page.
     *
     * @return a list with accounts names as string.
     */
    @Override
    public List<String> getListOfAccountsName() {
        wait.until(ExpectedConditions.stalenessOf(accountsNameList.get(0)));
        final List<String> accountsName = new ArrayList<>();
        try {
            for (WebElement accountName : accountsNameList) {
                accountsName.add(accountName.getText());
            }
        } catch (StaleElementReferenceException sere) {
            accountsNameList = driver.findElements(
                    By.cssSelector("a[class='slds-truncate outputLookupLink slds-truncate forceOutputLookup']"));
            for (WebElement accountName : accountsNameList) {
                accountsName.add(accountName.getText());
            }
        }
        return accountsName;
    }
}
