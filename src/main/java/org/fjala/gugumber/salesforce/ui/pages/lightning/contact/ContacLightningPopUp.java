/*
 * @(#) ContacLightningPopUp.java Copyright (c) 2019 Jala Foundation.
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

import org.fjala.gugumber.salesforce.ui.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContacLightningPopUp class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContacLightningPopUp extends HomePage {

    /**
     *
     */
    @FindBy(css = "div[class='modal-container slds-modal__container]'")
    private WebElement newContactModal;

    @FindBy(css = "div[class='salutation compoundTLRadius compoundTRRadius compoundBorderBottom form-element__row uiMenu'] div[id^='140']")
    private WebElement salutationLs;

    @FindBy(css = "input[class='firstName compoundBorderBottom form-element__row input']")
    private WebElement firstNameTxtb;

    @FindBy(css = "input[class='lastName compoundBLRadius compoundBRRadius form-element__row input']")
    private WebElement lastNameTxtb;

    @FindBy(css = "divinput[id^='40'][type='tel']")
    private WebElement phoneTxtb;

    @FindBy(css = "divinput[id^='199'][type='tel']")
    private WebElement hPhoneTxtb;

    @FindBy(css = "div[class='uiInput uiInputText uiInput--default uiInput--input'] input[id^='315']")
    private WebElement titleTxtb;

    @FindBy(css = "div[class='contentWrapper slds-box--border'] input[id^='219']")
    private WebElement accountTxtb;

    @FindBy(css = "div[class='slds-form-element__control'] input[id^='351']")
    private WebElement departmentTxtb;

    @FindBy(css = "a[class='datePicker-openIcon display']")
    private WebElement birthdateTxtb;

    @FindBy(css = "div[id^='533']")
    private WebElement loadSourceTxtb;

    @FindBy(css = "input[id^='295'][type='tel']")
    private WebElement mobileTxtb;

    @FindBy(css = "input[id^='331'][type='tel']")
    private WebElement otherPhoneTxtb;

    @FindBy(css = "input[id^='367'][type='tel']")
    private WebElement faxTxtb;

    @FindBy(css = "input[id^='410'][type='email']")
    private WebElement emailTxtb;

    @FindBy(css = "div[class='uiInput uiInputText uiInput--default uiInput--input'] input[id^='506']")
    private WebElement assistantTxtb;

    @FindBy(css = "input[id^='572'][type='tel']")
    private WebElement asstPhoneTxtb;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newContactModal));
    }

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

    public void setLoadSource(String loadSource) {
        loadSourceTxtb.sendKeys(loadSource);
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
}
