/*
 * @(#) ContactSteps.java Copyright (c) 2019 Jala Foundation.
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

import static org.fjala.gugumber.salesforce.ui.PageLayoutType.LIGHTNING;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Map;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fjala.gugumber.core.selenium.utils.Logs;
import org.fjala.gugumber.salesforce.entities.Contact;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.ui.PageLayoutConfig;
import org.fjala.gugumber.salesforce.ui.PageLayoutFactory;
import org.fjala.gugumber.salesforce.ui.PageLayoutType;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactDetailsAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactFormAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactLightningProfilePage;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactProfilePageAbstract;

/**
 * ContactSteps class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactSteps {

    /**
     * Variable for the context.
     */
    private Context context;

    /**
     * Variable for the contact.
     */
    private Contact contact;

    /**
     * Variable with the page layout;
     */
    private PageLayoutType layout = PageLayoutConfig.getPageLayoutName();

    //pages
    /**
     * Variable for the Contact Page.
     */
    private ContactPageAbstract contactPage;

    /**
     * Variable for the Contact Form.
     */
    private ContactFormAbstract contactForm;

    /**
     * Variable for the Contact Profile Page.
     */
    private ContactProfilePageAbstract contactProfilePage;

    /**
     * Variable for the Contact Details.
     */
    private ContactDetailsAbstract contactDetails;

    /**
     * Constructor of contact steps sending the context.
     *
     * @param context init the context.
     */
    public ContactSteps(final Context context) {
        this.context = context;
        contact = context.getContact();
    }

    /**
     * Opens the contact form from contact page.
     */
    @When("^I open Contact form$")
    public void openContactForm() {
        contactPage = PageLayoutFactory.getContactPage();
    }

    /**
     * Creates a new contact sending the information.
     *
     * @param contactMap contains the contact's values
     */
    @When("^I create a new Contact with the following information in Contact form$")
    public void createANewContactInContactForm(final Map<String, String> contactMap) {
        contactForm = contactPage.clickNewContact();
        contact.processInformation(contactMap);
        contactForm.setContactInformation(contactMap);
        contactProfilePage = contactForm.clickSaveNewContact();
        contact.setId(contactProfilePage.getIdFromUrl());
    }

    /**
     * Verifies with a message of confirmation that the contact is saved.
     */
    @Then("^a message that indicates the Contact was created should be displayed$")
    public void displayMessageThatIndicatesTheContactWasCreated() {
        if (layout.equals(LIGHTNING)) {
            final ContactLightningProfilePage profileContactLightningPage = new ContactLightningProfilePage();
            final String message = (profileContactLightningPage.getMessageSave());
            assertEquals(message, "Contact was created.", "not successfully created");
        } else {
            Logs.getInstance().getLog().info("In classic Layout is not message of confirmation");
        }
    }

    /**
     * Verifies the information in the profile contact.
     */
    @Then("^the contact last name should be displayed in the Contact Profile page$")
    public void displayContactInTheContactProfilePage() {
        assertEquals(contactProfilePage.getFullNameTitleContact(), contact.getFullName(),"the Contact Name not displayed");
    }

    /**
     * Verifies that contact is displayed in the list of contact page.
     */
    @Then("^the contact last name should be displayed in the contacts list of Contacts page$")
    public void displayContactInTheContactsListOfContactsPage() {
        contactPage = PageLayoutFactory.getContactPage();
        System.out.println(" last name : " + contact.getFullNameContactList() + "  list : " + contactPage.getListOfContactsName());
        assertTrue(contactPage.getListOfContactsName().contains(contact.getFullNameContactList()), "the Contact Name not displayed");
    }

    /**
     * Opens the contact details from contact page.
     */
    @When("^I go to the Contact Details$")
    public void openTheContactDetailsPage() {
        contactDetails = contactProfilePage.checkDetailsSection();
    }

    /**
     * Verifies the information in the details contact.
     */
    @Then("^the contact last name should be displayed in the Contact Details page$")
    public void displayedContactInformationInTheContactDetailsPage() {
        assertEquals(contactDetails.getFullNameContact(), contact.getFullName(), "the Contact Name not displayed");
    }

//    @When("^I request the get of the contact$")
//    public void requestTheGetOfTheContact() {
//        ContactAPI.getInstance().readContact(contact.getId());
//    }
}
