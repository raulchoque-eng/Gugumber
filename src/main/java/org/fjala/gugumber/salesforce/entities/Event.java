package org.fjala.gugumber.salesforce.entities;

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
}
