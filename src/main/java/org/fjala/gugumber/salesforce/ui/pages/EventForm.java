/*
 * @(#) EventForm.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages;

import org.fjala.gugumber.salesforce.entities.Event;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * EventForm class
 *
 * @author Raúl Choque
 * @version 0.0.1
 */
public class EventForm {
    @FindBy(css = "div.modal-container slds-modal__container")
    WebElement eventForm;

    @FindBy(xpath = "//input[starts-with(@id, 'input')]")
    WebElement sunjectTxtb;

    public void createEvent(Event event) {
        System.out.println("TODO");
    }
}
