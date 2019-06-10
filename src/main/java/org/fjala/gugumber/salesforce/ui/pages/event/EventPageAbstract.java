/*
 * @(#) EventPageAbstract.java Copyright (c) 2019 Jala Foundation.
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

import static org.fjala.gugumber.salesforce.keys.EventKeys.ASSIGNED_TO;
import static org.fjala.gugumber.salesforce.keys.EventKeys.DESCRIPTION;
import static org.fjala.gugumber.salesforce.keys.EventKeys.END_DATE;
import static org.fjala.gugumber.salesforce.keys.EventKeys.LOCATION;
import static org.fjala.gugumber.salesforce.keys.EventKeys.NAME;
import static org.fjala.gugumber.salesforce.keys.EventKeys.RELATED_TO;
import static org.fjala.gugumber.salesforce.keys.EventKeys.START_DATE;
import static org.fjala.gugumber.salesforce.keys.EventKeys.SUBJECT;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;
import org.fjala.gugumber.salesforce.ui.pages.utils.UrlComponents;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * EventPageAbstract abstract class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public abstract class EventPageAbstract extends BasePage {

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    public abstract WebElement getDetailEvent();

    /**
     * Return the Event page.
     *
     * @return an instance eventPageAbstract.
     */
    public abstract EventPageAbstract getEventPage();

    /**
     * Waist that event page is loaded.
     */
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(getDetailEvent()));
    }

    Map<String, String> eventDetailInMap = new HashMap<>();

    /**
     * Gets all values from event detail.
     *
     * @param keyEvent is the keys of Event into a set.
     */
    public Map<String, String> getEventDetail(final Set<String> keyEvent) {
        final HashMap<String, StrategySetter> strategyMap = composeStrategyMap();
        keyEvent.forEach(key -> strategyMap.get(key).executeMethod()

        );
        return eventDetailInMap;
    }

    /**
     * Composes an Strategy Map.
     *
     * @return an instance HashMap with keys and methods to run.
     */
    public HashMap<String, StrategySetter> composeStrategyMap() {
        final HashMap<String, StrategySetter> eventDetail = new HashMap<>();
        eventDetail.put(ASSIGNED_TO, () -> eventDetailInMap.put(ASSIGNED_TO, getAssignedToUser()));
        eventDetail.put(SUBJECT, () -> eventDetailInMap.put(SUBJECT, getSubject()));
        eventDetail.put(NAME, () -> eventDetailInMap.put(NAME, getNameContact()));
        eventDetail.put(RELATED_TO, () -> eventDetailInMap.put(RELATED_TO, getRelatedToAccount()));
        eventDetail.put(LOCATION, () -> eventDetailInMap.put(LOCATION, getLocation()));
        eventDetail.put(START_DATE, () -> eventDetailInMap.put(START_DATE, getStartDate()));
        eventDetail.put(END_DATE, () -> eventDetailInMap.put(END_DATE, getEndDate()));
        eventDetail.put(DESCRIPTION, () -> eventDetailInMap.put(DESCRIPTION, getDescription()));

        return eventDetail;
    }

    /**
     * Returns the assigned to user of a event detail.
     *
     * @return as a string the assigned to user of a event detail.
     */
    public abstract String getAssignedToUser();

    /**
     * Returns the subject of a event detail.
     *
     * @return as a string the subject of a event detail.
     */
    public abstract String getSubject();

    /**
     * Returns the name contact of a event detail.
     *
     * @return as a string the name contact of a event detail.
     */
    public abstract String getNameContact();

    /**
     * Returns the related to account of a event detail.
     *
     * @return as a string the related to account of a event detail.
     */
    public abstract String getRelatedToAccount();

    /**
     * Returns the location of a event detail.
     *
     * @return as a string the location of a event detail.
     */
    public abstract String getLocation();

    /**
     * Returns the start date of a event detail.
     *
     * @return as a string the start date of a event detail.
     */
    public abstract String getStartDate();

    /**
     * Returns the end date of a event detail.
     *
     * @return as a string the end date of a event detail.
     */
    public abstract String getEndDate();

    /**
     * Returns the description of a event detail.
     *
     * @return as a string the description of a event detail.
     */
    public abstract String getDescription();

    /**
     * Returns the id Event from url.
     *
     * @return id as string.
     */
    public String getIdEventFromUrl() {
        return UrlComponents.splitUrlToId(driver.getCurrentUrl());
    }
}
