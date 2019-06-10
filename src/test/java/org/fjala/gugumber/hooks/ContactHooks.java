package org.fjala.gugumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.fjala.gugumber.salesforce.api.ContactAPI;
import org.fjala.gugumber.salesforce.entities.Contact;
import org.fjala.gugumber.salesforce.entities.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * ContactHooks class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class ContactHooks {

    /**
     * Context of type context.
     */
    private final Context context;

    /**
     * Variable for contact.
     */
    private Contact contact;

    /**
     * Constructor of class.
     *
     * @param context of type context.
     */
    public ContactHooks(Context context) {
        this.context = context;
        this.contact = context.getContact();
    }

     /**
     * Deletes an contact by id after scenario.
     */
    @After("@delete-contact")
    public void afterScenario() {
        ContactAPI.getInstance().deleteContact(contact.getId());
    }

    /**
     * Creates a contact before scenario.
     */
    @Before("@create-contact")
    public void beforeScenario() {
        Map<String,String> createNewContat = new HashMap<>();
        createNewContat.put("LastName", "Contact_Test001");
        contact.setId(ContactAPI.getInstance().createContact(createNewContat));
    }
}
