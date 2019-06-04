package org.fjala.gugumber.salesforce.ui.pages.contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ContactLightningDetailsPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class ContactLightningDetailsPage extends ContactDetailsPageAbstract {

    /**
     *
     */
    @FindBy(css = "div[class='test-id__record-layout-container riseTransitionEnabled']")
    private WebElement contactDetailsForm;

    /**
     * List of web elements for contact dates.
     */
    @FindBy(css = "span[class='test-id__field-value slds-form-element__static slds-grow ']")
    private List<WebElement> contactElementsList;

    @FindBy(css = "span[class='test-id__field-value slds-form-element__static slds-grow ']")
    private List<WebElement> List;


    @Override
    public ContactProfilePageAbstract clickSaveContact() {
        return null;
    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {

    }
}
