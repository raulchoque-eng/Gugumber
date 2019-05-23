package org.fjala.gugumber.salesforce.ui.pages;

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
}
