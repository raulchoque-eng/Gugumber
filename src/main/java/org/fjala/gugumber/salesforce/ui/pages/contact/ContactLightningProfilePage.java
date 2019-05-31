/*
 * @(#) ContactLightningProfilePage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.contact;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactLightningProfilePage class.
 *
 * @author Cristian Lujan.
 * @version 0.0.1
 */
public class ContactLightningProfilePage extends ContactProfilePage {

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "div[class='slds-grid primaryFieldRow']")
    private WebElement profileContactHeader;

    /**
     * Web Element of profile contact with title.
     */
    @FindBy(css = "span[class='custom-truncate uiOutputText']")
    private WebElement contactTitle;

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "[class='photoContainer forceSocialPhoto'] [alt='Contact']")
    private WebElement contactIcon;

    /**
     * Web Element of profile contact with title.
     */
    @FindBy(css = "[class='forceVisualMessageQueue'] [class='toastMessage slds-text-heading--small forceActionsText']")
    private WebElement contactMessageSaveTxt;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(profileContactHeader));
    }

    /**
     * Gets message of saved.
     *
     * @return the message.
     */
    public String getMessageSave() {
        return contactMessageSaveTxt.getText();
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


    @Override
    public boolean isTheNewContact() {
        return contactIcon.isDisplayed();
    }
}
