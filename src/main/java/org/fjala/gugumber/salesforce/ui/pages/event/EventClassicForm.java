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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
     * Web element for a user to assign event.
     */
    @FindBy(id = "evt1")
    private WebElement userTxtb;

    /**
     * Web element for a location of a new Event.
     */
    @FindBy(css = "div#ep div.pbBody > div:nth-child(4) > table tr:nth-child(1) td:nth-child(4) > input")
    private WebElement locationTxtb;

    /**
     * Web element for a subject.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(2) td:nth-child(2) input")
    private WebElement subjectTxtb;

    /**
     * Web element for a start date of a new Event.
     */
    @FindBy(id = "StartDateTime")
    private WebElement startDateTxtb;

    /**
     * Web element for the start time of a new Event.
     */
    @FindBy(id = "StartDateTime_time")
    private WebElement startTimeTxtb;

    /**
     * Web element for search the contact of a new Event.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(3) td:nth-child(2) select")
    private WebElement nameCmbbx;

    /**
     * Web element for the contact of a new Event.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(3) td:nth-child(2) span.lookupInput input")
    private WebElement nameTxtb;

    /**
     * Web element for the end of a new Event.
     */
    @FindBy(id = "EndDateTime")
    private WebElement endDateTxtb;

    /**
     * Web element for the end time of a new Event.
     */
    @FindBy(id = "EndDateTime_time")
    private WebElement endTimeTxtb;

    /**
     * Web element for search an related to account of a new Event.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(6) td:nth-child(2) select")
    private WebElement relatedToAccountCmbbx;

    /**
     * Web element for select the related to account of a new Event.
     */
    @FindBy(css = "div#ep > div.pbBody > div:nth-child(4) > table tr:nth-child(6) td:nth-child(2) span.lookupInput [title=\"Related To\"]")
    private WebElement relatedToAccountTxtb;

    /**
     * Web element for the Description of a new Event.
     */
    @FindBy(css = "td.last.data2Col > textarea")
    private WebElement descriptionTxtar;

    /**
     * Web element by the event save of a new Event.
     */
    @FindBy(css = "td#bottomButtonRow [name = \"save\"]")
    private WebElement saveEventBtn;

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
        userTxtb.sendKeys(Keys.chord(Keys.CONTROL, "a"), assignedToUser);
    }

    /**
     * Sets the location in a Event classic form sending a string.
     *
     * @param location as a string.
     */
    @Override
    public void setLocation(final String location) {
        DriverMethods.setTxt(locationTxtb, location);
    }

    /**
     * Sets the subject in a Event classic form sending a string.
     *
     * @param subject as a string.
     */
    @Override
    public void setSubject(final String subject) {
        DriverMethods.setTxt(subjectTxtb, subject);
    }

    /**
     * Cleans the text box and set new value using javascript.
     *
     * @param element - element to set text.
     * @param text    - Value to fill in input.
     */
    private void setInputFieldJavaScript(final WebElement element, final String text) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = ''", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1]", element, text);
    }

    /**
     * Sets the startDate in a Event classic form sending a string by validate the date.
     *
     * @param startDate as a Date.
     */
    @Override
    public void setStartDate(final String startDate) {
        final String[] dateTime = startDate.split(" ");
        final String date = dateTime[0];
        final String time = dateTime[1];
        DriverMethods.setTxt(startDateTxtb, date);
        DriverMethods.setTxt(startTimeTxtb, time);
    }

    /**
     * Sets the nameContact in a Event classic form sending a string.
     *
     * @param nameContact as a string.
     */
    @Override
    public void setNameContact(final String nameContact) {
        DriverMethods.setTxt(nameTxtb, nameContact);
    }

    /**
     * Sets the endDate in a Event classic form sending a string by validate the date.
     *
     * @param endDate as a Date.
     */
    @Override
    public void setEndDate(final String endDate) {
        final String[] dateTime = endDate.split(" ");
        final String date = dateTime[0];
        final String time = dateTime[1];
        DriverMethods.setTxt(endDateTxtb, date);
        DriverMethods.setTxt(endTimeTxtb, time);
    }

    /**
     * Sets the relatedToAccount in a Event classic form sending a string.
     *
     * @param relatedToAccount as a string.
     */
    @Override
    public void setRelatedToAccount(final String relatedToAccount) {
        final String locatorBySelect = "//option[contains(text(), 'nameTitle')]";
        relatedToAccountCmbbx.click();
        DriverMethods.selectCmb(driver, locatorBySelect, "Account");
        DriverMethods.setTxt(relatedToAccountTxtb, relatedToAccount);
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

    /**
     * Returns a WebElement by create new Event.
     *
     * @return a saveEventBtn web element
     */
    @Override
    public WebElement getSaveEventBtn() {
        return saveEventBtn;
    }
}
