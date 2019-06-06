/*
 * @(#) EventClassicPage.java Copyright (c) 2019 Jala Foundation.
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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * EventClassicPage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class EventClassicPage extends EventPageAbstract {

    /**
     * Web element by verify the event classic page is open.
     */
    @FindBy(id = "bodyCell")
    private WebElement detailEvent;

    /**
     * Returns a web element for verify the detail event is open.
     *
     * @return an instance web element.
     */
    @Override
    public WebElement getDetailEvent() {
        return detailEvent;
    }

    /**
     * Returns the event page type EventClassicPage.
     *
     * @return an instance eventClassicPage.
     */
    @Override
    public EventPageAbstract getEventPage() {
        return new EventClassicPage();
    }
}
