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

package org.fjala.gugumber.salesforce.ui.pages.Home;

import org.fjala.gugumber.salesforce.ui.pages.event.CalendarLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.event.EventFormAbstract;
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

    /**
     * Web element for the body the the home page in layout classic.
     */
    @FindBy(id = "brandBand_1")
    private WebElement homeForm;

    /**
     * Web element "appLauncherBtn",by validate HomeLightningPage.
     */
    @FindBy(css = "button.slds-button div.slds-icon-waffle")
    private WebElement appLauncherBtn;

    /**
     * Web element "eventLnk",by open CalendarLightningPage.
     */
    @FindBy(css = "[class='narrow homeHomeCard homeEventContainer'] [class='viewAllLink']")
    private WebElement eventLnk;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(appLauncherBtn));
    }

    /**
     * Opens the Calendar from lightning page.
     *
     * @return an instance of "CalendarLightningPage".
     */
    private CalendarLightningPage openCalendarLightningPage() {
        eventLnk.click();
        return new CalendarLightningPage();
    }

    /**
     * Opens the Event form to create an Event.
     *
     * @return a EventForm class.
     */
    @Override
    public EventFormAbstract openEventForm() {
        final CalendarLightningPage calendarPage = openCalendarLightningPage();
        return calendarPage.openEventForm();
    }
}
