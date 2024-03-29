/*
 * @(#) ContactLightningPage.java Copyright (c) 2019 Jala Foundation.
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

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactLightningPage class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactLightningPage extends ContactPageAbstract {

    /**
     * Web Element form Contact
     */
    @FindBy(css = "div[class='slds-brand-band slds-brand-band_cover slds-brand-band_medium slds-template_bottom-magnet brand-band_magnetic forceBrandBand']")
    private WebElement newContactForm;

    /**
     * Web Element message delete of contact page.
     */
    @FindBy(css = "[class='forceVisualMessageQueue'] [class='toastMessage slds-text-heading--small forceActionsText']")
    private WebElement contactMessageDeleteTxt;

    /**
     * List of web elements for contacts name.
     */
    @FindBy(css = "a[class='slds-truncate outputLookupLink slds-truncate forceOutputLookup']")
    private List<WebElement> contactNameList;

    /**
     * Web Element form Contact
     */
    @FindBy(css = "a[Title='New']")
    private WebElement newContactBtn;

    final String FULL_NAME_LIST = "[scope='row'] a[title='titleOfList']";

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newContactForm));
    }

    /**
     * Clicks new contact button.
     */
    private void clickNewContactBtn() {
        newContactBtn.click();
    }

    /**
     * Gets New Contact form.
     *
     * @return new profile contact lighting form.
     */
    @Override
    public ContactFormAbstract clickNewContact() {
        clickNewContactBtn();
        return new ContactLightningForm();
    }

    /**
     * Gets a list of last names contact from the contact page.
     *
     * @return a list with the name contact.
     */
    @Override
    public List<String> getListOfContactsName() {
        wait.until(ExpectedConditions.stalenessOf(contactNameList.get(0)));
        final List<String> contactName = new ArrayList<>();
        try {
            for (WebElement contName : contactNameList) {
                contactName.add(contName.getText());
            }
        } catch (StaleElementReferenceException sere) {
             contactNameList = driver.findElements(
                    By.cssSelector(
                        "a[class='slds-truncate outputLookupLink slds-truncate forceOutputLookup']"));
            for (WebElement contName : contactNameList) {
                contactName.add(contName.getText());
            }
        }
        return contactName;
    }

    /**
     * Checks name in contact List.
     *
     * @param name string.
     * @return boolean.
     */
    @Override
    public boolean isDisplayedNewContact(String name) {
        return driver.findElement(By.cssSelector(FULL_NAME_LIST.replace("titleOfList", name))).isDisplayed();
    }

    /**
     * Clicks at the last name for open contact profile page.
     *
     * @param text as String.
     */
    public ContactProfilePageAbstract openContactProfile(final String text) {
        driver.findElement(By.cssSelector(FULL_NAME_LIST.replace("titleOfList", text))).click();
        return new ContactLightningProfilePage();
    }

    /**
     * Gets message of deleted.
     *
     * @return the message.
     */
    public String getMessageDelete() {
        return contactMessageDeleteTxt.getText();
    }
}

