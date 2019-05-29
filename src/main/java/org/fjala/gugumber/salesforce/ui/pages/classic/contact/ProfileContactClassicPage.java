package org.fjala.gugumber.salesforce.ui.pages.classic.contact;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ProfileContactPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ProfileContactClassicPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ProfileContactClassicPage extends ProfileContactPage {

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "div[class='slds-grid primaryFieldRow']")
    private WebElement profileContactHeader;

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = ".topName")
    private WebElement contactTitle;


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
