/*
 * @(#) Context.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.entities;

/**
 * Context class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class Context {

    /**
     * contact of type contact.
     */
    private Contact contact;

    /**
     * Account to manage in the context.
     */
    private Account account;

    /**
     * Event to manage in the context.
     */
    private Event event;

    /**
     * User to manage in the context.
     */
    private User user;

    /**
     * Context for creation of the constructor.
     */
    public Context() {
        this.contact = new Contact();
        this.account = new Account();
        this.event = new Event();
        this.user = new User();
    }

    /**
     * Returns the contact of context.
     *
     * @return contact.
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Returns the account of context.
     *
     * @return an account.
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Returns the Event of context.
     *
     * @return an instance Event, this is "event" variable.
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Returns the User of context.
     *
     * @return an instance Event.
     */
    public User getUser() {
        return user;
    }
}
