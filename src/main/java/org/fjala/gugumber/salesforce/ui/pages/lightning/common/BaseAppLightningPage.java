package org.fjala.gugumber.salesforce.ui.pages.lightning.common;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.BaseAppPage;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.NavBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * BaseAppLightningPage class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class BaseAppLightningPage extends BaseAppPage {

    /**
     * Locator for header of base page.
     */
    @FindBy(css = "[class='slds-global-header slds-grid slds-grid--align-spread']")
    private WebElement basePageHeader;

    /**
     * Waits until page object is loaded.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(basePageHeader));
    }

    /**
     * Gets for navBar.
     *
     * @return new navBar lighting.
     */
    @Override
    public NavBar getNavBar() {
        return new NavBarLightning();
    }
}
