/*
 * @(#) ContactClassicPageAbstract.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.classic.contact;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactForm;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPageAbstract;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactClassicPageAbstract class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactClassicPageAbstract extends ContactPageAbstract {

    /**
     * Web element for the contact option.
     */
    @FindBy(id = "Contact_Tab")
    private WebElement contactMenuBtn;

    /**
     * Locator for text box of first name.
     */
    @FindBy(id = "name_first")
    private WebElement firstNameTxtb;

    /**
     * Locator for text box of Last name.
     */
    @FindBy(id = "name_last")
    private WebElement lastNameTxtb;

    /**
     * Locator for text box of Account.
     */
    @FindBy(id = "account")
    private WebElement accountTxtb;

    /**
     * Locator for text box of Phone.
     */
    @FindBy(id = "phone1")
    private WebElement phone1Txtb;

    /**
     * Locator for text box of Email.
     */
    @FindBy(id = "email")
    private WebElement emailTxtb;

    /**
     * Locator for button of save button.
     */
    @FindBy(xpath = "//input[@value='save']")
    private WebElement saveBtn;

    /**
     * Locator for button of new button.
     */
    @FindBy(css = "[class='pbButton']")
    private WebElement newContactBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(lastNameTxtb));
    }

    public void setFirstName(String firstName) {
        firstNameTxtb.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        lastNameTxtb.sendKeys(lastName);
    }

    public void setAccount(String account) {
        accountTxtb.sendKeys(account);
    }

    public void setPhone1(String phone1) {
        phone1Txtb.sendKeys(phone1);
    }

    public void setEmail(String email) {
        emailTxtb.sendKeys(email);
    }

    public void clickSaveBtn() {
        saveBtn.click();
    }

    private void clickNewContactBtn() {
        newContactBtn.click();
    }

    @Override
    public ContactForm clickNewContact() {
        clickNewContactBtn();
        return new ContactClassicForm();
    }
}
