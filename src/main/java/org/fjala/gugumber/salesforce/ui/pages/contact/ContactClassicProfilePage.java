/*
 * @(#) ContactClassicProfilePage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactClassicProfilePage class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactClassicProfilePage extends ContactProfilePageAbstract {

    /**
     * Web Element of profile contact form.
     */
    @FindBy(id = "bodyCell")
    private WebElement profileContactHeader;

    /**
     * Web Element of profile contact with title.
     */
    @FindBy(css = ".topName")
    private WebElement contactTitle;

    /**
     * Web Element of details contact.
     */
    @FindBy(id = "ep")
    private WebElement contactDetailsTab;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(profileContactHeader));
    }

    /**
     * Gets of contact title.
     *
     * @return new contact title.
     */
    @Override
    public String getFullNameTitleContact() {
        return contactTitle.getText();
    }

    /**
     * Check the section Details.
     *
     * @return ContactLightningDetails.
     */
    @Override
    public ContactDetailsAbstract checkDetailsSection() {
        return new ContactClassicDetails();
    }
}
