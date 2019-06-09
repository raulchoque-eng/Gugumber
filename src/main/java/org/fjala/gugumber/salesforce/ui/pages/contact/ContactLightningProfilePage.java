/*
 * @(#) ContactLightningProfilePage.java Copyright (c) 2019 Jala Foundation.
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
 * ContactLightningProfilePage class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactLightningProfilePage extends ContactProfilePageAbstract {

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "[class='forceHighlightsPanel']")
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
     * Web Element main menu contact.
     */
    @FindBy(css ="li[class='slds-button slds-button--icon-border-filled oneActionsDropDown'] [title='Show 5 more actions']")
    private WebElement mainMenuCmbb;

    /**
     * Web Element delete button contact.
     */
    @FindBy(css = "a[title='Delete'][role='menuitem']" )
    private WebElement deleteOptionCmb;

    /**
     * Web Element delete button contact.
     */
    @FindBy(css = "[class='modal-container slds-modal__container'] [class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']" )
    private WebElement deleteBtn;

    /**
     * Web Element message save of profile contact page.
     */
    @FindBy(css = "[class='forceVisualMessageQueue'] [class='toastMessage slds-text-heading--small forceActionsText']")
    private WebElement contactMessageSaveTxt;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(profileContactHeader));
        wait.until(ExpectedConditions.visibilityOf(contactMessageSaveTxt));
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
     * Deletes contact.
     */
    @Override
    public void deleteContactProfilePage() {
        mainMenuCmbb.click();
        deleteOptionCmb.click();
        deleteBtn.click();
    }

    /**
     * Checks the section Details.
     *
     * @return ContactLightningDetails.
     */
    @Override
    public ContactDetailsAbstract checkDetailsSection() {
        clickContactDetailsTab();
        return new ContactLightningDetails();
    }
}
