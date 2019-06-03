package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;

/**
 * ContactDetailsPageAbstract class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public abstract class ContactDetailsPageAbstract extends BasePage {

   /**
     * Returns an Contact profile page after clicking on save button.
     *
     * @return an Contact profile page.
     */
    public abstract ContactProfilePageAbstract clickSaveContact();
}
