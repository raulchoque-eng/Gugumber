package org.fjala.gugumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fjala.gugumber.salesforce.entities.Contact;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.ui.PageLayoutConfig;
import org.fjala.gugumber.salesforce.ui.PageLayoutFactory;
import org.fjala.gugumber.salesforce.ui.PageLayoutType;
import org.fjala.gugumber.salesforce.ui.PageTransporter;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactForm;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactProfilePage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.contact.ContactLightningProfilePage;

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

    private PageTransporter pageTransporter = PageTransporter.getInstance();
    private Context context;
    private Contact contact;

    //pages
    private ContactPageAbstract contactPage;
    private ContactForm contactForm;
    private ContactProfilePage contactProfilePage;

    public ContactSteps(Context context) {
        this.context = context;
        contact = context.getContact();
    }

    @When("^I open Contact form$")
    public void OpenContactForm() {
        contactPage = PageLayoutFactory.getContactsPage();
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
        try {
            ContactLightningProfilePage profileContactLightningPage = new ContactLightningProfilePage();
            final String message = (profileContactLightningPage.getMessageSave());
            assertEquals(message, "Contact was created.", "not successfully created");
        } catch (ClassCastException e) {
            System.out.println("In classic theme is not message of confirmation");
        }
    }


    @Then("^the contact last name should be displayed in the Contact Profile page$")
    public void theContactLastNameShouldBeDisplayedInTheContactProfilePage() {
        final String titleAux = contact.getSalutation() + contact.getFirstName() + contact.getLastName();
        assertEquals(contactProfilePage.getLastNameContact(),titleAux,"the Contact Last name not displayed");
//        assertTrue(contactProfilePage.isTheNewContact());
    }


}
