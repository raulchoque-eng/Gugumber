/*
 * @(#) ContactAPI.java Copyright (c) 2019 Jala Foundation .
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.api;

import io.restassured.response.Response;

import static org.fjala.gugumber.salesforce.api.Endpoints.CONTACT_ENDPOINT;

/**
 * ContactAPI class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactAPI {
    /**
     * Variable for the rest client.
     */
    private RestClientAPI restClient;

    /**
     * Variable for the final endpoint.
     */
    private String finalEndpoint;

    /**
     * Constructor of ContactAPI.
     */
    protected ContactAPI() {
        restClient = RestClientAPI.getInstance();
    }

    /**
     * Returns the instance the contact API.
     *
     * @return a Contact API.
     */
    public static ContactAPI getInstance() {
        return new ContactAPI();
    }

    /**
     * Deletes an contact by id.
     *
     * @param contactId to concat with the base endpoint.
     */
    public void deleteContact(final String contactId) {
        finalEndpoint = CONTACT_ENDPOINT.concat("/".concat(contactId));
        final Response response = restClient.delete(finalEndpoint);
    }
}
