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
//    Map<String, String> contactDetailInMap = new HashMap<>();
//
//    /**
//     * Gets all values from event detail.
//     *
//     * @param keyContact is the keys of Event into a set.
//     */
//    public Map<String, String> getContactDetail(final Set<String> keyContact) {
//        final HashMap<String, StrategySetter> strategyMap = composeStrategyMap();
//        keyContact.forEach(key -> strategyMap.get(key).executeMethod()
//
//        );
//        return contactDetailInMap;
//    }
//
//    /**
//     * Composes an Strategy Map.
//     *
//     * @return an instance HashMap with keys and methods to run.
//     */
//    public HashMap<String, StrategySetter> composeStrategyMap() {
//        final HashMap<String, StrategySetter> contactDetail = new HashMap<>();
//        contactDetail.put(NAME, () -> contactDetailInMap.put(NAME, getNameContact()));
//        contactDetail.put(ACCOUNT, () -> contactDetailInMap.put(ACCOUNT, getAccount()));
//        contactDetail.put(PHONE, () -> contactDetailInMap.put(PHONE, getPhone()));
//        contactDetail.put(EMAIL, () -> contactDetailInMap.put(EMAIL, getEmail()));
//        contactDetail.put(HOME_PHONE, () -> contactDetailInMap.put(HOME_PHONE, getHomePhone()));
//        contactDetail.put(TITLE, () -> contactDetailInMap.put(SALUTATION, getAssignedToUser()));
//        contactDetail.put(DEPARTMENT, () -> contactDetailInMap.put(SALUTATION, getAssignedToUser()));
//        contactDetail.put(MOBILE, () -> contactDetailInMap.put(SALUTATION, getAssignedToUser()));
//        contactDetail.put(DESCRIPTION, () -> contactDetailInMap.put(DESCRIPTION, getDescription()));
//        return contactDetail;
//    }
//
//    public abstract String getAccount();
//    public abstract String getPhone();
//    public abstract String getEmail();
}
