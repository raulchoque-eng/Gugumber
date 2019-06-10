/*
 * @(#) DriverMethods.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.core.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DriverMethods class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class DriverMethods {


    /**
     * Sets the text into the webElement.
     *
     * @param webElement that sets its text.
     * @param text new value of webElement.
     */
    public static void setTxt(final WebElement webElement, final String text) {
        webElement.clear();
        webElement.sendKeys(text);
    }

    /**
     * Converts a date to string applying a pattern.
     *
     * @param date    changes of type to convert in a string, applying "pattern" variable
     * @param pattern is format that assign to "date" parameter.
     * @return an string build from a "date" parameter.
     */
    public static String convertDateToString(final Date date, final String pattern) {
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date according to the chosen pattern
        final DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);

    }

    /**
     * Waits until that web element is Clickable.
     *
     * @param driver     it is the manager of get UI page.
     * @param webElement is for verifies if it is clickable.
     */
    public static void waitUntilElementIsClickable(WebDriver driver, WebElement webElement) {
        int index = 0;
        boolean isClickable = false;
        do {
            try {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                isClickable = wait.until(ExpectedConditions.elementToBeClickable(webElement)) != null;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (!isClickable && index++ < 3);
    }

    public static void waitUntilElementIsVisible(WebDriver driver, WebElement webElement) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(webElement));
            System.out.println("text of web element visible: " + webElement.getText());
        } catch (Exception e) {
            System.out.println("visible-----------/" + e);
        }
    }

    public static void waitUntilElementIsNotVisible(WebDriver driver, WebElement webElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.invisibilityOf(webElement));
            System.out.println("text of web element is not visible :( ");
        } catch (Exception e) {
            System.out.println("not visible-------------------/" + e);
        }
    }

    /**
     * TODO method to clear a checkbox
     * TODO method que valida que un elemento este en el DOM cambiando el implicit wait (1)
     * TODO validate method that a webElement is in the DOM change the implicit wait (1)
     */
}
