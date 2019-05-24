/*
 * @(#) main.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

import org.fjala.gugumber.salesforce.ui.PageTransporter;

import java.net.MalformedURLException;

/**
 * main class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class main {
    public static void main(String[] args) throws MalformedURLException {
//        WebDriver webDriver = WebDriverManager.getInstance().getWebDriver();
//        webDriver.navigate().to(new URL("https://login.salesforce.com/"));
//        System.out.println(ReaderApplicationProperties.getInstance().getApplicationProperties()+ "1111111111");
        PageTransporter.getInstance().navigateToLoginPage();
    }
}
