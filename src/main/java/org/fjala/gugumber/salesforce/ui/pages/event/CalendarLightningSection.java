/*
 * @(#) CalendarLightningSection.java Copyright (c) 2019 Jala Foundation.
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
 * CalendarLightningSection class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class CalendarLightningSection extends CalendarSectionAbstract {

    /**
     * Web element by verify the calendar section.
     */
    @FindBy(css = "[data-component-id=\"home_eventContainer\"]")
    private WebElement calendarSct;

    /**
     * Web element by subject the new Event.
     */
    @FindBy(css = "div.listContent ul li.horizontalContainer.homeEventCardStencil.forceRecordLayout:last-child div.verticalContainer a span")
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
     * Returns the even page details from Event lightning page.
     *
     * @return an instance event lightning page.
     */
    @Override
    public EventPageAbstract getEventDetails() {
        subjectNewEventLnk.click();
        return new EventLightningPage();
    }

    /**
     * Opens the even lightning page details.
     *
     * @return an instance event lightning page.
     */
    @Override
    public EventPageAbstract openEvent(){
        subjectNewEventLnk.click();
        return new EventLightningPage();
    }
}
