package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;

/**
 * ContactDetailsAbstract class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public abstract class ContactDetailsAbstract extends BasePage {

    /**
     * Returns the Last Name of contact from a header profile.
     *
     * @return the last name of contact as string.
     */
    public abstract String getFullNameContact();

   /**
     * Returns an Contact profile page after clicking on save button.
     *
     * @return an Contact profile page.
     */
    public abstract ContactProfilePageAbstract openEditContactDetails();
}
