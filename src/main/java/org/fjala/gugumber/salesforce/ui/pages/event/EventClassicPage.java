/*
 * @(#) EventClassicPage.java Copyright (c) 2019 Jala Foundation.
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

/**
 * EventClassicPage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class EventClassicPage extends EventPageAbstract {

    /**
     * Web element for verify the event classic page is open.
     */
    @FindBy(id = "ep")
    private WebElement detailEvent;

    /**
     * Web element for verifies the assigned to user.
     */
    @FindBy(xpath = "//div[@id='evt1_ileinner']//span/a[last()]")
    private WebElement assignedToUserLnk;

    /**
     * Web element for verifies the subject of a Event.
     */
    @FindBy(xpath = "//td[text()='Subject']/following-sibling::td[1]//div")
    private WebElement subjectTxtb;

    /**
     * Web element for verifies the name of a Event.
     */
    @FindBy(xpath = "//td[text()='Name']/following-sibling::td[@class='dataCol col02']//a")
    private WebElement nameContactLnk;

    /**
     * Web element for verifies the related to account of a Event.
     */
    @FindBy(xpath = "//td[text()='Related To']/following-sibling::td[@class='dataCol col02']//a")
    private WebElement relatedToAccountLnk;

    /**
     * Web element for verifies the description of a Event.
     */
    @FindBy(xpath = "//td[text()='Description']/following-sibling::td//div")
    private WebElement descriptionTxtb;

    /**
     * Web element for verifies the location of a Event.
     */
    @FindBy(xpath = "//td[text()='Location']/following-sibling::td//div")
    private WebElement locationTxtb;

    /**
     * Web element for verifies the start date of a Event.
     */
    @FindBy(id = "StartDateTime_ileinner")
    private WebElement startDateTxtb;

    /**
     * Web element for verifies the end date of a Event.
     */
    @FindBy(id = "EndDateTime_ileinner")
    private WebElement endDateTxtb;

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    @Override
    public WebElement getDetailEvent() {
        return detailEvent;
    }

    /**
     * Returns the event page type EventClassicPage.
     *
     * @return an instance eventClassicPage.
     */
    @Override
    public EventPageAbstract getEventPage() {
        return new EventClassicPage();
    }

    /**
     * Returns the assigned to user of a Event.
     *
     * @return as a string the assigned to user of a Event.
     */
    @Override
    public String getAssignedToUser() {
        return assignedToUserLnk.getText();
    }

    /**
     * Returns the subject of a Event.
     *
     * @return as a string the subject of a Event.
     */
    @Override
    public String getSubject() {
        return subjectTxtb.getText();
    }

    /**
     * Returns the name contact of a Event.
     *
     * @return as a string the name contact of a Event.
     */
    @Override
    public String getNameContact() {
        return nameContactLnk.getText();
    }

    /**
     * Returns the related to account of a Event.
     *
     * @return as a string the related to account of a Event.
     */
    @Override
    public String getRelatedToAccount() {
        return relatedToAccountLnk.getText();
    }

    /**
     * Returns the location of a Event.
     *
     * @return as a string the location of a Event.
     */
    @Override
    public String getLocation() {
        return locationTxtb.getText();
    }

    /**
     * Returns the start date of a Event.
     *
     * @return as a string start date of a Event.
     */
    @Override
    public String getStartDate() {
        return startDateTxtb.getText();
    }

    /**
     * Returns the end date of a Event.
     *
     * @return as a string end date of a Event.
     */
    @Override
    public String getEndDate() {
        return endDateTxtb.getText();
    }

    /**
     * Returns the description of a Event.
     *
     * @return as a string the description of a Event.
     */
    @Override
    public String getDescription() {
        return descriptionTxtb.getText();
    }
}
