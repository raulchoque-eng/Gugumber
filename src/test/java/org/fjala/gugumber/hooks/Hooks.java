/*
 * @(#) Hooks.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.fjala.gugumber.core.selenium.WebDriverManager;
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

    private final Context context;
    private WebDriver driver;

    public Hooks(Context context) {
        this.context = context;
        driver = WebDriverManager.getInstance().getWebDriver();
    }

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
}