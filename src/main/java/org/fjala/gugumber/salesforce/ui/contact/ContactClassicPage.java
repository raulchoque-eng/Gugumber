/*
 * @(#) ContactClassicPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.contact;

import org.fjala.gugumber.core.selenium.utils.StrategySetter;
import org.fjala.gugumber.salesforce.ui.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

/**
 * ContactClassicPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactClassicPage extends BasePage {

    /**
     * Locator for first name with text box.
     */
    @FindBy(id = "name_first")
    private WebElement firstNameTxtb;

    @FindBy(id = "name_last")
    private WebElement lastNameTxtb;

    @FindBy(id = "account")
    private WebElement accountTxtb;

    @FindBy(id = "phone1")
    private WebElement phone1Txtb;

    @FindBy(id = "email")
    private WebElement emailTxtb;

    @FindBy(xpath = "//input[@value='save']")
    private WebElement saveBtn;


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

    public void processInformation (final Map<String,String> newContact) {
        HashMap<String, StrategySetter> strategyMap = composeStrategyMap(newContact);
        newContact.keySet().forEach(key -> {
            strategyMap.get(key).executeMethod();});
    }

    public HashMap<String,StrategySetter> composeStrategyMap(final Map<String,String> newContact) {
        HashMap<String, StrategySetter>strategyMap = new HashMap<>();
        strategyMap.put("First Name",()-> setFirstName(newContact.get("First Name")));
        return strategyMap;
    }

}
