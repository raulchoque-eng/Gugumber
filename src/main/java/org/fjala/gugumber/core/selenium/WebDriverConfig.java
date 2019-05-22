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

/**
 * WebDriverConfig class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class WebDriverConfig {

    /**
     * constant for browser
     */
    private static final String BROWSER = "browser";

    /**
     *
     */
    private  static final String IMPLICIT = "implicitWaitTime";
    private  static final String EXPLICIT = "explicitWaitTime";
    private  static final String WAIT_SLEEP_TIME = "waitSleepTime";

    private String browser;
    private int implicitWaitTime;
    private int explicitWaitTime;
    private int waitSleepTime;

    private static WebDriverConfig instance;

    protected WebDriverConfig() {
        initialize();
    }
    /**
     * Constructor of WebDriverConfig.
     * Gets WebDriverConfig as Singleton.
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
        //browser = System.getProperty(BROWSER);  //Get the browser system property
        implicitWaitTime = Integer.parseInt(ReaderDriverProperties.getInstance().getDriverProperties().get(IMPLICIT));
        explicitWaitTime = Integer.parseInt(ReaderDriverProperties.getInstance().getDriverProperties().get(EXPLICIT));
        waitSleepTime = Integer.parseInt(ReaderDriverProperties.getInstance().getDriverProperties().get(WAIT_SLEEP_TIME));
    }

    /**
     * Gets the browser in which the tests are being executed.
     *
     * @return Browser.
     */
    public String getBrowser() {
        return browser;
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
}
