package org.fjala.gugumber.salesforce.ui;

import org.fjala.gugumber.core.selenium.common.ReaderDriverProperties;

public class PageLayoutConfig {
    public static PageLayoutConfig getInstance() {
        return new PageLayoutConfig();
    }

    /**
     * Gets the browser in which the tests are being executed.
     *
     * @return browser.
     */
    public String getPageLayoutName() {
        return ReaderDriverProperties.getInstance().getDriverProperties().get("type-layout");
    }

}
