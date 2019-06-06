/*
 * @(#) EventLightningForm.java Copyright (c) 2019 Jala Foundation.
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;

/**
 * EventLightningForm class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class EventLightningForm extends EventFormAbstract {

    /**
     * Web element by validate the Event form is open.
     */
    @FindBy(css = "div.modal-header h2.title")
    private WebElement titleFormLbl;

    /**
     * Web element by the event form.
     */
    @FindBy(css = "div.modal-container slds-modal__container")
    private WebElement eventForm;

    /**
     * Web element by search a new user to assign event.
     */
    @FindBy(css = "div.uiInput a.deleteAction")
    private WebElement closeLnk;

    /**
     * Web element by the subject.
     */
    @FindBy(css = "div.modal-body input[id ^= \"input\"]")
    private WebElement subjectTxt;

    /**
     * Web element by the contact.
     */
    @FindBy(css = "div.modal-body input[title = \"Search Contacts\"]")
    private WebElement contactCmbbx;

    /**
     * Web element by the account.
     */
    @FindBy(css = "div.modal-body input[title = \"Search Accounts\"]")
    private WebElement accountCmbbx;

    /**
     * Web element by the location.
     */
    @FindBy(css = "div.modal-body div.uiInputText input.input")
    private WebElement locationTxt;

    /**
     * Web element by the start date.
     */
    @FindBy(css = "div.modal-body div.slds-grid.slds-gutters_small:nth-of-type(2) div.dateTime-inputDate input")
    private WebElement startDateTxt;

    /**
     * Web element by the start time.
     */
    @FindBy(css = "div.modal-body div.slds-grid.slds-gutters_small:nth-of-type(2) div.dateTime-inputTime input")
    private WebElement startTimeTxt;

    /**
     * Web element by the end date.
     */
    @FindBy(css = "div.modal-body div.slds-grid.slds-gutters_small:nth-of-type(3) div.dateTime-inputDate input")
    private WebElement endDateTxt;

    /**
     * Web element by the end time.
     */
    @FindBy(css = "div.modal-body div.slds-grid.slds-gutters_small:nth-of-type(3) div.dateTime-inputTime input")
    private WebElement endTimeTxt;

    /**
     * Web element by check all days.
     */
    @FindBy(css = "div.modal-body input[type = \"checkbox\"]")
    private WebElement allDaysCbox;

    /**
     * Web element by the description.
     */
    @FindBy(css = "span#quickTextKeyboardTip ~ textarea")
    private WebElement descriptionTxtar;

    /**
     * Web element by the event save.
     */
    @FindBy(css = "[title=\"Save\"]")
    private WebElement saveEventBtn;

    /**
     * Waits until the event form is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(titleFormLbl));
    }

    /**
     * Sets the assignedToUser in a Event form sending a string.
     *
     * @param username as a string.
     */
    @Override
    public void setAssignedToUser(final String username) {
        final String locatorBySelect = "[title = \"nameTitle\"]";
        closeLnk.click();
        DriverMethods.selectCmb(driver, locatorBySelect, username);
    }

    /**
     * Sets the subject in a Event lightning form sending a string.
     *
     * @param subject sets the "Subject" value.
     */
    @Override
    public void setSubject(final String subject) {
        DriverMethods.setTxt(subjectTxt, subject);
    }

    /**
     * Sets the nameContact in a Event lightning form sending a string.
     *
     * @param nameContact as a string.
     */
    @Override
    public void setNameContact(final String nameContact) {
        final String locatorBySelect = "[title = \"nameTitle\"]";
        contactCmbbx.click();
        DriverMethods.selectCmb(driver, locatorBySelect, nameContact);
    }

    /**
     * Sets the relatedToAccount in a Event lightning form sending a string.
     *
     * @param relatedToAccount as a string.
     */
    @Override
    public void setRelatedToAccount(final String relatedToAccount) {
        final String locatorBySelect = "[title = \"nameTitle\"]";
        accountCmbbx.click();
        DriverMethods.selectCmb(driver, locatorBySelect, relatedToAccount);
    }

    /**
     * Sets the location in a Event lightning form sending a string.
     *
     * @param location as a string.
     */
    @Override
    public void setLocation(final String location) {
        DriverMethods.setTxt(locationTxt, location);
    }

    /**
     * Sets the description in a Event lightning form sending a string.
     *
     * @param description as a string.
     */
    @Override
    public void setDescription(final String description) {
        DriverMethods.setTxt(descriptionTxtar, description);
    }

    /**
     * Sets the startDate in a Event lightning form sending a string by validate the date.
     *
     * @param startDate as a Date.
     */
    @Override
    public void setStartDate(final Date startDate) {
        final String pattern = "dd-MM-yyyy";
        DriverMethods.setTxt(startDateTxt, DriverMethods.convertDateToString(startDate, pattern));
        setInputFieldJavaScript(startTimeTxt, DateMethods.getHourBefore(startDate, 2));
    }

    /**
     * Sets the endDate in a Event lightning form sending a string by validate the date.
     *
     * @param eventEndDate as a Date.
     */
    @Override
    public void setEndDate(final Date eventEndDate) {
        final String pattern = "dd-MM-yyyy";
        DriverMethods.setTxt(endDateTxt, DriverMethods.convertDateToString(eventEndDate, pattern));
        setInputFieldJavaScript(endTimeTxt, DateMethods.getHourBefore(eventEndDate, 3));
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
     * Returns a WebElement by create new Event.
     *
     * @return a saveEventBtn web element
     */
    @Override
    public WebElement getSaveEventBtn() {
        return saveEventBtn;
    }
}
