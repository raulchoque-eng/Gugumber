/*
 * @(#) HomeClassicPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.Home;

import org.fjala.gugumber.salesforce.ui.pages.event.CalendarClassicSection;
import org.fjala.gugumber.salesforce.ui.pages.event.CalendarSectionAbstract;
import org.fjala.gugumber.salesforce.ui.pages.event.EventClassicForm;
import org.fjala.gugumber.salesforce.ui.pages.event.EventFormAbstract;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * HomeClassicPage class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class HomeClassicPage extends HomePage {

    /**
     * Web element for the body the the home page in layout classic.
     */
    @FindBy(css = "div[class='bodyDiv brdPalette brandPrimaryBrd']")
    private WebElement bodyHomePage;

    /**
     * Web element to open the event form.
     */
    @FindBy(name = "newEvent")
    private WebElement newEventBtn;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(bodyHomePage));
    }

    /**
     * Opens the event form.
     *
     * @return an instance eventClassicForm.
     */
    public EventFormAbstract openEventForm() {
        newEventBtn.click();
        return new EventClassicForm();
    }

    /**
     * Returns the CalendarSectionAbstract of a HomeClassicPage.
     *
     * @return a instance of CalendarClassicSection class.
     */
    public CalendarSectionAbstract getCalendarSection() {
        return new CalendarClassicSection();
    }
}
