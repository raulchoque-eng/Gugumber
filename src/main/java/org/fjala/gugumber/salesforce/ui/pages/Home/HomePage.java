/*
 * @(#) HomePage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.Home;

import org.fjala.gugumber.salesforce.ui.pages.BasePage;
import org.fjala.gugumber.salesforce.ui.pages.event.CalendarSectionAbstract;

/**
 * HomePage class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public abstract class HomePage extends BasePage {

    /**
     * Returns the calendarSection of a HomePage.
     *
     * @return a instance of CalendarSectionAbstract.
     */
    public abstract CalendarSectionAbstract getCalendarSection();
}
