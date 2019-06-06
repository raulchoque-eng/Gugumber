/*
 * @(#) AccountDetailsLightning.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * AccountDetailsLightning class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class AccountDetailsLightning extends AccountDetailsAbstract {

    /**
     * Web element to usse in el wait until page object.
     */
    @FindBy(css = "div[class='test-id__record-layout-container riseTransitionEnabled']")
    private WebElement detailSection;

    /**
     * Web element for the account name text-box.
     */
    @FindBy(xpath = "//div[starts-with(.,'Account Name')]/child::*/child::span/span")
    private WebElement accountNameTxtb;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(detailSection));
    }

    /**
     * Returns the text of account name field.
     *
     * @return the account name from field.
     */
    @Override
    public String getValueOfAccountNameField() {
        return accountNameTxtb.getText();
    }
}
