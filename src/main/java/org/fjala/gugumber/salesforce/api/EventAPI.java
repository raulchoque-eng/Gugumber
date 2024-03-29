/*
 * @(#) EventAPI.java Copyright (c) 2019 Jala Foundation.
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

import static org.fjala.gugumber.salesforce.api.Endpoints.EVENT_ENDPOINT;

import java.util.Map;

import io.restassured.response.Response;
import org.fjala.gugumber.salesforce.api.rest.client.RestClientAPI;

/**
 * EventAPI class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class EventAPI {

    /**
     * Variable for the rest client.
     */
    private RestClientAPI restClient;

    /**
     * Variable for the final endpoint.
     */
    private String finalEndpoint;

    /**
     * Constructor of AccountAPI.
     */
    protected EventAPI() {
        restClient = RestClientAPI.getInstance();
    }

    /**
     * Returns the instance the event API.
     *
     * @return a event API.
     */
    public static EventAPI getInstance() {
        return new EventAPI();
    }

    /**
     * Deletes an event by id.
     *
     * @param eventId to event with the base endpoint.
     */
    public void deleteEvent(final String eventId) {
        finalEndpoint = EVENT_ENDPOINT.concat("/".concat(eventId));
        final Response response = restClient.delete(finalEndpoint);
    }

    /**
     * Creates an event.
     *
     * @param newEvent to sent the body of the request.
     * @return the id of event created.
     */
    public String createEvent(final Map<String, String> newEvent) {
        finalEndpoint = EVENT_ENDPOINT;
        final Response response = restClient.post(finalEndpoint, newEvent);
        return response.body().jsonPath().getString("id");
    }
}
