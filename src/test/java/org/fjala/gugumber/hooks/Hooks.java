/*
 * @(#) Hooks.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.fjala.gugumber.core.selenium.WebDriverManager;
import org.fjala.gugumber.salesforce.api.AccountAPI;
import org.fjala.gugumber.salesforce.api.ContactAPI;
import org.fjala.gugumber.salesforce.entities.Account;
import org.fjala.gugumber.salesforce.entities.Contact;
import org.fjala.gugumber.salesforce.entities.Context;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * Hooks class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class Hooks {

    /**
     * Context of type context.
     */
    private final Context context;

    /**
     * Variable for contact.
     */
    private Contact contact;

     /**
     * Variable for account.
     */
    private Account account;

    /**
     * Driver of type WebDriver.
     */
    private WebDriver driver;

    /**
     * Constructor of class.
     *
     * @param context of type context.
     */
    public Hooks(Context context) {
        this.context = context;
        this.contact = context.getContact();
        this.account = context.getAccount();
        driver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * Method for attachment a picture.
     *
     * @param scenario of type scenario;
     */
    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }

    /**
     * Deletes an contact by id after scenario.
     */
    @After("@delete-contact")
    public void afterScenario() {
        ContactAPI.getInstance().deleteContact(contact.getId());
    }

}
