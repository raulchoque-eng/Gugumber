/*
 * @(#) GeneratorReport.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 *  with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.app;

import org.fjala.gugumber.salesforce.ui.pages.components.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.components.NavBarLightning;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * BaseAppLightningPage class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class BaseAppLightningPage extends BaseAppPageAbstract {

    /**
     * Locator for switchPage link.
     */
    @FindBy(id = "[data-aura-class='oneUserProfileCardTrigger'] [data-aura-class='uiTooltip']")
    private WebElement viewProfileBtn;

    /**
     * Locator for switchPage link.
     */
    @FindBy(id = "a[class='profile-link-label switch-to-aloha uiOutputURL']")
    private WebElement switchPage;

    /**
     * Locator for header of base page.
     */
    @FindBy(css = "[class='slds-global-header slds-grid slds-grid--align-spread']")
    private WebElement basePageHeader;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(basePageHeader));
    }

    /**
     * Gets for navBar.
     *
     * @return new navBar lighting.
     */
    @Override
    public NavBar getNavBar() {
        return new NavBarLightning();
    }

    /**
     * Clicks on the link to change of layout.
     */
    public void clickOnViewProfileBtn() {
        viewProfileBtn.click();
    }

    /**
     * Clicks on the link to change of layout.
     */
    @Override
    public void clickSwitchLayout() {
        clickOnViewProfileBtn();
        switchPage.click();
    }
}
