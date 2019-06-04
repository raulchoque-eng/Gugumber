/*
 * @(#) ContactFormAbstract.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.ui.pages.contact;

import static org.fjala.gugumber.salesforce.keys.ContactKeys.ACCOUNT;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.ASSISTANT;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.ASST_PHONE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.DEPARTMENT;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.DESCRIPTION;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.EMAIL;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.FAX;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.FIRST_NAME;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.HOME_PHONE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.LANGUAGES;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.LAST_NAME;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.LEAD_SOURCE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.LEVEL;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.MAILING_CITY;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.MAILING_COUNTRY;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.MAILING_POSTAL_CODE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.MAILING_STATE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.MAILING_STREET;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.MOBILE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.OTHER_CITY;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.OTHER_COUNTRY;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.OTHER_PHONE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.OTHER_POSTAL_CODE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.OTHER_STATE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.OTHER_STREET;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.PHONE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.REPORTS_TO;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.SALUTATION;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.TITLE;

import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;

/**
 * ContactFormAbstract class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public abstract class ContactFormAbstract extends BasePage {

    /**
     * Process information for composing the strategy map.
     *
     * @param contact of type string
     */
    public void setContactInformation (final Map<String,String> contact) {
        final HashMap<String, StrategySetter> strategyMap = composeStrategyMap(contact);
        contact.keySet().forEach(key -> {
            strategyMap.get(key).executeMethod(); });
    }

    /**
     * Gets a map with the information the account.
     *
     * @param contact of type String.
     * @return The HashMap
     */
    public HashMap<String,StrategySetter> composeStrategyMap(final Map<String,String> contact) {
        final HashMap<String, StrategySetter> strategyMap = new HashMap<>();
        strategyMap.put(SALUTATION,() -> setSalutation(contact.get(SALUTATION)));
        strategyMap.put(FIRST_NAME,() -> setFirstName(contact.get(FIRST_NAME)));
        strategyMap.put(LAST_NAME,() -> setLastName(contact.get(LAST_NAME)));
        strategyMap.put(ACCOUNT,() -> setAccount(contact.get(ACCOUNT)));
        strategyMap.put(PHONE,() -> setPhone(Integer.parseInt(contact.get(PHONE))));
        strategyMap.put(EMAIL,() -> setEmail(contact.get(EMAIL)));
        strategyMap.put(HOME_PHONE,() -> setHomePhone(Integer.parseInt(contact.get(HOME_PHONE))));
        strategyMap.put(TITLE,() -> setTitle(contact.get(TITLE)));
        strategyMap.put(DEPARTMENT,() -> setDepartment(contact.get(DEPARTMENT)));
//        strategyMap.put(BIRTHDATE,() -> setBirthdate(newContact.get(BIRTHDATE)));
        strategyMap.put(REPORTS_TO,() -> setReportsTo(contact.get(REPORTS_TO)));
        strategyMap.put(LEAD_SOURCE,() -> setLeadSource(contact.get(LEAD_SOURCE)));
        strategyMap.put(MOBILE,() -> setMobile(Integer.parseInt(contact.get(MOBILE))));
        strategyMap.put(OTHER_PHONE,() -> setOtherPhone(Integer.parseInt(contact.get(OTHER_PHONE))));
        strategyMap.put(FAX,() -> setFax(Integer.parseInt(contact.get(FAX))));
        strategyMap.put(ASSISTANT,() -> setAssistant(contact.get(ASSISTANT)));
        strategyMap.put(ASST_PHONE,() -> setAsstPhone(Integer.parseInt(contact.get(ASST_PHONE))));
        strategyMap.put(MAILING_STREET,() -> setMailingStreet(contact.get(MAILING_STREET)));
        strategyMap.put(MAILING_CITY,() -> setMailingCity(contact.get(MAILING_CITY)));
        strategyMap.put(MAILING_STATE,() -> setMailingState(contact.get(MAILING_STATE)));
        strategyMap.put(MAILING_POSTAL_CODE,() -> setMailingPostalCode(contact.get(MAILING_POSTAL_CODE)));
        strategyMap.put(MAILING_COUNTRY,() -> setMailingCountry(contact.get(MAILING_COUNTRY)));
        strategyMap.put(OTHER_STREET,() -> setOtherStreet(contact.get(OTHER_STREET)));
        strategyMap.put(OTHER_CITY,() -> setOtherCity(contact.get(OTHER_CITY)));
        strategyMap.put(OTHER_STATE,() -> setOtherState(contact.get(OTHER_STATE)));
        strategyMap.put(OTHER_POSTAL_CODE,() -> setOtherPostalCode(contact.get(OTHER_POSTAL_CODE)));
        strategyMap.put(OTHER_COUNTRY,() -> setOtherCountry(contact.get(OTHER_COUNTRY)));
        strategyMap.put(LANGUAGES,() -> setLanguages(contact.get(LANGUAGES)));
        strategyMap.put(LEVEL,() -> setLevel(contact.get(LEVEL)));
        strategyMap.put(DESCRIPTION,() -> setDescription(contact.get(DESCRIPTION)));
        return strategyMap;
    }

    /**
     * Sets the salutation sending a string.
     *
     * @param salutation for the contact.
     */
    protected abstract void setSalutation(final String salutation);

    /**
     * Sets the first name sending a string.
     *
     * @param firstName for the contact.
     */
    protected abstract void setFirstName(final String firstName);

    /**
     * Sets the last name sending a string.
     *
     * @param lastName for the contact.
     */
    protected abstract void setLastName(String lastName);

    /**
     * Sets the account sending a string.
     *
     * @param account for the contact.
     */
    protected abstract void setAccount(String account);

    /**
     * Sets the phone sending a string.
     *
     * @param phone for the contact.
     */
    protected abstract void setPhone(int phone);

    /**
     * Sets the email sending a string.
     *
     * @param email for the contact.
     */
    protected abstract void setEmail(String email);

    /**
     * Sets the home Phone sending a string.
     *
     * @param homePhone for the contact.
     */
    protected abstract void setHomePhone(int homePhone);

    /**
     * Sets the title sending a string.
     *
     * @param title for the contact.
     */
    protected abstract void setTitle(String title);

    /**
     * Sets the department sending a string.
     *
     * @param department for the contact.
     */
    protected abstract void setDepartment(String department);

    /**
     * Sets the birthdate sending a string.
     *
     * @param birthdate for the contact.
     */
    protected abstract void setBirthdate(String birthdate);

    /**
     * Sets the reports to sending a string.
     *
     * @param reportsTo for the contact.
     */
    protected abstract void setReportsTo(String reportsTo);

    /**
     * Sets the lead source sending a string.
     *
     * @param leadSource for the contact.
     */
    protected abstract void setLeadSource(String leadSource);

    /**
     * Sets the mobile sending a string.
     *
     * @param mobile for the contact.
     */
    protected abstract void setMobile(int mobile);

    /**
     * Sets the other phone sending a string.
     *
     * @param otherPhone for the contact.
     */
    protected abstract void setOtherPhone(int otherPhone);

    /**
     * Sets the fax sending a string.
     *
     * @param fax for the contact.
     */
    protected abstract void setFax(int fax);

    /**
     * Sets the assistant sending a string.
     *
     * @param assistant for the contact.
     */
    protected abstract void setAssistant(String assistant);

    /**
     * Sets the asst phone sending a string.
     *
     * @param asstPhone for the contact.
     */
    protected abstract void setAsstPhone(int asstPhone);

    /**
     * Sets the mailing street sending a string.
     *
     * @param mailingStreet for the contact.
     */
    protected abstract void setMailingStreet(String mailingStreet);

    /**
     * Sets the mailing city sending a string.
     *
     * @param mailingCity for the contact.
     */
    protected abstract void setMailingCity(String mailingCity);

    /**
     * Sets the mailing state sending a string.
     *
     * @param mailingState for the contact.
     */
    protected abstract void setMailingState(String mailingState);

    /**
     * Sets the mailing Postal Code sending a string.
     *
     * @param mailingPostalCode for the contact.
     */
    protected abstract void setMailingPostalCode(String mailingPostalCode);

    /**
     * Sets the mailing country sending a string.
     *
     * @param mailingCountry for the contact.
     */
    protected abstract void setMailingCountry(String mailingCountry);

    /**
     * Sets the other street sending a string.
     *
     * @param otherStreet for the contact.
     */
    protected abstract void setOtherStreet(String otherStreet);

    /**
     * Sets the other city sending a string.
     *
     * @param otherCity for the contact.
     */
    protected abstract void setOtherCity(String otherCity);

    /**
     * Sets the other state sending a string.
     *
     * @param otherState for the contact.
     */
    protected abstract void setOtherState(String otherState);

    /**
     * Sets the other Postal Code sending a string.
     *
     * @param otherPostalCode for the contact.
     */
    protected abstract void setOtherPostalCode(String otherPostalCode);

    /**
     * Sets the other country sending a string.
     *
     * @param otherCountry for the contact.
     */
    protected abstract void setOtherCountry(String otherCountry);

    /**
     * Sets the languages sending a string.
     *
     * @param languages for the contact.
     */
    protected abstract void setLanguages(String languages);

    /**
     * Sets the level sending a string.
     *
     * @param level for the contact.
     */
    protected abstract void setLevel(String level);

    /**
     * Sets the description sending a string.
     *
     * @param description for the contact.
     */
    protected abstract void setDescription(String description);

    /**
     * Returns an Contact profile page after clicking on save button.
     *
     * @return an Contact profile page.
     */
    public abstract ContactProfilePageAbstract clickSaveNewContact();
}
