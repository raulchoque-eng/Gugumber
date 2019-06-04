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
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactLightningProfilePage extends ContactProfilePageAbstract {

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "div[class='slds-page-header--object-home slds-page-header_joined slds-page-header_bleed slds-page-header slds-shrink-none test-headerRegion forceListViewManagerHeader']")
    private WebElement profileContactHeader;

    /**
     * Web Element of profile contact with title.
     */
    @FindBy(css = "span[class='custom-truncate uiOutputText']")
    private WebElement contactTitle;

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "a[title='Details']")
    private WebElement contactDetailsTab;

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

    /**
     * Clicks Contact details.
     */
    public void clickContactDetailsTab() {
        contactDetailsTab.click();
    }

    /**
     * Check the section Details.
     *
     * @return ContactLightningDetails.
     */
    @Override
    public ContactDetailsAbstract checkDetailsSection() {
        clickContactDetailsTab();
        return new ContactLightningDetails();
    }

//    /**
//     * Contact delete contact button.
//     */
//    private void clickDeleteContactBtn() {
//        deleteContactBtn.click();
//    }

//    /**
//     * Gets Delete Contact form.
//     *
//     * @return new profile contact lighting form.
//     */
//    @Override
//    public ContactForm clickDeleteContact() {
//        return null;
//    }
}
