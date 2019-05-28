/*
 * @(#) ContactClassicForm.java Copyright (c) 2019 Jala Foundation.
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
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ProfileContactPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactClassicForm class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactClassicForm extends ContactForm {

    /**
     * Locator for text box of salutation.
     */
    @FindBy(css = "select[id^='name_salutationcon']")
    private WebElement salutationLs;

    /**
     * Locator for text box of first name.
     */
    @FindBy(css = "input[id^='name_firstcon']")
    private WebElement firstNameTxtb;

    /**
     * Locator for text box of Last name.
     */
    @FindBy(css = "input[id^='name_lastcon']")
    private WebElement lastNameTxtb;

    /**
     * Locator for text box of Account.
     */
    @FindBy(id = "con4")
    private WebElement accountTxtb;

    /**
     * Locator for text box of Phone.
     */
    @FindBy(id = "con10")
    private WebElement phoneTxtb;

    /**
     * Locator for text box of Email.
     */
    @FindBy(id = "con15")
    private WebElement emailTxtb;

//    /**
//     * Locator for text box of Phone.
//     */
//    @FindBy(id = "con10")
//    private WebElement phoneTxtb;
//
//    /**
//     * Locator for text box of Email.
//     */
//    @FindBy(id = "con15")
//    private WebElement emailTxtb;

    /**
     * Locator for text box of save button.
     */
    @FindBy(css = "td[id='topButtonRow'] [value=' Save ']")
    private WebElement saveBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(lastNameTxtb));
    }

    @Override
    protected void setSalutation(final String salutation) {

    }

    /**
     * Sets the first name.
     * @param firstName of type String
     */
    public void setFirstName(String firstName) {
        firstNameTxtb.sendKeys(firstName);
    }


    public void setLastName(String lastName) {
        lastNameTxtb.sendKeys(lastName);
    }

    public void setAccount(String account) {
        accountTxtb.sendKeys(account);
    }

    @Override
    protected void setPhone(int phone) {
        phoneTxtb.sendKeys(String.valueOf(phone));
    }

    public void setEmail(String email) {
        emailTxtb.sendKeys(email);
    }

    @Override
    protected void setHomePhone(int homePhone) {

    }

    @Override
    protected void setTitle(String tittle) {

    }

    @Override
    protected void setDepartment(String department) {

    }

    @Override
    protected void setBirthdate(String birthdate) {

    }

    @Override
    protected void setReportsTo(String reportsTo) {

    }

    @Override
    protected void setLeadSource(String leadSource) {

    }

    @Override
    protected void setMobile(int mobile) {

    }

    @Override
    protected void setOtherPhone(int otherPhone) {

    }

    @Override
    protected void setFax(int fax) {

    }

    @Override
    protected void setAssistant(String assistant) {

    }

    @Override
    protected void setAsstPhone(int AsstPhone) {

    }

    @Override
    protected void setMailingStreet(String mailingStreet) {

    }

    @Override
    protected void setMailingCity(String mailingCity) {

    }

    @Override
    protected void setMailingState(String mailingState) {

    }

    @Override
    protected void setMailingPostalCode(String mailingPostalCode) {

    }

    @Override
    protected void setMailingCountry(String mailingCountry) {

    }

    @Override
    protected void setOtherStreet(String otherStreet) {

    }

    @Override
    protected void setOtherCity(String otherCity) {

    }

    @Override
    protected void setOtherState(String otherState) {

    }

    @Override
    protected void setOtherPostalCode(String otherPostalCode) {

    }

    @Override
    protected void setOtherCountry(String otherCountry) {

    }

    @Override
    protected void setLanguages(String languages) {

    }

    @Override
    protected void setLevel(String level) {

    }

    @Override
    protected void setDescription(String description) {

    }

    public void clickSaveBtn() {
        saveBtn.click();
    }

    @Override
    public ProfileContactPage clickSaveNewContact() {
        clickSaveBtn();
        return new ProfileContactClassicPage();
    }
}