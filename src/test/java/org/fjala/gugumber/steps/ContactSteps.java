package org.fjala.gugumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fjala.gugumber.salesforce.entities.Contact;
import org.fjala.gugumber.salesforce.entities.Context;
import org.fjala.gugumber.salesforce.ui.PageTransporter;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactForm;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactPageAbstract;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ProfileContactPage;

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
    private ContactPageAbstract contactPage;
    private ContactForm contactForm;
    private ProfileContactPage profileContactPage;

    public ContactSteps(Context context) {
        this.context = context;
        contact = context.getContact();
    }

    @When("^I open Contact form$")
    public void openContactForm() {
        contactForm = contactPage.clickNewContact();
    }

    @And("^I create a new Contact with the following information in Contact form$")
    public void CreateANewContactInContactForm(Map<String, String> contactMap) {
        contact.processInformation(contactMap);
        contactForm.setContactInformation(contactMap);
        profileContactPage = contactForm.clickSaveNewContact();
    }

//    @Then("^I should see a green message \"([^\"]*)\"$")
//    public void iShouldSeeAGreenMessage(String message) {
//        ProfileContactLightningPage profileContactLightningPage = new ProfileContactLightningPage();
//        assertEquals(message, profileContactLightningPage, "not successfully deleted");
//    }


    @Then("^the contact last name should be displayed in the Contact Profile page$")
    public void theContactLastNameShouldBeDisplayedInTheContactProfilePage() {
        assertTrue(profileContactPage.isTheNewContact());
    }
}
