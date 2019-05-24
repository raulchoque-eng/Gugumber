/*
 * @(#) PageTransporter.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 *
 */

package org.fjala.gugumber.salesforce.ui;

import org.fjala.gugumber.core.selenium.WebDriverManager;
import org.fjala.gugumber.salesforce.common.ReaderApplicationProperties;
import org.fjala.gugumber.salesforce.ui.pages.HomePage;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * PageTransporter class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class PageTransporter {
    private static PageTransporter instance;
    WebDriver webDriver;
    String baseURL = ReaderApplicationProperties.getInstance().getAppProperties().get("url");
    String pageLayoutName = PageLayoutConfig.getInstance().getPageLayoutName().toUpperCase();
    PageLayoutType pageLayoutType = PageLayoutType.valueOf(pageLayoutName);

    protected PageTransporter() {
        initialize();
    }

    public static PageTransporter getInstance() {
        if (instance == null) {
            instance = new PageTransporter();
        }
        return instance;
    }

    private void initialize() {
        webDriver = WebDriverManager.getInstance().getWebDriver();
        pageLayoutName = PageLayoutConfig.getInstance().getPageLayoutName().toUpperCase();
        pageLayoutType = PageLayoutType.valueOf(pageLayoutName);
    }

    private void goToURL(final String url) {
        try {
            webDriver.navigate().to(new URL(url));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public LoginPage navigateToLoginPage() {
        goToURL(ReaderApplicationProperties.getInstance().getAppProperties().get("login"));
        return new LoginPage();
    }

    public HomePage navigateToHomePage() {
        switch (pageLayoutType) {
            case CLASSIC:
                goToURL(ReaderApplicationProperties.getInstance().getAppProperties().get("classic-url"));
                break;
            case LIGHTNING:
                goToURL(ReaderApplicationProperties.getInstance().getAppProperties().get("lightning-url"));
                break;
        }
        HomePage homePage = PageLayouFactory.getManager(pageLayoutType);

        return homePage;
    }


}
