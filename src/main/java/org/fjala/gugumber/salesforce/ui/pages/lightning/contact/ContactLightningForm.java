/*
 * @(#) ContactLightningForm.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.lightning.contact;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactForm;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ProfileContactPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactLightningForm class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactLightningForm extends ContactForm {

    /**
     * Locator for text box of Contact Modal.
     */
    @FindBy(css = "div[class='modal-container slds-modal__container']")
    private WebElement newContactForm;

    /**
     * Locator for text box of salutation.
     */
    @FindBy(css = "div[class='salutation compoundTLRadius compoundTRRadius compoundBorderBottom form-element__row uiMenu'] div[id^='140']")
    private WebElement salutationCmbb;

    /**
     * Locator for text box of first name.
     */
    @FindBy(css = "input[class='firstName compoundBorderBottom form-element__row input']")
    private WebElement firstNameTxtb;

    /**
     * Locator for text box of last name.
     */
    @FindBy(css = "input[class='lastName compoundBLRadius compoundBRRadius form-element__row input']")
    private WebElement lastNameTxtb;

    /**
     * Locator for text box of phone.
     */
    @FindBy(css = "input[id^='40'][type='tel']")
    private WebElement phoneTxtb;

    /**
     * Locator for text box of home phone.
     */
    @FindBy(css = "input[id^='199'][type='tel']")
    private WebElement hPhoneTxtb;

    /**
     * Locator for text box of title.
     */
    @FindBy(css = "div[class='uiInput uiInputText uiInput--default uiInput--input'] input[id^='315']")
    private WebElement titleTxtb;

    /**
     * Locator for text box of account.
     */
    @FindBy(css = "div[class='contentWrapper slds-box--border'] input[id^='219']")
    private WebElement accountTxtb;

    /**
     * Locator for text box of department.
     */
    @FindBy(css = "div[class='slds-form-element__control'] input[id^='351']")
    private WebElement departmentTxtb;

    /**
     * Locator for text box of birth date.
     */
    @FindBy(css = "a[class='datePicker-openIcon display']")
    private WebElement birthdateTxtb;

    /**
     * Locator for text box of birth date.
     */
    @FindBy(css = "div[id^='533']")
    private WebElement reportToTxtb;

    /**
     * Locator for text box of load Source.
     */
    @FindBy(css = "div[id^='533']")
    private WebElement leadSourceCmbb;

    /**
     * Locator for text box of mobile.
     */
    @FindBy(css = "input[id^='295'][type='tel']")
    private WebElement mobileTxtb;

    /**
     * Locator for text box of other phone.
     */
    @FindBy(css = "input[id^='331'][type='tel']")
    private WebElement otherPhoneTxtb;

    /**
     * Locator for text box of fax.
     */
    @FindBy(css = "input[id^='367'][type='tel']")
    private WebElement faxTxtb;

    /**
     * Locator for text box of email.
     */
    @FindBy(css = "input[id^='410'][type='email']")
    private WebElement emailTxtb;

    /**
     * Locator for text box of assistant.
     */
    @FindBy(css = "div[class='uiInput uiInputText uiInput--default uiInput--input'] input[id^='506']")
    private WebElement assistantTxtb;

    /**
     * Locator for text box of asst. phone.
     */
    @FindBy(css = "input[id^='572'][type='tel']")
    private WebElement asstPhoneTxtb;

    /**
     * Locator for text box of Mailing Street.
     */
    @FindBy(css = "[placeholder='Mailing Street']")
    private WebElement mailingStreetTxtb;

    /**
     * Locator for text box of Mailing City.
     */
    @FindBy(css = "[placeholder='Mailing City']")
    private WebElement mailingCityTxtb;

    /**
     * Locator for text box of mailing State/Province.
     */
    @FindBy(css = "[placeholder='Mailing State/Province']")
    private WebElement mailingStateProvinceTxtb;

    /**
     * Locator for text box of Mailing Zip/Postal Code.
     */
    @FindBy(css = "[placeholder='Mailing Zip/Postal Code']")
    private WebElement mailingZipPostalCodeTxtb;

    /**
     * Locator for text box of Mailing Country.
     */
    @FindBy(css = "[placeholder='Mailing Country']")
    private WebElement mailingCountryTxtb;

    /**
     * Locator for text box of Other Street.
     */
    @FindBy(css = "[placeholder='Other Street']")
    private WebElement otherStreetTxtb;

    /**
     * Locator for text box of Other City.
     */
    @FindBy(css = "[placeholder='Other City']")
    private WebElement otherCityTxtb;

    /**
     * Locator for text box of Other State/Province.
     */
    @FindBy(css = "[placeholder='Other State/Province']")
    private WebElement otherStateProvinceTxtb;

    /**
     * Locator for text box of Other Zip/Postal Code.
     */
    @FindBy(css = "[placeholder='Other Zip/Postal Code']")
    private WebElement otherZipPostalCodeTxtb;

    /**
     * Locator for text box of Other Country.
     */
    @FindBy(css = "[placeholder='Other Country']")
    private WebElement otherCountryTxtb;

    /**
     * Locator for text box of languages.
     */
    @FindBy(css = "input[id^='754'][type='text']")
    private WebElement languagesTxtb;

    /**
     * Locator for text box of level.
     */
    @FindBy(css = "div[id^='777'][class='uiPopupTrigger']")
    private WebElement levelCmbb;

    /**
     * Locator for text box of description.
     */
    @FindBy(css = "textarea[id^='831'][class=' textarea']")
    private WebElement descriptionTxtb;

    /**
     * Locator for button of save button.
     */
    @FindBy(css = "[class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']")
    private WebElement saveBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newContactForm));
    }

    @Override
    protected void setSalutation(String salutation) {
        salutationCmbb.sendKeys(salutation);
    }

    /**
     * Sets the first name.
     * @param firstName of type String
     */
    protected void setFirstName(final String firstName) {
        firstNameTxtb.sendKeys(firstName);
    }

    public void setLastName(final String lastName) {
        lastNameTxtb.sendKeys(lastName);
    }

    public void setPhone(int phone) {
        phoneTxtb.sendKeys(String.valueOf(phone));
    }

    public void setHomePhone(int phone) {
        hPhoneTxtb.sendKeys(String.valueOf(phone));
    }

    public void setTitle(String title) {
        titleTxtb.sendKeys(title);
    }

    public void setAccount(String account) {
        accountTxtb.sendKeys(account);
    }

    public void setDepartment(String department) {
        departmentTxtb.sendKeys(department);
    }

    public void setBirthdate(String birthdate) {
        birthdateTxtb.sendKeys(birthdate);
    }

    @Override
    protected void setReportsTo(String reportsTo) {
        reportToTxtb.sendKeys(reportsTo);
    }

    @Override
    protected void setLeadSource(String leadSource) {
        leadSourceCmbb.sendKeys(leadSource);
    }

    public void setMobile(int mobile) {
        mobileTxtb.sendKeys(String.valueOf(mobile));
    }

    public void setOtherPhone(int phone) {
        otherPhoneTxtb.sendKeys(String.valueOf(phone));
    }

    public void setFax(int fax) {
        faxTxtb.sendKeys(String.valueOf(fax));
    }

    public void setEmail(String email) {
        emailTxtb.sendKeys(email);
    }

    public void setAssistant(String assistant) {
        assistantTxtb.sendKeys(assistant);
    }

    public void setAsstPhone(int AsstPhone) {
        asstPhoneTxtb.sendKeys(String.valueOf(AsstPhone));
    }

    public void setMailingStreet(String mailingStreet) {
        mailingStreetTxtb.sendKeys(mailingStreet);
    }

    public void setMailingCity(String mailingCity) {
        mailingCityTxtb.sendKeys(mailingCity);
    }

    @Override
    protected void setMailingState(String mailingState) {
        mailingStateProvinceTxtb.sendKeys(mailingState);
    }

    @Override
    protected void setMailingPostalCode(String mailingPostalCode) {
        mailingZipPostalCodeTxtb.sendKeys(mailingPostalCode);
    }

    public void setMailingCountry(String mailingCountry) {
        mailingCountryTxtb.sendKeys(mailingCountry);
    }

    public void setOtherStreet(String otherStreet) {
        otherStreetTxtb.sendKeys(otherStreet);
    }

    public void setOtherCity(String otherCity) {
        otherCityTxtb.sendKeys(otherCity);
    }

    @Override
    protected void setOtherState(String otherState) {
        otherStateProvinceTxtb.sendKeys(otherState);
    }

    @Override
    protected void setOtherPostalCode(String otherPostalCode) {

    }

    public void setOtherCountry(String otherCountry) {
        otherCountryTxtb.sendKeys(otherCountry);
    }

    public void setLanguages(String languages) {
        languagesTxtb.sendKeys(languages);
    }

    public void setLevel(String level) {
        levelCmbb.sendKeys(level);
    }

    public void setDescription(String description) {
        descriptionTxtb.sendKeys(description);
    }

    public void clickSaveBtn() {
        saveBtn.click();
    }


    @Override
    public ProfileContactPage clickSaveNewContact() {
        clickSaveBtn();
        return new ProfileContactLightningPage();
    }
}
