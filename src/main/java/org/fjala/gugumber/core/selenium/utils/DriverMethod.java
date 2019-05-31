/*
 * @(#) DriverMethod.java Copyright (c) 2019 Jala Foundation.
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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * DriverMethod class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class DriverMethod {

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
     * Sets the comboBox into the webElement.
     *
     * @param webElement that sets its comboBox.
     * @param driver that connection for web elements.
     * @param replaceCmb value for replace.
     * @param text new value of webElement.
     */
    public static  void selectCmb(final WebElement webElement, final WebDriver driver, final String replaceCmb, final String text) {
        webElement.click();
        driver.findElement(By.cssSelector(replaceCmb.replace("nameTitle", text))).click();
    }

    //TODO method to select a checkbox

    //TODO method to clear a checkbox

    //TODO method que valida que un elemento este en el DOM cambiando el implicit wait
    //TODO validate method that a webElement is in the DOM change the implicit wait
}