/*
 * @(#) EventHooks.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.hooks;

import cucumber.api.java.After;
import org.fjala.gugumber.salesforce.api.EventAPI;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.entities.Event;

/**
 * EventHooks class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class EventHooks {

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for event.
     */
    private Event event;

    /**
     * Constructor of event hooks sending the context.
     *
     * @param context init the context.
     */
    public EventHooks(Context context) {
        this.context = context;
        event = context.getEvent();
    }

    /**
     * Deletes an account by id after scenario.
     */
    @After("@delete-event")
    public void afterScenario() {
        EventAPI.getInstance().deleteEvent(event.getId());
    }
}
