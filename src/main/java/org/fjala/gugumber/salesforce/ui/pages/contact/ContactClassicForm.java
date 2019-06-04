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

package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.fjala.gugumber.core.selenium.utils.DriverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * ContactClassicForm class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactClassicForm extends ContactFormAbstract {

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
    @FindBy(id = "con13")
    private WebElement homePhoneTxtb;

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

    final String cmbReplace = "[id='name_salutationcon2'] [value='nameTitle']";

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
        DriverMethods.selectCmb(salutationCmbb, driver, cmbReplace, salutation);
    }

    /**
     * Sets the first name.
     *
     * @param firstName of type String
     */
    @Override
    protected void setFirstName(final String firstName) {
        DriverMethods.setTxt(firstNameTxtb,firstName);
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
        DriverMethods.setTxt(phoneTxtb, String.valueOf(phone));
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
        DriverMethods.setTxt(accountTxtb, account);
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
    protected void setBirthdate(final String birthdate) {
       DriverMethods.setTxt(birthdateTxtb, birthdate);
    }

    /**
     * Sets the reports to.
     *
     * @param reportsTo of type String.
     */
    @Override
    protected void setReportsTo(final String reportsTo) {
       DriverMethods.setTxt(reportToTxtb, reportsTo);
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
        DriverMethods.setTxt(mobileTxtb, String.valueOf(mobile));
    }

    /**
     * Sets the Phone.
     *
     * @param phone of type int.
     */
    @Override
    protected void setOtherPhone(final int phone) {
        DriverMethods.setTxt(phoneTxtb, String.valueOf(phone));
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
       DriverMethods.setTxt(levelCmbb, level);
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
     * @return new profile contact classic page.
     */
    @Override
    public ContactProfilePageAbstract clickSaveNewContact() {
        clickSaveBtn();
        return new ContactClassicProfilePage();
    }

}