package org.fjala.gugumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.fjala.gugumber.salesforce.entities.Contact;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.ui.PageTransporter;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactForm;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPage;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ProfileContactPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.contact.ProfileContactLightningPage;

import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * ContactSteps class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactSteps {

    private PageTransporter pageTransporter = PageTransporter.getInstance();
    private Context context;
    private Contact contact;

    //pages
    private ContactPage contactPage;
    private ContactForm contactForm;
    private ProfileContactPage profileContactPage;

    public ContactSteps(Context context) {
        this.context = context;
        contact = context.getContact();
    }

    @And("^I create a new Contact with the following information$")
    public void CreateANewContact(Map<String,String> contactMap) {
        contact.processInformation(contactMap);
        contactPage = pageTransporter.getContactPage();
        contactForm = contactPage.clickNewContact();
        contactForm.setContactInformation(contactMap);
        profileContactPage = contactForm.clickSaveNewContact();
    }

    //    @Then("^I should see a green message \"([^\"]*)\"$")
//    public void iShouldSeeAGreenMessage(String message) {
//        ProfileContactLightningPage profileContactLightningPage = new ProfileContactLightningPage();
//        assertEquals(message, profileContactLightningPage, "not successfully deleted");
//    }

    @Then("^The contact should displayed on contact page$")
    public void contactShouldDisplayedOnContactPage() {
        assertTrue(profileContactPage.verifyNewContact());
    }

}
