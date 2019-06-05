/*
 * @(#) EventClassicForm.java Copyright (c) 2019 Jala Foundation.
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
import org.fjala.gugumber.salesforce.utils.DateMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;
import java.util.LinkedList;
import java.util.Set;

/**
 * EventClassicForm class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class EventClassicForm extends EventFormAbstract {

    /**
     * Web element by validate the Event form is open.
     */
    @FindBy(id = "ep")
    private WebElement eventForm;

    /**
     * Web element by search a new user to assign event.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(1) td:nth-child(2) img.lookupIcon")
    private WebElement searchUserImg;

    /**
     * Web element by the location.
     */
    @FindBy(css = "div#ep div.pbBody > div:nth-child(4) > table tr:nth-child(1) td:nth-child(4) > input")
    private WebElement locationTxt;

    /**
     * Web element by the subject.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(2) td:nth-child(2) input")
    private WebElement subjectTxt;

    /**
     * Web element by the start date.
     */
    @FindBy(id = "StartDateTime")
    private WebElement startDateTxt;

    /**
     * Web element by the start time.
     */
    @FindBy(id = "StartDateTime_time")
    private WebElement startTimeTxt;

    /**
     * Web element by search the contact.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(3) td:nth-child(2) select")
    private WebElement nameCmbbx;

    /**
     * Web element by the contact.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(3) td:nth-child(2) span.lookupInput input")
    private WebElement nameTxt;

    /**
     * Web element by the end date.
     */
    @FindBy(id = "EndDateTime")
    private WebElement endDateTxt;

    /**
     * Web element by the end time.
     */
    @FindBy(id = "EndDateTime_time")
    private WebElement endTimeTxt;

    /**
     * Web element by search an related to user.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(6) td:nth-child(2) select")
    private WebElement relatedToAccountCmbbx;

    /**
     * Web element by select the related to user.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(6) td:nth-child(2) span.lookupInput [title=\"Related To\"]")
    private WebElement relatedToAccountTxt;

    /**
     * Web element by the Description.
     */
    @FindBy(css = "td.last.data2Col > textarea")
    private WebElement descriptionTxtar;

    /**
     * Creates a new Event with the event information.
     *
     * @param event     is a event to get the information.
     * @param keysEvent is a set of key of references.
     */

    /**
     * Waits until the Event classical form is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(eventForm));
    }

    /**
     * Sets the assignedToUser in a Event classic form sending a string.
     *
     * @param assignedToUser as a string.
     */
    @Override
    public void setAssignedToUser(final String assignedToUser) {
        searchUserImg.click();
        final String parentWindowHandle = driver.getWindowHandle();
        final Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(new LinkedList<>(windows).getLast());
        driver.switchTo().frame("resultsFrame");
        driver.findElement(By.cssSelector("table.list tr:nth-child(2) th:nth-child(1) a")).click();
        driver.switchTo().window(parentWindowHandle);
    }

    /**
     * Sets the location in a Event classic form sending a string.
     *
     * @param location as a string.
     */
    @Override
    public void setLocation(final String location) {
        DriverMethods.setTxt(locationTxt, location);
    }

    /**
     * Sets the subject in a Event classic form sending a string.
     *
     * @param subject as a string.
     */
    @Override
    public void setSubject(final String subject) {
        DriverMethods.setTxt(subjectTxt, subject);
    }

    /**
     * Sets the startDate in a Event classic form sending a string by validate the date.
     *
     * @param startDate as a Date.
     */
    @Override
    public void setStartDate(final Date startDate) {
        final String pattern = "dd-MM-yyyy";
        DriverMethods.setTxt(startDateTxt, DriverMethods.convertDateToString(startDate, pattern));
        DriverMethods.setTxt(startTimeTxt, DateMethods.getHourBefore(startDate, 2));
    }

    /**
     * Sets the nameContact in a Event classic form sending a string.
     *
     * @param nameContact as a string.
     */
    @Override
    public void setNameContact(final String nameContact) {
        DriverMethods.setTxt(nameTxt, nameContact);
    }

    /**
     * Sets the endDate in a Event classic form sending a string by validate the date.
     *
     * @param endDate as a Date.
     */
    @Override
    public void setEndDate(final Date endDate) {
        final String pattern = "dd-MM-yyyy";
        DriverMethods.setTxt(endDateTxt, DriverMethods.convertDateToString(endDate, pattern));
        DriverMethods.setTxt(endTimeTxt, DateMethods.getHourBefore(endDate, 3));
    }

    /**
     * Sets the relatedToAccount in a Event classic form sending a string.
     *
     * @param relatedToAccount as a string.
     */
    @Override
    public void setRelatedToAccount(final String relatedToAccount) {
        final String locatorBySelect = "//option[contains(text(), 'nameTitle')]";
        DriverMethods.selectCmb(relatedToAccountCmbbx, driver, locatorBySelect, "Account");
        DriverMethods.setTxt(relatedToAccountTxt, relatedToAccount);
    }

    /**
     * Sets the description in a Event classic form sending a string.
     *
     * @param description as a string.
     */
    @Override
    public void setDescription(final String description) {
        DriverMethods.setTxt(descriptionTxtar, description);
    }
}
