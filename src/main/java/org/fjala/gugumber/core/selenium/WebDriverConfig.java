/*
 * @(#) WebDriveFactory.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.core.selenium;

import org.fjala.gugumber.core.selenium.common.ReaderDriverProperties;
import org.fjala.gugumber.core.selenium.webdrivers.BrowserType;

/**
 * WebDriverConfig class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class WebDriverConfig {

    /**
     * Constant for the implicit wait time.
     */
    private static final String IMPLICIT = "implicitWaitTime";

    /**
     * Constant for the explicit wait time.
     */
    private static final String EXPLICIT = "explicitWaitTime";

    /**
     * Constant for the sleep wait time.
     */
    private static final String WAIT_SLEEP_TIME = "waitSleepTime";

    /**
     * Constant for browaer.
     */
    private static final String BROWSER = "browser";

    /**
     * Variable for implicit wait time.
     */
    private int implicitWaitTime;

    /**
     * Variable for explicit wait time.
     */
    private int explicitWaitTime;

    /**
     * Variable foe sleep wait time.
     */
    private int waitSleepTime;

    /**
     * Variale for the browser type.
     */
    private BrowserType browserType;

    /**
     * Variable for  initialize Web driver config.
     */
    private static WebDriverConfig instance;

    /**
     * Constructor WebDriverConfig.
     */
    protected WebDriverConfig() {
        initialize();
    }

    /**
     * Gets the instance of WebDriverConfig.
     *
     * @return a instance.
     */
    public static WebDriverConfig getInstance() {
        if (instance == null) {
            instance = new WebDriverConfig();
        }
        return instance;
    }

    /**
     * Initializes WebDriverConfig.
     */
    public void initialize() {
        final String browserName = System.getProperty(BROWSER).toUpperCase();
        browserType = BrowserType.valueOf(browserName);
        implicitWaitTime = Integer.parseInt(ReaderDriverProperties.getInstance().getDriverProperties().get(IMPLICIT));
        explicitWaitTime = Integer.parseInt(ReaderDriverProperties.getInstance().getDriverProperties().get(EXPLICIT));
        waitSleepTime = Integer.parseInt(ReaderDriverProperties.getInstance().getDriverProperties().get(WAIT_SLEEP_TIME));
    }

    /**
     * Gets the implicit wait time set for the WebDriver.
     *
     * @return The implicit time.
     */
    public int getImplicitWaitTime() {
        return implicitWaitTime;
    }

    /**
     * Gets the explicit wait time set for the WebDriver.
     *
     * @return The explicit time.
     */
    public int getExplicitWaitTime() {
        return explicitWaitTime;
    }

    /**
     * Gets the sleep time wait set for the WebDriver.
     *
     * @return Sleep time wait.
     */
    public int getWaitSleepTime() {
        return waitSleepTime;
    }

    /**
     * Returns the browser type to start the driver.
     *
     * @return a browser type.
     */
    public BrowserType getBrowserType() {
        return browserType;
    }
}
