package org.fjala.gugumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

/**
 * EventSteps class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class EventSteps {
    private EventForm eventForm = new EventForm;
    private Event event;

    public EventSteps(Event event) {
        this.event = event;
    }

    @When("^I open the form Event from Home page$")
    public void openFormEvent(){
        eventForm.openForm();
    }

    @When("^I add a new Event with the following data$")
    public void addNewEvent(Map<String, String> newEvent) {
        event.setRequiredData(newEvent);
        eventForm.createEvent(event);
    }

    @Then("^the Subject of new Event should be displayed on Calendar Section$")
    public void validateNameEvent() {
        assertEquals(eventForm.getNameEvent(), event.getName());
    }

    @When("^I open the Subject link$")
    public void openEventDetail() {
        eventForm.openDetail();
    }

    @Then("^the Event Detail section should be displayed$")
    public void validateEventDetail() {
        Map<String, String> eventFormData = eventForm.getData();
        assertTrue(event.isEqualEvent(eventFormData));
    }
}
