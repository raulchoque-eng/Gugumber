/*
 * @(#) EventSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.steps;

import static org.fjala.gugumber.salesforce.ui.PageLayoutType.CLASSIC;
import static org.fjala.gugumber.salesforce.ui.PageLayoutType.LIGHTNING;
import static org.testng.Assert.assertEquals;

import java.util.Map;
import java.util.Set;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.entities.Event;
import org.fjala.gugumber.salesforce.ui.PageLayoutConfig;
import org.fjala.gugumber.salesforce.ui.PageLayoutFactory;
import org.fjala.gugumber.salesforce.ui.PageLayoutType;
import org.fjala.gugumber.salesforce.ui.PageTransporter;
import org.fjala.gugumber.salesforce.ui.pages.Home.HomeClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.Home.HomePage;
import org.fjala.gugumber.salesforce.ui.pages.event.CalendarLightningPage;
import org.fjala.gugumber.salesforce.ui.pages.event.EventFormAbstract;
import org.fjala.gugumber.salesforce.ui.pages.event.EventPageAbstract;

/**
 * EventSteps class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class EventSteps {

    /**
     * Variable for the even form.
     */
    private EventFormAbstract eventForm;

    /**
     * Variable for the even.
     */
    private Event event;

    /**
     * Variable for home page.
     */
    private HomePage homePage;

    /**
     * Variable for the calendar page.
     */
    private CalendarLightningPage calendarPage;

    /**
     * Variable by the page layout type.
     */
    private PageLayoutType layout;

    private EventPageAbstract eventPage;

    /**
     * Builds an instance from EventSteps class.
     *
     * @param context to init context.
     */
    public EventSteps(Context context) {
        this.event = context.getEvent();
        layout = PageLayoutConfig.getPageLayoutName();
    }

    /**
     * Opens the Event form.
     */
    @When("^I open the New Event form$")
    public void openNewEventForm() {
        if (layout == CLASSIC) {
            homePage = PageLayoutFactory.getHomePageManager();
            eventForm = ((HomeClassicPage) homePage).openEventForm();
        } else {
            calendarPage = PageTransporter.getInstance().navigateToCalendarPage();
            eventForm = calendarPage.openEventForm();
        }
    }

    /**
     * Adds a new event with the following information.
     *
     * @param newEvent is the information for create a new event.
     */
    @When("^I add a new Event with the following information$")
    public void addNewEventWithFollowingInformation(Map<String, String> newEvent) {
        event.setDataToEvent(newEvent);
        Set<String> keysEvent = newEvent.keySet();
        eventForm.createEvent(event, keysEvent);
    }

    /**
     * Verifies the Subject of the new Event on calendar section.
     */
    @Then("^the Subject of new Event should be displayed on Calendar Section$")
    public void validateSubjectNameOfNewEvent() {
        if (layout == LIGHTNING) {
            calendarPage = new CalendarLightningPage();
            calendarPage.verifyMessageSuccessfulIsClose();
            homePage = PageTransporter.getInstance().navigateToHomePage();
        }
        final String nameSubject = homePage.getCalendarSection().getSubjectNewEvent();
        assertEquals(nameSubject, event.getSubject());
    }

    /**
     * Opens the event detail from calendar section.
     */
    @When("^I open the Event Details page from Calendar Section$")
    public void openEventDetailFromCalendarSection() {
        eventPage = homePage.getCalendarSection().getEventDetails();
        event.setId(eventPage.getIdEventFromUrl());
    }

    /**
     * Verifies the details of the new Event.
     */
    @Then("^the information of new Event should be displayed in Event Detail page$")
    public void validateEventDetail() {
        Set<String> eventKeys = event.getEventKeys();
        Map<String, String> evenDetailMap = eventPage.getEventDetail(eventKeys);
        Map<String, String> evenMap = event.getEventInMap();
        eventKeys.forEach(key -> assertEquals(evenMap.get(key), evenDetailMap.get(key)));
    }

    /**
     * Opens an Event page.
     */
    @When("^I open the Event that with subject with name Launch$")
    public void openEvent() {
        System.out.println("Hello WORLD!!!!");
        eventPage = homePage.getCalendarSection().getEventDetails();
        eventPage = homePage.getCalendarSection().openEvent();
    }
}
