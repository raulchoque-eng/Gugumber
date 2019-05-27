/*
 * @(#) ContactLightningPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.lightning.contact;

import org.fjala.gugumber.salesforce.ui.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactLightningPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactLightningPage extends HomePage {

    /**
     *
     */
    @FindBy(css = "div[class='slds-brand-band slds-brand-band_cover slds-brand-band_medium slds-template_bottom-magnet brand-band_magnetic forceBrandBand']")
    private WebElement newContactModal;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newContactModal));
    }


}
