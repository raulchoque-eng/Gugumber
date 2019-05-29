package org.fjala.gugumber.salesforce.ui.pages.lightning.common;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.BaseAppPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * BaseAppLightningPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class BaseAppLightningPage extends BaseAppPage {

    @FindBy(css = "[class='slds-global-header slds-grid slds-grid--align-spread']")
    private WebElement basePageHeader;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(basePageHeader));
    }

    @Override
    public NavBar getNavBar() {
        return new NavBarLightning();
    }


}
