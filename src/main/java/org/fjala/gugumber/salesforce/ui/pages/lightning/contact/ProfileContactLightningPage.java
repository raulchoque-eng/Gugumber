package org.fjala.gugumber.salesforce.ui.pages.lightning.contact;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts.ProfileContactPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ProfileContactLightningPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ProfileContactLightningPage extends ProfileContactPage {

    /**
     * Web Element of profile contact form.
     */
    @FindBy(css = "div[class='slds-grid primaryFieldRow']")
    private WebElement profileContactHeader;

    @FindBy(css = "span[class='custom-truncate uiOutputText']")
    private WebElement contactTitle;

    @FindBy(css = "[class='toastMessage slds-text-heading--small forceActionsText']")
    private WebElement contactMessageSaveTxt;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(profileContactHeader));
    }

    public String getMessageSave() {
        return contactMessageSaveTxt.getText();
    }

    @Override
    public String getLastNameContact() {
        return contactTitle.getText();
    }

    @Override
    public boolean isTheNewContact() {
        return contactTitle.isDisplayed();
    }
}
