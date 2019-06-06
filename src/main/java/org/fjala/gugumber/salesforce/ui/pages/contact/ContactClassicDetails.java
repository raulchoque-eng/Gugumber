/*
 * @(#) ContactClassicDetails.java Copyright (c) 2019 Jala Foundation.
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

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactClassicDetails class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactClassicDetails extends ContactDetailsAbstract {

    /**
     * Web Element of details contact.
     */
    @FindBy(id = "ep")
    private WebElement contactDetailsForm;

    /**
     * Web Element of details contact.
     */
    @FindBy(id = "con2_ileinner")
    private WebElement nameTxtb;

    /**
     * List of web elements for contact dates.
     */
    @FindBy(css = "span[class='test-id__field-value slds-form-element__static slds-grow ']")
    private List<WebElement> contactElementsList;

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
     * @return contact classic form.
     */
    @Override
    public ContactProfilePageAbstract openEditContactDetails() {
        return null;
    }
}
