/*
 * @(#) RunCukesTest.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.fjala.gugumber.core.report.GeneratorReport;
import org.fjala.gugumber.core.selenium.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

/**
 * RunCukesTest class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"org/fjala/gugumber/steps", "org/fjala/gugumber/hooks"},
        features = {"src/test/resources/features"},
        monochrome = true)

public class RunCukesTest extends AbstractTestNGCucumberTests {

    /**
     * The method afterExecution executes the project and generate it report.
     */
    @AfterTest
    public void afterExecution() {
        WebDriverManager.getInstance().getWebDriver().close();
        GeneratorReport.getInstance().generateReport();
    }

    @AfterMethod
    public void refresh() {
        WebDriverManager.getInstance().getWebDriver().manage().deleteAllCookies();
    }
}
