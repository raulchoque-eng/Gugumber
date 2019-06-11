/*
 * @(#) ContactDetailsAbstract.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.contact;

import static org.fjala.gugumber.salesforce.keys.ContactKeys.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;

/**
 * ContactDetailsAbstract class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public abstract class ContactDetailsAbstract extends BasePage {

    /**
     * Returns the Last Name of contact from a header profile.
     *
     * @return the last name of contact as string.
     */
    public abstract String getFullNameContact();

    /**
     * Returns an Contact profile page after clicking on save button.
     *
     * @return an Contact profile page.
     */
    public abstract ContactProfilePageAbstract openEditContactDetails();

    Map<String, String> contactDetailInMap = new HashMap<>();

    /**
     * Gets all values from event detail.
     *
     * @param keyContact is the keys of Event into a set.
     */
    public Map<String, String> getContactDetail(final Set<String> keyContact) {
        final HashMap<String, StrategySetter> strategyMap = composeStrategyMap();
        keyContact.forEach(key -> strategyMap.get(key).executeMethod()

        );
        return contactDetailInMap;
    }

    /**
     * Composes an Strategy Map.
     *
     * @return an instance HashMap with keys and methods to run.
     */
    public HashMap<String, StrategySetter> composeStrategyMap() {
        final HashMap<String, StrategySetter> contactDetail = new HashMap<>();
        contactDetail.put(SALUTATION, () -> contactDetailInMap.put(SALUTATION, getSalutationContact()));
        contactDetail.put(FIRST_NAME, () -> contactDetailInMap.put(FIRST_NAME, getFirstNameContact()));
        contactDetail.put(LAST_NAME, () -> contactDetailInMap.put(LAST_NAME, getNameContact()));
        contactDetail.put(ACCOUNT, () -> contactDetailInMap.put(ACCOUNT, getAccount()));
        contactDetail.put(PHONE, () -> contactDetailInMap.put(PHONE, getPhone()));
        contactDetail.put(EMAIL, () -> contactDetailInMap.put(EMAIL, getEmail()));
        contactDetail.put(HOME_PHONE, () -> contactDetailInMap.put(HOME_PHONE, getHomePhone()));
        contactDetail.put(TITLE, () -> contactDetailInMap.put(SALUTATION, getTitle()));
        contactDetail.put(DEPARTMENT, () -> contactDetailInMap.put(SALUTATION, getDepartament()));
        contactDetail.put(MOBILE, () -> contactDetailInMap.put(SALUTATION, getMobile()));
        contactDetail.put(BIRTHDATE, () -> contactDetailInMap.put(BIRTHDATE, getBirthdate()));
        contactDetail.put(REPORTS_TO, () -> contactDetailInMap.put(SALUTATION, getReportsTo()));
        contactDetail.put(LEAD_SOURCE, () -> contactDetailInMap.put(SALUTATION, getLeadSource()));
        contactDetail.put(OTHER_PHONE, () -> contactDetailInMap.put(BIRTHDATE, getOtherPhone()));
        contactDetail.put(FAX, () -> contactDetailInMap.put(SALUTATION, getFax()));
        contactDetail.put(ASSISTANT, () -> contactDetailInMap.put(SALUTATION, getAssistant()));
        contactDetail.put(ASST_PHONE, () -> contactDetailInMap.put(BIRTHDATE, getAsstPhone()));
        return contactDetail;
    }

    protected abstract String getSalutationContact();

    protected abstract String getFirstNameContact();

    protected abstract String getNameContact();

    protected abstract String getHomePhone();

    protected abstract String getTitle();

    protected abstract String getDepartament();

    protected abstract String getMobile();

    protected abstract String getPhone();

    protected abstract String getEmail();

    protected abstract String getAccount();

    protected abstract String getBirthdate();

    protected abstract String getReportsTo();

    protected abstract String getLeadSource();

    protected abstract String getOtherPhone();

    protected abstract String getFax();

    protected abstract String getAssistant();

    protected abstract String getAsstPhone();
}
