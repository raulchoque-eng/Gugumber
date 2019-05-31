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

package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.fjala.gugumber.core.selenium.utils.DriverMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(css = "th[class=' dataCell  ']")
    private List<WebElement> contactNameList;

    /**
     * Locator for button of save button.
     */
    @FindBy(xpath = "//input[@value='save']")
    private WebElement saveBtn;

    /**
     * Locator for button of new button.
     */
    @FindBy(css = "[value=' New ']")
    private WebElement newContactBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(lastNameTxtb));
    }

    /**
     * Sets the first name.
     *
     * @param firstName of type String
     */
    protected void setFirstName(final String firstName) {
        DriverMethods.setTxt(firstNameTxtb,firstName);
    }

    /**
     * Sets the last name.
     *
     * @param lastName of type String.
     */
    protected void setLastName(final String lastName) {
        DriverMethods.setTxt(lastNameTxtb, lastName);
    }

    /**
     * Sets the account.
     *
     * @param account of type String.
     */
    protected void setAccount(final String account) {
        DriverMethods.setTxt(accountTxtb, account);
    }

    /**
     * Sets the phone.
     *
     * @param phone of type int.
     */
    protected void setPhone(final int phone) {
        DriverMethods.setTxt(phone1Txtb, String.valueOf(phone));
    }

    /**
     * Sets the email.
     *
     * @param email of type String.
     */
    protected void setEmail(final String email) {
        DriverMethods.setTxt(emailTxtb, email);
    }

    /**
     * Contact save button.
     */
    public void clickSaveBtn() {
        saveBtn.click();
    }

    /**
     * Contact new contact button.
     */
    private void clickNewContactBtn() {
        newContactBtn.click();
    }

    /**
     * Gets New Contact form.
     *
     * @return new profile contact lighting form.
     */
    @Override
    public ContactForm clickNewContact() {
        clickNewContactBtn();
        return new ContactClassicForm();
    }

    @Override
    public List<String> getListOfContactsName() {
        final List<String> contactName = new ArrayList<>();
        for (WebElement contName : contactNameList) {
            contactName.add(contName.getText());
        }
        return contactName;
    }
}
