package org.fjala.gugumber.salesforce.ui.pages.classic.common;

import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.NavBar;
import org.fjala.gugumber.salesforce.ui.pages.abstracts.common.BaseAppPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * BaseAppClassicPage class.
 *
 * @author Cxrisstian
 * @version 0.0.1
 */
public class BaseAppClassicPage extends BaseAppPage {

//    private NavBar navBar;
    @FindBy(id = "AppBodyHeader")
    private WebElement basePageHeader;

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(basePageHeader));
    }

    @Override
    public NavBar getNavBar() {
        return new NavBarClassic();
    }
}
