/*
 * @(#) AccountsClassicPage.java Copyright (c) 2019 Jala Foundation.
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

import static org.fjala.gugumber.salesforce.ui.pages.account.AccountsLightningPage.VALUE_TO_REPLACE;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * AccountsClassicPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountsClassicPage extends AccountsPageAbstract {

    /**
     * Constant to remove the characters of id.
     */
    public static final int CANT_TO_REMOVE_OF_ID = 5;
    /**
     * Variable to replace the id of an account.
     */
    private String xpahtForGetAcountById = "//a[@href='/valueToReplace']";

    /**
     * Web element for the body of the account page.
     */
    @FindBy(id = "bodyCell")
    private WebElement body;

    /**
     * Web element for the button new.
     */
    @FindBy(css = "input[class='btn'][name='new']")
    private WebElement newAccountBtn;

    /**
     * List of web elements account name.
     */
    @FindBy(css = "th[class=' dataCell  ']")
    private List<WebElement> accountsNameList;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(body));
    }

    /**
     * Returns a new account form for the layout classic after clicking on new button.
     *
     * @return a new account classic form.
     */
    @Override
    public AccountFormAbstract clickNewBtn() {
        newAccountBtn.click();
        return new AccountClassicForm();
    }

    /**
     * Returns a list of name accounts from the accounts page.
     *
     * @return a list with the name accounts.
     */
    @Override
    public List<String> getListOfAccountsName() {
        final List<String> accountsName = new ArrayList<>();
        for (WebElement accountName : accountsNameList) {
            accountsName.add(accountName.getText());
        }
        return accountsName;
    }

    /**
     * Returns the account classic page by id of an account.
     *
     * @return Account classic page.
     */
    @Override
    public AccountProfilePageAbstract openAccount(final String id) {
        driver.findElement(By.xpath(getXpathForGetAccountById(id))).click();
        return new AccountProfileClassicPage();
    }

    /**
     * Returns the xpath with the id account for classic page.
     *
     * @param id to replace in xpath.
     * @return xpahtForGetAcountById as string.
     */
    private String getXpathForGetAccountById(final String id) {
        xpahtForGetAcountById = xpahtForGetAcountById.replace(VALUE_TO_REPLACE, id);
        xpahtForGetAcountById = xpahtForGetAcountById.
                substring(0, xpahtForGetAcountById.length() - CANT_TO_REMOVE_OF_ID).concat("']");
        return xpahtForGetAcountById;
    }
}
