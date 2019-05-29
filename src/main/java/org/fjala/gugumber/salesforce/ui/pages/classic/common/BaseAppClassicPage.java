package org.fjala.gugumber.salesforce.ui.pages.classic.common;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.BaseAppPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * BaseAppClassicPage class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class BaseAppClassicPage extends BaseAppPage {

    /**
     * Locator for header of base page.
     */
    @FindBy(id = "AppBodyHeader")
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
     * @return new navBar Classic.
     */
    @Override
    public NavBar getNavBar() {
        return new NavBarClassic();
    }
}
