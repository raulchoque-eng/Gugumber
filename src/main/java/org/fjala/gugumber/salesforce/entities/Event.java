/*
 * @(#) Event.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.entities;

import static org.fjala.gugumber.salesforce.keys.EventKeys.ASSIGNED_TO;
import static org.fjala.gugumber.salesforce.keys.EventKeys.DESCRIPTION;
import static org.fjala.gugumber.salesforce.keys.EventKeys.END_DATE;
import static org.fjala.gugumber.salesforce.keys.EventKeys.LOCATION;
import static org.fjala.gugumber.salesforce.keys.EventKeys.NAME;
import static org.fjala.gugumber.salesforce.keys.EventKeys.RELATED_TO;
import static org.fjala.gugumber.salesforce.keys.EventKeys.START_DATE;
import static org.fjala.gugumber.salesforce.keys.EventKeys.SUBJECT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.utils.DateMethods;

/**
 * Event class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class Event {

    /**
     * Variable for the id of event.
     */
    private String id;

    /**
     * Saves value of variable "Assigned To", to create an Event.
     */
    private String assignedToUser;

    /**
     * Saves value of variable "Subject", to create an Event.
     */
    private String subject;

    /**
     * Saves value of variable "Name", to create an Event.
     */
    private String nameContact;

    /**
     * Saves value of variable "Related To", to create an Event.
     */
    private String relatedToAccount;

    /**
     * Saves value of variable "Location", to create an Event.
     */
    private String location;

    /**
     * Saves value of variable "Start Date", to create an Event.
     */
    private Date startDate;

    /**
     * Saves value of variable "Start Time", to create an Event.
     */
    private String startTime;

    /**
     * Saves value of variable "End Date", to create an Event.
     */
    private Date endDate;

    /**
     * Saves value of variable "End Time", to create an Event.
     */
    private String endTime;

    /**
     * Saves value of variable "Description", to create an Event.
     */
    private String description;

    /**
     * Returns the id from an event.
     *
     * @return as a string the id of a event.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of event sending a string.
     *
     * @param id for the event.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the assignedToUser of a Event.
     *
     * @return assignedToUser as a string
     */
    public String getAssignedToUser() {
        return assignedToUser;
    }

    /**
     * Sets the assignedToUser in a Event sending a string.
     *
     * @param assignedToUser as a string.
     */
    public void setAssignedToUser(final String assignedToUser) {
        this.assignedToUser = assignedToUser;
    }

    /**
     * Returns the subject of a Event.
     *
     * @return subject as a string
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject in a Event sending a string.
     *
     * @param subject as a String.
     */
    public void setSubject(final String subject) {
        this.subject = subject;
    }

    /**
     * Returns the name of a Event.
     *
     * @return name as a string.
     */
    public String getNameContact() {
        return nameContact;
    }

    /**
     * Sets the nameContact in a Event sending a string.
     *
     * @param nameContact as a String.
     */
    public void setNameContact(final String nameContact) {
        this.nameContact = nameContact;
    }

    /**
     * Returns the relatedToAccount of a Event.
     *
     * @return relatedToAccount as a string
     */
    public String getRelatedToAccount() {
        return relatedToAccount;
    }

    /**
     * Sets the relatedToAccount in a Event sending a string.
     *
     * @param relatedToAccount as a string.
     */
    public void setRelatedToAccount(final String relatedToAccount) {
        this.relatedToAccount = relatedToAccount;
    }

    /**
     * Returns the location of a Event.
     *
     * @return location as a string.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location in a Event sending a string.
     *
     * @param location as a string.
     */
    public void setLocation(final String location) {
        this.location = location;
    }

    /**
     * Returns the startDate of a Event.
     *
     * @return startDate as a Date.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the startDate in a Event sending a string by validate the date.
     *
     * @param startDate as a string.
     */
    public void setStartDate(final String startDate) {
        if (startDate.equals("One hour from now")) {
            this.startDate = new Date();
        }
    }

    /**
     * Returns the endDate of a Event.
     *
     * @return endDate as a Date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the endDate in a Event sending a string by validate the date.
     *
     * @param endDate as a string.
     */
    public void setEndDate(final String endDate) {
        if (endDate.equals("Two hours from now")) {
            this.endDate = new Date();
        }
    }

    /**
     * Gets the value assigned to "description" variable.
     *
     * @return a string, this is "description" variable.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description in a Event sending a string.
     *
     * @param description as a string.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Sets all values send into the "newEvent" parameter.
     *
     * @param newEvent is an Event into Map.
     */
    public void setDataToEvent(final Map<String, String> newEvent) {
        final HashMap<String, StrategySetter> strategyMap = composeStrategyMap(newEvent);
        newEvent.keySet().forEach(key -> strategyMap.get(key).executeMethod());
    }

    /**
     * Composes an Strategy Map with the "newEvent" parameter.
     *
     * @param newEvent is an Event into Map.
     * @return an instance HashMap with keys and methods to run.
     */
    private HashMap<String, StrategySetter> composeStrategyMap(final Map<String, String> newEvent) {
        final HashMap<String, StrategySetter> strategyHashMap = new HashMap<>();
        strategyHashMap.put(ASSIGNED_TO, () -> setAssignedToUser(newEvent.get("Assigned To")));
        strategyHashMap.put(SUBJECT, () -> setSubject(newEvent.get("Subject")));
        strategyHashMap.put(NAME, () -> setNameContact(newEvent.get("Name")));
        strategyHashMap.put(RELATED_TO, () -> setRelatedToAccount(newEvent.get("Related To")));
        strategyHashMap.put(LOCATION, () -> setLocation(newEvent.get("Location")));
        strategyHashMap.put(START_DATE, () -> setStartDate(newEvent.get("Start Date")));
        strategyHashMap.put(END_DATE, () -> setEndDate(newEvent.get("End Date")));
        strategyHashMap.put(DESCRIPTION, () -> setDescription(newEvent.get("Description")));
        return strategyHashMap;
    }

    /**
     * Returns the start date as a string of an event.
     *
     * @return as a string the start date.
     */
    public String getStartDateToString() {
        return DateMethods.getHourBefore(getStartDate(), 2);
    }

    /**
     * Returns the end date as a string of an event.
     *
     * @return as a string the and date.
     */
    public String getEndDateToString() {
        return DateMethods.getHourBefore(getEndDate(), 3);
    }
}
