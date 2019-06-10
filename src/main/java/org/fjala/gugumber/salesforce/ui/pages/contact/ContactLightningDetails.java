/*
 * @(#) ContactLightningDetails.java Copyright (c) 2019 Jala Foundation.
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
 * ContactLightningDetails class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactLightningDetails extends ContactDetailsAbstract {

    /**
     *
     */
    @FindBy(css = "div[class='test-id__record-layout-container riseTransitionEnabled']")
    private WebElement contactDetailsForm;

    /**
     * Locator for text box of Name.
     */
    @FindBy(css = "[data-aura-rendered-by^='103'] [class='uiOutputText']")
    private WebElement nameTxtb;

    /**
     * Web element for verifies the subject of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Account Name']]/following-sibling::div//span[@class='test-id__field-value slds-form-element__static slds-grow ']")
    private WebElement accountNameTxtb;

    /**
     * Web element for verifies the name contact of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Title']]/following-sibling::div//span[@class='test-id__field-value slds-form-element__static slds-grow ']")
    private WebElement titleTxtb;

    /**
     * Web element for verifies the related to account of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Phone']]/following-sibling::div//span[@class='test-id__field-value slds-form-element__static slds-grow ']")
    private WebElement phoneTxtb;

    /**
     * Wen element for verifies the description of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Description']]/following-sibling::div//span[@class='uiOutputTextArea']")
    private WebElement descriptionTxtb;

    /**
     * Web element for verifies the location of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Location']]/following-sibling::div//span[@class='uiOutputText']")
    private WebElement locationTxtb;

    /**
     * Web element for verifies the start date of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Start']]/following-sibling::div//span[@class='uiOutputDateTime']")
    private WebElement startDateTxtb;

    /**
     * Web element for verifies the end date of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'End']]/following-sibling::div//span[@class='uiOutputDateTime']")
    private WebElement endDateTxtb;


    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(contactDetailsForm));
    }

    /**
     * Gets of contact name.
     *
     * @return new contact name.
     */
    @Override
    public String getFullNameContact() {
        return nameTxtb.getText();
    }

    /**
     * Gets of contact form.
     *
     * @return contact lightning form.
     */
    @Override
    public ContactProfilePageAbstract openEditContactDetails() {
        return null;
    }

}
