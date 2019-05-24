/*
 * @(#) WebDriveFactory.java Copyright (c) 2019 Jala Foundation.
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
 * @author Cxrisstian
 * @version 0.0.1
 */
public class Context {
    private Contact contact;

    /**
     * Context for creation of the constructor.
     */
    public Context() {
        this.contact = new Contact();
    }

    /**
     * Get contact.
     * @return contact.
     */
    public Contact getContact() {
        return contact;
    }
}
