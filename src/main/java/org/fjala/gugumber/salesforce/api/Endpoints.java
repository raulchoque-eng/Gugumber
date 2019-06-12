/*
 * @(#) Endpoints.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.api;

/**
 * Endpoints class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class Endpoints {

    /**
     * Constant to concat with the endpoint.
     */
    public static final String SLASH = "/";

    /**
     * Endpoint of Account.
     */
    public static final String ACCOUNT_ENDPOINT = "/Account";

    /**
     * Endpoint of contact.
     */
    public static final String CONTACT_ENDPOINT = "/Contact";

    /**
     * Endpoint of event.
     */
    public static final String EVENT_ENDPOINT = "/Event";

    /**
     * Constructor protected.
     */
    protected Endpoints() { }
}
