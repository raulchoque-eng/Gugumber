/*
 * @(#) ContactLightningForm.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.fjala.gugumber.core.selenium.utils.DriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;

/**
 * ContactLightningForm class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactLightningForm extends ContactFormAbstract {

    /**
     * Locator for text box of Contact Modal.
     */
    @FindBy(css = "div[class='modal-container slds-modal__container']")
    private WebElement newContactForm;

    /**
     * Locator for text box of salutation.
     */
    @FindBy(css = "[id^='140'] [class='select']")
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
    private WebElement homePhoneTxtb;

    /**
     * Locator for text box of title.
     */
    @FindBy(css = "div[class='uiInput uiInputText uiInput--default uiInput--input'] input[id^='315']")
    private WebElement titleTxtb;

    /**
     * Locator for text box of account.
     */
    @FindBy(css = "div[class='contentWrapper slds-box--border'] input[id^='219']")
    private WebElement accountCmbb;

    /**
     * Locator for text box of department.
     */
    @FindBy(css = "div[class='slds-form-element__control'] input[id^='351']")
    private WebElement departmentTxtb;

    /**
     * Locator for text box of birth date.
     */
    @FindBy(css = "input[id^='387']")
    private WebElement birthdateTxtb;

    /**
     * Locator for text box of report to.
     */
    @FindBy(css = "[class='autocompleteWrapper slds-grow'] input[id^='430']")
    private WebElement reportToCmbb;

    /**
     * Locator for text box of lead Source.
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
     * Variable for locator of salutation comboBox.
     */
    final String SALUTATION_CMBB = "li[class='uiMenuItem uiRadioMenuItem'] a[title='nameTitle']";

    /**
     * Variable for locator of account and report to comboBox.
     */
    final String ACCOUNT_CMBB = "div[class='slds-m-left--smalllabels slds-truncate slds-media__body'] [title='nameTitle']";

    /**
     * Variable for locator of lead source and level comboBox.
     */
    final String LEVEL_CMBB = "ul[class='scrollable'] [title='nameTitle']";

    /**
     * Variable for type date.
     */
    final String PATTERN = "dd-MM-yyyy";

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newContactForm));
    }

    /**
     * Sets the salutation name.
     *
     * @param salutation of type String
     */
    @Override
    protected void setSalutation(final String salutation) {
        salutationCmbb.click();
        driver.findElement(By.cssSelector(replaceValueInLocator(SALUTATION_CMBB, salutation))).click();
    }

    /**
     * Sets the first name.
     *
     * @param firstName of type String
     */
    @Override
    protected void setFirstName(final String firstName) {
        DriverMethods.setTxt(firstNameTxtb, firstName);
    }

    /**
     * Sets the last name.
     *
     * @param lastName of type String.
     */
    @Override
    protected void setLastName(final String lastName) {
        DriverMethods.setTxt(lastNameTxtb, lastName);
    }

    /**
     * Sets the phone.
     *
     * @param phone of type int.
     */
    @Override
    protected void setPhone(final int phone) {
        DriverMethods.setTxt(phoneTxtb, String.valueOf(phone));
    }

    /**
     * Sets the phone.
     *
     * @param phone of type int.
     */
    @Override
    protected void setHomePhone(final int phone) {
        DriverMethods.setTxt(homePhoneTxtb, String.valueOf(phone));
    }

    /**
     * Sets the title.
     *
     * @param title of type String.
     */
    @Override
    protected void setTitle(final String title) {
        DriverMethods.setTxt(titleTxtb, title);
    }

    /**
     * Sets the account.
     *
     * @param account of type String.
     */
    @Override
    protected void setAccount(final String account) {
        accountCmbb.click();
        driver.findElement(By.cssSelector(replaceValueInLocator(ACCOUNT_CMBB, account))).click();
    }

    /**
     * Sets the department.
     *
     * @param department of type String.
     */
    @Override
    protected void setDepartment(final String department) {
        DriverMethods.setTxt(departmentTxtb, department);
    }

    /**
     * Sets the birthdate.
     *
     * @param birthdate of type String.
     */
    @Override
    protected void setBirthdate(final Date birthdate) {
        DriverMethods.setTxt(birthdateTxtb, DriverMethods.convertDateToString(birthdate, PATTERN));
        birthdateTxtb.sendKeys(Keys.TAB);
    }

    /**
     * Sets the reports to.
     *
     * @param reportsTo of type String.
     */
    @Override
    protected void setReportsTo(final String reportsTo) {
        reportToCmbb.click();
        driver.findElement(By.cssSelector(replaceValueInLocator(ACCOUNT_CMBB, reportsTo))).click();
    }

    /**
     * Sets the lead Source.
     *
     * @param leadSource of type String.
     */
    @Override
    protected void setLeadSource(final String leadSource) {
        leadSourceCmbb.click();
        driver.findElement(By.cssSelector(replaceValueInLocator(LEVEL_CMBB, leadSource))).click();
    }

    /**
     * Sets the Mobile.
     *
     * @param mobile of type int.
     */
    @Override
    protected void setMobile(final int mobile) {
        DriverMethods.setTxt(mobileTxtb, String.valueOf(mobile));
    }

    /**
     * Sets the Phone.
     *
     * @param phone of type int.
     */
    @Override
    protected void setOtherPhone(final int phone) {
        DriverMethods.setTxt(otherPhoneTxtb, String.valueOf(phone));
    }

    /**
     * Sets the fax.
     *
     * @param fax of type int.
     */
    @Override
    protected void setFax(final int fax) {
        DriverMethods.setTxt(faxTxtb, String.valueOf(fax));
    }

    /**
     * Sets the email.
     *
     * @param email of type String.
     */
    @Override
    protected void setEmail(final String email) {
        DriverMethods.setTxt(emailTxtb, email);
    }

    /**
     * Sets the assistant.
     *
     * @param assistant of type String.
     */
    @Override
    protected void setAssistant(final String assistant) {
        DriverMethods.setTxt(assistantTxtb, assistant);
    }

    /**
     * Sets the asstPhone.
     *
     * @param asstPhone of type String.
     */
    @Override
    protected void setAsstPhone(final int asstPhone) {
        DriverMethods.setTxt(asstPhoneTxtb, String.valueOf(asstPhone));
    }

    /**
     * Sets the mailingStreet.
     *
     * @param mailingStreet of type String.
     */
    @Override
    protected void setMailingStreet(final String mailingStreet) {
        DriverMethods.setTxt(mailingStreetTxtb, mailingStreet);
    }

    /**
     * Sets the mailingCity.
     *
     * @param mailingCity of type String.
     */
    @Override
    protected void setMailingCity(final String mailingCity) {
        DriverMethods.setTxt(mailingCityTxtb, mailingCity);
    }

    /**
     * Sets the mailingState.
     *
     * @param mailingState of type String.
     */
    @Override
    protected void setMailingState(final String mailingState) {
        DriverMethods.setTxt(mailingStateProvinceTxtb, mailingState);
    }

    /**
     * Sets the mailingPostalCode.
     *
     * @param mailingPostalCode of type String.
     */
    @Override
    protected void setMailingPostalCode(final String mailingPostalCode) {
        DriverMethods.setTxt(mailingZipPostalCodeTxtb, mailingPostalCode);
    }

    /**
     * Sets the mailingCountry.
     *
     * @param mailingCountry of type String.
     */
    @Override
    protected void setMailingCountry(final String mailingCountry) {
        DriverMethods.setTxt(mailingCountryTxtb, mailingCountry);
    }

    /**
     * Sets the otherStreet.
     *
     * @param otherStreet of type String.
     */
    @Override
    protected void setOtherStreet(final String otherStreet) {
        DriverMethods.setTxt(otherStreetTxtb, otherStreet);
    }

    /**
     * Sets the otherCity.
     *
     * @param otherCity of type String.
     */
    @Override
    protected void setOtherCity(final String otherCity) {
        DriverMethods.setTxt(otherCityTxtb, otherCity);
    }

    /**
     * Sets the otherState.
     *
     * @param otherState of type String.
     */
    @Override
    protected void setOtherState(final String otherState) {
        DriverMethods.setTxt(otherStateProvinceTxtb, otherState);
    }

    /**
     * Sets the otherPostalCode.
     *
     * @param otherPostalCode of type String.
     */
    @Override
    protected void setOtherPostalCode(final String otherPostalCode) {
        DriverMethods.setTxt(otherZipPostalCodeTxtb, otherPostalCode);
    }

    /**
     * Sets the otherCountry.
     *
     * @param otherCountry of type String.
     */
    @Override
    protected void setOtherCountry(final String otherCountry) {
        DriverMethods.setTxt(otherCountryTxtb, otherCountry);
    }

    /**
     * Sets the languages.
     *
     * @param languages of type String.
     */
    @Override
    protected void setLanguages(final String languages) {
        DriverMethods.setTxt(languagesTxtb, languages);
    }

    /**
     * Sets the level.
     *
     * @param level of type String.
     */
    @Override
    protected void setLevel(final String level) {
        levelCmbb.click();
        driver.findElement(By.cssSelector(replaceValueInLocator(LEVEL_CMBB, level))).click();
    }

    /**
     * Sets the description.
     *
     * @param description of type String.
     */
    @Override
    protected void setDescription(final String description) {
        DriverMethods.setTxt(descriptionTxtb, description);
    }

    /**
     * Contact save button.
     */
    public void clickSaveBtn() {
        saveBtn.click();
    }

    /**
     * Gets New Contact.
     *
     * @return new profile contact lighting page.
     */
    @Override
    public ContactProfilePageAbstract clickSaveNewContact() {
        clickSaveBtn();
        return new ContactLightningProfilePage();
    }

    /**
     * Replaces the a value in the locator xpath to select an option in comboBox.
     *
     * @param locator to replace value.
     * @param valueToReplace to replace in locator.
     * @return a xpath as string with el value replaced for the comboBox.
     */
    private String replaceValueInLocator(final String locator, final String valueToReplace) {
        return locator.replace("nameTitle", valueToReplace);
    }
}
