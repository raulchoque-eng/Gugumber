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

import java.util.Map;

/**
 * Event class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class Event {
    private User assignedToUser;
    private String subject;
    private Contact name;
    private Account relatedToAccount;
    private String location;
    private String startDate;
    private String endDate;
    private String Description;

    public User getAssignedToUser() {
        return assignedToUser;
    }

    public void setAssignedToUser(User assignedToUser) {
        this.assignedToUser = assignedToUser;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Contact getName() {
        return name;
    }

    public void setName(Contact name) {
        this.name = name;
    }

    public Account getRelatedToAccount() {
        return relatedToAccount;
    }

    public void setRelatedToAccount(Account relatedToAccount) {
        this.relatedToAccount = relatedToAccount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setRequiredData(Map<String, String> newEvent) {
    }

    public boolean isEqualEvent(Map<String, String> eventFormData) {
        System.out.println("TODO");
        return true;
    }
}
