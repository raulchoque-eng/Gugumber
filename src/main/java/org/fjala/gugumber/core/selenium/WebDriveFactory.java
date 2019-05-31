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

import org.fjala.gugumber.core.selenium.webdrivers.BrowserType;
import org.fjala.gugumber.core.selenium.webdrivers.Chrome;
import org.fjala.gugumber.core.selenium.webdrivers.Firefox;
import org.fjala.gugumber.core.selenium.webdrivers.IE;
import org.openqa.selenium.WebDriver;

/**
 * WebDriveFactory class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class WebDriveFactory {

    public static final String MESSAGE_FOR_UNKNOWN_BROWSER = "Unknown browser type";

    /**
    * Get Web driver for a Browser.
    * @param type of browser.
    * @return driver manager.
    */
    public static WebDriver getManager(final BrowserType type) {
        final WebDriver driverManager;
            switch (type) {
            case CHROME:
                driverManager = new Chrome().initDriver();
                break;
            case FIREFOX:
                driverManager = new Firefox().initDriver();
                break;
            case IE:
                driverManager = new IE().initDriver();
                break;
            default:
                throw new RuntimeException(MESSAGE_FOR_UNKNOWN_BROWSER);
        }
        return driverManager;
    }
}
