/*
 * @(#) ContactSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fjala.gugumber.core.selenium.utils.Logs;
import org.fjala.gugumber.salesforce.entities.Contact;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.ui.PageLayoutConfig;
import org.fjala.gugumber.salesforce.ui.PageLayoutFactory;
import org.fjala.gugumber.salesforce.ui.PageLayoutType;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactForm;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactProfilePage;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactLightningProfilePage;

import java.util.Map;

import static org.fjala.gugumber.salesforce.ui.PageLayoutType.LIGHTNING;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
    private ContactForm contactForm;

    /**
     * Variable for the Contact Profile Page.
     */
    private ContactProfilePage contactProfilePage;

    /**
     * Constructor of contact steps sending the context.
     *
     * @param context init the context.
     */
    public ContactSteps(Context context) {
        this.context = context;
        contact = context.getContact();
    }

    @When("^I open Contact form$")
    public void OpenContactForm() {
        contactPage = PageLayoutFactory.getContactPage();
        contactForm = contactPage.clickNewContact();
    }

    @And("^I create a new Contact with the following information in Contact form$")
    public void CreateANewContactInContactForm(Map<String, String> contactMap) {
        contact.processInformation(contactMap);
        contactForm.setContactInformation(contactMap);
        contactProfilePage = contactForm.clickSaveNewContact();
    }

    @Then("^a message that indicates the Contact was created should be displayed$")
    public void MessageThatIndicatesTheContactWasCreated() {
        if (layout.equals(LIGHTNING)) {
            ContactLightningProfilePage profileContactLightningPage = new ContactLightningProfilePage();
            final String message = (profileContactLightningPage.getMessageSave());
            assertEquals(message, "Contact was created.", "not successfully created");
        } else {
            Logs.getInstance().getLog().info("In classic Layout is not message of confirmation");
        }
    }

    @Then("^the contact last name should be displayed in the Contact Profile page$")
    public void theContactLastNameShouldBeDisplayedInTheContactProfilePage() {
        assertEquals(contactProfilePage.getFullNameTitleContact(), contact.getFullName(),"the Contact Last name not displayed");
//        assertTrue(contactProfilePage.isTheNewContact());
    }

    @Then("^the contact last name should be displayed in the contacts list of Contacts page$")
    public void theContactLastNameShouldBeDisplayedInTheContactsListOfContactsPage() {
        assertTrue(contactPage.getListOfContactsName().contains(contact.getLastName()));
    }
}
