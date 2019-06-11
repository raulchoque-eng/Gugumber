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
     * Web Element delete button contact.
     */
    @FindBy(css = "[id='topButtonRow'] [name='del']" )
    private WebElement deleteBtn;

    /**
     * Web Element edit button contact.
     */
    @FindBy(css = "[id='topButtonRow'] [name='edit']" )
    private WebElement editBtn;

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
     * Deletes contact.
     */
    @Override
    public void deleteContactProfilePage() {
        deleteBtn.click();
        driver.switchTo().alert().accept();
    }

    /**
     * Updates contact.
     */
    @Override
    public ContactFormAbstract updateContactProfilePage() {
        editBtn.click();
        return new ContactClassicForm();
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
