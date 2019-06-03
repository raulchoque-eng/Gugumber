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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;

/**
 * Event class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class Event {

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
        newEvent.keySet().forEach(key -> {
            strategyMap.get(key).executeMethod();
            System.out.println("Event object: " + key);
        });
    }

    /**
     * Composes an Strategy Map with the "newEvent" parameter.
     *
     * @param newEvent is an Event into Map.
     * @return an instance HashMap with keys and methods to run.
     */
    private HashMap<String, StrategySetter> composeStrategyMap(final Map<String, String> newEvent) {
        final HashMap<String, StrategySetter> strategyHashMap = new HashMap<>();
        strategyHashMap.put("Assigned To", () -> setAssignedToUser(newEvent.get("Assigned To")));
        strategyHashMap.put("Subject", () -> setSubject(newEvent.get("Subject")));
        strategyHashMap.put("Name", () -> setNameContact(newEvent.get("Name")));
        strategyHashMap.put("Related To", () -> setRelatedToAccount(newEvent.get("Related To")));
        strategyHashMap.put("Location", () -> setLocation(newEvent.get("Location")));
        strategyHashMap.put("Start Date", () -> setStartDate(newEvent.get("Start Date")));
        strategyHashMap.put("End Date", () -> setEndDate(newEvent.get("End Date")));
        strategyHashMap.put("Description", () -> setDescription(newEvent.get("Description")));
        return strategyHashMap;
    }
}
