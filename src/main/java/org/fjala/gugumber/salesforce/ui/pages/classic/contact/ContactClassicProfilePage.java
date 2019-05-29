package org.fjala.gugumber.salesforce.ui.pages.classic.contact;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ContactProfilePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactClassicProfilePage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactClassicProfilePage extends ContactProfilePage {

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "div[class='slds-grid primaryFieldRow']")
    private WebElement profileContactHeader;

    /**
     * Web Element of profile contact with title.
     */
    @FindBy(css = ".topName")
    private WebElement contactTitle;

     /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "[class='content'] [alt='Contact']")
    private WebElement contactIcon;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(profileContactHeader));
    }

    @Override
    public String getLastNameContact() {
        return null;
    }

    @Override
    public boolean isTheNewContact() {
        return false;
    }
}
