/*
 * @(#) BaseAppPageSteps.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.steps;

import cucumber.api.java.en.When;
import org.fjala.gugumber.salesforce.ui.PageLayoutFactory;
import org.fjala.gugumber.salesforce.ui.pages.app.BaseAppPage;
import org.fjala.gugumber.salesforce.ui.pages.contact.ContactPageAbstract;

/**
 * BaseAppPageSteps class for steps definition.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class BaseAppPageSteps {

    private ContactPageAbstract contactPage;
    private BaseAppPage baseAppPage;

    @When("^I go to the Contacts page$")
    public void GoToTheContactsPage() {
        baseAppPage = PageLayoutFactory.getBaseAppPage();
        baseAppPage.getNavBar().goToContactPage();
    }
}
