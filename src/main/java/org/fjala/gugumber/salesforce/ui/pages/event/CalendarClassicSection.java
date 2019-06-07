/*
 * @(#) CalendarClassicSection.java Copyright (c) 2019 Jala Foundation.
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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * CalendarClassicSection class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class CalendarClassicSection extends CalendarSectionAbstract {

    /**
     * Web element for verify the calendar section.
     */
    @FindBy(id = "homeCalendarSection")
    private WebElement calendarSct;

    /**
     * Web element for subject the new Event.
     */
    @FindBy(css = "ul.homeCalendarEvents li:last-child a")
    private WebElement subjectNewEventLnk;

    /**
     * Waits until the calendar section is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(calendarSct));
    }

    /**
     * Returns the subject of the new Event.
     *
     * @return subject as a string
     */
    @Override
    public String getSubjectNewEvent() {
        return subjectNewEventLnk.getText();
    }

    /**
     * Returns the even page details from the Event classic page.
     *
     * @return an instance event classic page.
     */
    @Override
    public EventPageAbstract getEventDetails() {
        subjectNewEventLnk.click();
        return new EventLightningPage();
//        return new EventClassicPage();
    }
}
