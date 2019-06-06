/*
 * @(#) UrlComponents.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.utils;

import org.fjala.gugumber.core.selenium.utils.Logs;
import org.fjala.gugumber.salesforce.ui.PageLayoutConfig;
import org.fjala.gugumber.salesforce.ui.PageLayoutType;

import static org.fjala.gugumber.salesforce.ui.PageLayoutFactory.MESSAGE_FOR_UNKNOWN_LAYOUT;
import static org.fjala.gugumber.salesforce.ui.PageLayoutType.CLASSIC;
import static org.fjala.gugumber.salesforce.ui.PageLayoutType.LIGHTNING;

/**
 * UrlComponents class.
 *
 * @author Areliez Vargas.
 * @version 0.0.1
 */
public class UrlComponents {

    /**
     * Variable to save the page layout type.
     */
    private static PageLayoutType pageLayoutType = PageLayoutConfig.getPageLayoutName();

    /**
     * Constructor of UrlComponents.
     */
    protected UrlComponents() { }

    /**
     * Returns a new instance of url components.
     *
     * @return an urlComponents.
     */
    public static UrlComponents getInstance() {
        return new UrlComponents();
    }

    /**
     * Returns the id for a object from the url.
     *
     * @param url to do a split of the id.
     * @return the id as string.
     */
    public static String splitUrlToId(final String url) {
        String[] idArray = url.split("/");
        String id = "";
        if (pageLayoutType.equals(CLASSIC)) {
            id = idArray[idArray.length - 1];
        } else if (pageLayoutType.equals(LIGHTNING)) {
            id = idArray[idArray.length - 2];
        } else {
            Logs.getInstance().getLog().error(MESSAGE_FOR_UNKNOWN_LAYOUT);
        }
        return id;
    }
}
