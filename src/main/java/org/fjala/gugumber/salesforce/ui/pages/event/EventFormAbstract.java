/*
 * @(#) EventFormAbstract.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.event;

import static org.fjala.gugumber.salesforce.keys.EventKeys.ASSIGNED_TO;
import static org.fjala.gugumber.salesforce.keys.EventKeys.DESCRIPTION;
import static org.fjala.gugumber.salesforce.keys.EventKeys.END_DATE;
import static org.fjala.gugumber.salesforce.keys.EventKeys.LOCATION;
import static org.fjala.gugumber.salesforce.keys.EventKeys.NAME;
import static org.fjala.gugumber.salesforce.keys.EventKeys.RELATED_TO;
import static org.fjala.gugumber.salesforce.keys.EventKeys.START_DATE;
import static org.fjala.gugumber.salesforce.keys.EventKeys.SUBJECT;

import java.util.HashMap;
import java.util.Set;

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.entities.Event;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;
import org.openqa.selenium.WebElement;

/**
 * EventFormAbstract class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public abstract class EventFormAbstract extends BasePage {

    /**
     * Returns a WebElement by create new Event.
     *
     * @return a saveEventBtn web element
     */
    public abstract WebElement getSaveEventBtn();

    /**
     * Creates a new Event with the event information.
     *
     * @param event     by create a new event.
     * @param keysEvent by references the values.
     */
    public void createEvent(final Event event, final Set<String> keysEvent) {
        final HashMap<String, StrategySetter> strategyMap = composesStrategyMap(event);
        keysEvent.forEach(key -> strategyMap.get(key).executeMethod());
        getSaveEventBtn().click();
    }

    /**
     * Return an Strategy Map with the "newEvent" parameter.
     *
     * @param event is an instance Event.
     * @return an instance HashMap with keys and methods to run.
     */
    private HashMap<String, StrategySetter> composesStrategyMap(final Event event) {
        final HashMap<String, StrategySetter> strategyMap = new HashMap<>();
        strategyMap.put(ASSIGNED_TO, () -> setAssignedToUser(event.getAssignedToUser()));
        strategyMap.put(SUBJECT, () -> setSubject(event.getSubject()));
        strategyMap.put(NAME, () -> setNameContact(event.getNameContact()));
        strategyMap.put(RELATED_TO, () -> setRelatedToAccount(event.getRelatedToAccount()));
        strategyMap.put(LOCATION, () -> setLocation(event.getLocation()));
        strategyMap.put(START_DATE, () -> setStartDate(event.getStartDateToString()));
        strategyMap.put(END_DATE, () -> setEndDate(event.getEndDateToString()));
        strategyMap.put(DESCRIPTION, () -> setDescription(event.getDescription()));
        return strategyMap;
    }

    /**
     * Sets the assignedToUser in a Event classic form sending a string.
     *
     * @param assignedToUser as a string.
     */
    public abstract void setAssignedToUser(final String assignedToUser);

    /**
     * Sets the subject in a Event classic form sending a string.
     *
     * @param subject as a string.
     */
    public abstract void setSubject(final String subject);

    /**
     * Sets the nameContact in a Event classic form sending a string.
     *
     * @param nameContact as a string.
     */
    public abstract void setNameContact(final String nameContact);

    /**
     * Sets the relatedToAccount in a Event classic form sending a string.
     *
     * @param relatedToAccount as a string.
     */
    public abstract void setRelatedToAccount(final String relatedToAccount);

    /**
     * Sets the location in a Event classic form sending a string.
     *
     * @param location as a string.
     */
    public abstract void setLocation(final String location);

    /**
     * Sets the startDate in a Event classic form sending a string by validate the date.
     *
     * @param startDate as a Date.
     */
    public abstract void setStartDate(final String startDate);

    /**
     * Sets the endDate in a Event classic form sending a string by validate the date.
     *
     * @param endDate as a Date.
     */
    public abstract void setEndDate(final String endDate);

    /**
     * Sets the description in a Event classic form sending a string.
     *
     * @param description as a string.
     */
    public abstract void setDescription(final String description);
}
