package org.fjala.gugumber.salesforce.ui;

import org.fjala.gugumber.salesforce.ui.pages.HomePage;
import org.fjala.gugumber.salesforce.ui.pages.classic.HomeClassicPage;
import org.fjala.gugumber.salesforce.ui.pages.lightning.HomeLightningPage;

public class PageLayouFactory {
    public static HomePage getManager(PageLayoutType type) {
        HomePage homePage;
        switch (type) {
            case CLASSIC:
                homePage = new HomeClassicPage();
                break;
            case LIGHTNING:
                homePage = new HomeLightningPage();
                break;
            default:
                homePage = new HomeClassicPage();
                break;
        }
        return homePage;
    }
}
