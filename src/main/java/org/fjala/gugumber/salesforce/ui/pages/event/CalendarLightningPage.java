/*
 * @(#) CalendarLightningPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.event;

import org.fjala.gugumber.core.selenium.utils.DriverMethods;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * CalendarLightningPage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class CalendarLightningPage extends BasePage {

    /**
     * Web element for the calendar header.
     */
    @FindBy(css = "div.calendarRow")
    private WebElement calendarHeader;


    /**
     * Web element for open the  event form.
     */
    @FindBy(css = "button.new-event-button")
    private WebElement newEventBtn;

    /**
     * Web Element of successful message after create an new Event.
     */
    @FindBy(css = "span[data-aura-class=\"forceActionsText\"]")
    private WebElement contactMessageSaveTxt;

    /**
     * Web Element of close message after create an new Event.
     */
    @FindBy(css = "button[title='Close']")
    private WebElement closeMessageBtn;

    /**
     * Waits until the calendar page is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(calendarHeader));
    }

    /**
     * Opens EventForm from Calendar page.
     *
     * @return an instance EventForm.
     */
    public EventFormAbstract openEventForm() {
        DriverMethods.waitUntilElementIsClickable(driver, newEventBtn);
        newEventBtn.click();
        return new EventLightningForm();
    }

    /**
     * Verifies the successful message is close.
     */
    public void verifyMessajeSuccessfulIsClose() {
        final WebElement myDynamicElement = (new WebDriverWait(driver, 10)).
                until(ExpectedConditions.presenceOfElementLocated(By.
                        cssSelector("span[data-aura-class=\"forceActionsText\"]")));
        DriverMethods.waitUntilElementIsClickable(driver, closeMessageBtn);
        closeMessageBtn.click();
    }
}
