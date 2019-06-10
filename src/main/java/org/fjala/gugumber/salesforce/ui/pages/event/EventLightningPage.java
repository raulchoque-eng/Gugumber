/*
 * @(#) EventLightningPage.java Copyright (c) 2019 Jala Foundation.
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
 * EventLightningPage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class EventLightningPage extends EventPageAbstract {

    /**
     * Web element for verifies the event lightning page is open.
     */
    @FindBy(css = "div.full.forcePageBlock.forceRecordLayout")
    private WebElement detailEvent;

    /**
     * Web element for verifies the assigned to user.
     */
    @FindBy(css = "div.ownerName a")
    private WebElement assignedToUserLnk;

    /**
     * Web element for verifies the subject of a Event.
     */
    @FindBy(xpath = "//div[span[text()='Subject']]/following-sibling::div//span[@class='uiOutputText']")
    private WebElement subjectTxtb;

    /**
     * Web element for verifies the name contact of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Name']]/following-sibling::div//a[@data-refid='recordId']")
    private WebElement nameContactLnk;

    /**
     * Web element for verifies the related to account of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Related To']]/following-sibling::div//a[@data-refid='recordId']")
    private WebElement relatedToAccountLnk;

    /**
     * Wen element for verifies the description of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Description']]/following-sibling::div//span[@class='uiOutputTextArea']")
    private WebElement descriptionTxtb;

    /**
     * Web element for verifies the location of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Location']]/following-sibling::div//span[@class='uiOutputText']")
    private WebElement locationTxtb;

    /**
     * Web element for verifies the start date of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'Start']]/following-sibling::div//span[@class='uiOutputDateTime']")
    private WebElement startDateTxtb;

    /**
     * Web element for verifies the end date of a Event.
     */
    @FindBy(xpath = "//div[span[text() = 'End']]/following-sibling::div//span[@class='uiOutputDateTime']")
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
     * Returns the event page type EventLightningPage.
     *
     * @return an instance eventLightningPage.
     */
    @Override
    public EventPageAbstract getEventPage() {
        return new EventLightningPage();
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
