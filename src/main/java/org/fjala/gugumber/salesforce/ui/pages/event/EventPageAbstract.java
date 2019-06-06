/*
 * @(#) EventPageAbstract.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.event;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * EventPageAbstract abstract class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public abstract class EventPageAbstract extends BasePage {

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    public abstract WebElement getDetailEvent();

    /**
     * Return the Event page.
     *
     * @return an instance eventPageAbstract.
     */
    public abstract EventPageAbstract getEventPage();

    /**
     * Waist that event page is loaded.
     */
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(getDetailEvent()));
    }
}
