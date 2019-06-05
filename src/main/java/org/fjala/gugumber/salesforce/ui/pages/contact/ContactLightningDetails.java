package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * ContactLightningDetails class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactLightningDetails extends ContactDetailsAbstract {

    /**
     *
     */
    @FindBy(css = "div[class='test-id__record-layout-container riseTransitionEnabled']")
    private WebElement contactDetailsForm;

    /**
     * Locator for text box of Name.
     */
    @FindBy(css = "[data-aura-rendered-by^='10229'] [class='uiOutputText']")
    private WebElement nameTxtb;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(contactDetailsForm));
    }

    /**
     * Gets of contact name.
     *
     * @return new contact name.
     */
    @Override
    public String getFullNameContact() {
        return nameTxtb.getText();
    }

    @Override
    public ContactProfilePageAbstract openEditContactDetails() {
        return null;
    }

}
