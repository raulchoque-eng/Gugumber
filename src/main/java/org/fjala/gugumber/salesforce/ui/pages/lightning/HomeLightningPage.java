/*
 * @(#) HomeLightningPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.lightning;

import org.fjala.gugumber.salesforce.ui.pages.lightning.contact.ContactLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * HomeLightningPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class HomeLightningPage extends HomePage {

    @FindBy(id = "brandBand_1")
    private WebElement homeForm;

    @FindBy(css = "a[href*='Contact'][href*=lightning]")
    private WebElement contactMenuBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(homeForm));
    }

    /**
     * Contact menu button.
     */
    public void clickContactMenu() {
        contactMenuBtn.click();
    }

    /**
     * Click in the contact button.
     * @return Contact Lightning Page.
     */
    public ContactLightningPage goContactLightningPage() {
        clickContactMenu();
        return new ContactLightningPage();
    }
}
