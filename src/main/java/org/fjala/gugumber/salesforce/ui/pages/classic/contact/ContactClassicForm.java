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
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactProfilePage;
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
    private WebElement salutationCmbb;

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

/**
     * Locator for text box of title.
     */
    @FindBy(id = "con5")
    private WebElement titleTxtb;

/**
     * Locator for text box of department.
     */
    @FindBy(id = "con6")
    private WebElement departmentTxtb;

    /**
     * Locator for text box of birth date.
     */
    @FindBy(id = "con7")
    private WebElement birthdateTxtb;

    /**
     * Locator for text box of report to.
     */
    @FindBy(id = "con8")
    private WebElement reportToTxtb;

    /**
     * Locator for text box of lead Source.
     */
    @FindBy(id = "con9")
    private WebElement leadSourceCmbb;

    /**
     * Locator for text box of home phone.
     */
    @FindBy(id = "")
    private WebElement hPhoneTxtb;

    /**
     * Locator for text box of mobile.
     */
    @FindBy(id = "con12")
    private WebElement mobileTxtb;

    /**
     * Locator for text box of other phone.
     */
    @FindBy(id = "con14")
    private WebElement otherPhoneTxtb;

    /**
     * Locator for text box of fax.
     */
    @FindBy(id = "con11")
    private WebElement faxTxtb;

    /**
     * Locator for text box of assistant.
     */
    @FindBy(id = "con16")
    private WebElement assistantTxtb;

    /**
     * Locator for text box of asst. phone.
     */
    @FindBy(id = "con17")
    private WebElement asstPhoneTxtb;

    /**
     * Locator for text box of Mailing Street.
     */
    @FindBy(id = "con19street")
    private WebElement mailingStreetTxtb;

    /**
     * Locator for text box of Mailing City.
     */
    @FindBy(id = "con19city")
    private WebElement mailingCityTxtb;

    /**
     * Locator for text box of mailing State/Province.
     */
    @FindBy(id = "con19state")
    private WebElement mailingStateProvinceTxtb;

    /**
     * Locator for text box of Mailing Zip/Postal Code.
     */
    @FindBy(id = "con19zip")
    private WebElement mailingZipPostalCodeTxtb;

    /**
     * Locator for text box of Mailing Country.
     */
    @FindBy(id = "con19country")
    private WebElement mailingCountryTxtb;

    /**
     * Locator for text box of Other Street.
     */
    @FindBy(id = "con18street")
    private WebElement otherStreetTxtb;

    /**
     * Locator for text box of Other City.
     */
    @FindBy(id = "con18city")
    private WebElement otherCityTxtb;

    /**
     * Locator for text box of Other State/Province.
     */
    @FindBy(id = "con18state")
    private WebElement otherStateProvinceTxtb;

    /**
     * Locator for text box of Other Zip/Postal Code.
     */
    @FindBy(id = "con18zip")
    private WebElement otherZipPostalCodeTxtb;

    /**
     * Locator for text box of Other Country.
     */
    @FindBy(id = "con18country")
    private WebElement otherCountryTxtb;

    /**
     * Locator for text box of languages.
     */
    @FindBy(id = "00N4P000007vcCK")
    private WebElement languagesTxtb;

    /**
     * Locator for text box of level.
     */
    @FindBy(id = "00N4P000007vcCL")
    private WebElement levelCmbb;

    /**
     * Locator for text box of description.
     */
    @FindBy(id = "con20")
    private WebElement descriptionTxtb;

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

    /**
     * Sets the salutation name.
     *
     * @param salutation of type String
     */
    @Override
    protected void setSalutation(final String salutation) {
        salutationCmbb.sendKeys(salutation);
    }

    /**
     * Sets the first name.
     *
     * @param firstName of type String
     */
    @Override
    protected void setFirstName(final String firstName) {
        firstNameTxtb.sendKeys(firstName);
    }

    /**
     * Sets the last name.
     *
     * @param lastName of type String.
     */
    @Override
    protected void setLastName(final String lastName) {
        lastNameTxtb.sendKeys(lastName);
    }

    /**
     * Sets the phone.
     *
     * @param phone of type int.
     */
    @Override
    protected void setPhone(final int phone) {
        phoneTxtb.sendKeys(String.valueOf(phone));
    }

    /**
     * Sets the phone.
     *
     * @param phone of type int.
     */
    @Override
    protected void setHomePhone(final int phone) {
        hPhoneTxtb.sendKeys(String.valueOf(phone));
    }

    /**
     * Sets the title.
     *
     * @param title of type String.
     */
    @Override
    protected void setTitle(final String title) {
        titleTxtb.sendKeys(title);
    }

    /**
     * Sets the account.
     *
     * @param account of type String.
     */
    @Override
    protected void setAccount(final String account) {
        accountTxtb.sendKeys(account);
    }

    /**
     * Sets the department.
     *
     * @param department of type String.
     */
    @Override
    protected void setDepartment(final String department) {
        departmentTxtb.sendKeys(department);
    }

    /**
     * Sets the birthdate.
     *
     * @param birthdate of type String.
     */
    @Override
    protected void setBirthdate(final String birthdate) {
        birthdateTxtb.sendKeys(birthdate);
    }

    /**
     * Sets the reports to.
     *
     * @param reportsTo of type String.
     */
    @Override
    protected void setReportsTo(final String reportsTo) {
        reportToTxtb.sendKeys(reportsTo);
    }

    /**
     * Sets the lead Source.
     *
     * @param leadSource of type String.
     */
    @Override
    protected void setLeadSource(final String leadSource) {
        leadSourceCmbb.click();
//        driver.findElement(By.cssSelector(statusElements.replace("element", status))).click();
    }

    /**
     * Sets the Mobile.
     *
     * @param mobile of type int.
     */
    @Override
    protected void setMobile(final int mobile) {
        mobileTxtb.sendKeys(String.valueOf(mobile));
    }

    /**
     * Sets the Phone.
     *
     * @param phone of type int.
     */
    @Override
    protected void setOtherPhone(final int phone) {
        otherPhoneTxtb.sendKeys(String.valueOf(phone));
    }

    /**
     * Sets the fax.
     *
     * @param fax of type int.
     */
    @Override
    protected void setFax(final int fax) {
        faxTxtb.sendKeys(String.valueOf(fax));
    }

    /**
     * Sets the email.
     *
     * @param email of type String.
     */
    @Override
    protected void setEmail(final String email) {
        emailTxtb.sendKeys(email);
    }

    /**
     * Sets the assistant.
     *
     * @param assistant of type String.
     */
    @Override
    protected void setAssistant(final String assistant) {
        assistantTxtb.sendKeys(assistant);
    }

    /**
     * Sets the asstPhone.
     *
     * @param asstPhone of type String.
     */
    @Override
    protected void setAsstPhone(final int asstPhone) {
        asstPhoneTxtb.sendKeys(String.valueOf(asstPhone));
    }

    /**
     * Sets the mailingStreet.
     *
     * @param mailingStreet of type String.
     */
    @Override
    protected void setMailingStreet(final String mailingStreet) {
        mailingStreetTxtb.sendKeys(mailingStreet);
    }

    /**
     * Sets the mailingCity.
     *
     * @param mailingCity of type String.
     */
    @Override
    protected void setMailingCity(final String mailingCity) {
        mailingCityTxtb.sendKeys(mailingCity);
    }

    /**
     * Sets the mailingState.
     *
     * @param mailingState of type String.
     */
    @Override
    protected void setMailingState(final String mailingState) {
        mailingStateProvinceTxtb.sendKeys(mailingState);
    }

    /**
     * Sets the mailingPostalCode.
     *
     * @param mailingPostalCode of type String.
     */
    @Override
    protected void setMailingPostalCode(final String mailingPostalCode) {
        mailingZipPostalCodeTxtb.sendKeys(mailingPostalCode);
    }

    /**
     * Sets the mailingCountry.
     *
     * @param mailingCountry of type String.
     */
    @Override
    protected void setMailingCountry(final String mailingCountry) {
        mailingCountryTxtb.sendKeys(mailingCountry);
    }

    /**
     * Sets the otherStreet.
     *
     * @param otherStreet of type String.
     */
    @Override
    protected void setOtherStreet(final String otherStreet) {
        otherStreetTxtb.sendKeys(otherStreet);
    }

    /**
     * Sets the otherCity.
     *
     * @param otherCity of type String.
     */
    @Override
    protected void setOtherCity(final String otherCity) {
        otherCityTxtb.sendKeys(otherCity);
    }

    /**
     * Sets the otherState.
     *
     * @param otherState of type String.
     */
    @Override
    protected void setOtherState(final String otherState) {
        otherStateProvinceTxtb.sendKeys(otherState);
    }

    /**
     * Sets the otherPostalCode.
     *
     * @param otherPostalCode of type String.
     */
    @Override
    protected void setOtherPostalCode(final String otherPostalCode) {

    }

    /**
     * Sets the otherCountry.
     *
     * @param otherCountry of type String.
     */
    @Override
    protected void setOtherCountry(final String otherCountry) {
        otherCountryTxtb.sendKeys(otherCountry);
    }

    /**
     * Sets the languages.
     *
     * @param languages of type String.
     */
    @Override
    protected void setLanguages(final String languages) {
        languagesTxtb.sendKeys(languages);
    }

    /**
     * Sets the level.
     *
     * @param level of type String.
     */
    @Override
    protected void setLevel(final String level) {
        levelCmbb.sendKeys(level);
    }

    /**
     * Sets the description.
     *
     * @param description of type String.
     */
    @Override
    protected void setDescription(final String description) {
        descriptionTxtb.sendKeys(description);
    }

    public void clickSaveBtn() {
        saveBtn.click();
    }

    @Override
    public ContactProfilePage clickSaveNewContact() {
        clickSaveBtn();
        return new ContactClassicProfilePage();
    }
}