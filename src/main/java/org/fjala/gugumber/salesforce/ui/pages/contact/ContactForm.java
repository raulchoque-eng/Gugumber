/*
 * @(#) ContactForm.java Copyright (c) 2019 Jala Foundation.
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

import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;
import org.fjala.gugumber.salesforce.ui.pages.BasePage;


/**
 * ContactForm class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public abstract class ContactForm extends BasePage {

    /**
     * Constant for key of Salutation.
     */
    private final static String SALUTATION = "Salutation";

    /**
     * Constant for key of First Name.
     */
    private final static String FIRST_NAME = "First Name";

    /**
     * Constant for key of Last Name.
     */
    private final static String LAST_NAME = "Last Name";

    /**
     * Constant for key of Account.
     */
    private final static String ACCOUNT = "Account";

    /**
     * Constant for key of Phone.
     */
    private final static String PHONE = "Phone";

    /**
     * Constant for key of Email.
     */
    private final static String EMAIL = "Email";

    /**
     * Constant for key of Home Phone.
     */
    private final static String HOME_PHONE = "Home Phone";

    /**
     * Constant for key of Title.
     */
    private final static String TITLE = "Title";

    /**
     * Constant for key of Department.
     */
    private final static String DEPARTMENT = "Department";

    /**
     * Constant for key of Birthdate.
     */
    private final static String BIRTHDATE = "Birthdate";

    /**
     * Constant for key of Reports To.
     */
    private final static String REPORTS_TO = "Reports To";

    /**
     * Constant for key of Lead Source.
     */
    private final static String LEAD_SOURCE = "Lead Source";

    /**
     * Constant for key of Mobile.
     */
    private final static String MOBILE = "Mobile";

    /**
     * Constant for key of Other Phone.
     */
    private final static String OTHER_PHONE = "Other Phone";

    /**
     * Constant for key of Fax.
     */
    private final static String FAX = "Fax";

    /**
     * Constant for key of Assistant.
     */
    private final static String ASSISTANT = "Assistant";

    /**
     * Constant for key of Asst Phone.
     */
    private final static String ASST_PHONE = "Asst Phone";

    /**
     * Constant for key of Mailing Street.
     */
    private final static String MAILING_STREET = "Mailing Street";

    /**
     * Constant for key of Mailing City.
     */
    private final static String MAILING_CITY = "Mailing City";

    /**
     * Constant for key of Mailing State/Province.
     */
    private final static String MAILING_STATE = "Mailing State/Province";

    /**
     * Constant for key of Mailing Zip/Postal Code.
     */
    private final static String MAILING_POSTAL_CODE = "Mailing Zip/Postal Code";

    /**
     * Constant for key of Mailing Country.
     */
    private final static String MAILING_COUNTRY = "Mailing Country";

    /**
     * Constant for key of Other Street.
     */
    private final static String OTHER_STREET = "Other Street";

    /**
     * Constant for key of Other City.
     */
    private final static String OTHER_CITY = "Other City";

    /**
     * Constant for key of Other State/Province.
     */
    private final static String OTHER_STATE = "Other State/Province";

    /**
     * Constant for key of Other Zip/Postal Code.
     */
    private final static String OTHER_POSTAL_CODE = "Other Zip/Postal Code";

    /**
     * Constant for key of Other Country.
     */
    private final static String OTHER_COUNTRY = "Other Country";

    /**
     * Constant for key of Languages.
     */
    private final static String LANGUAGES = "Languages";

    /**
     * Constant for key of Level.
     */
    private final static String LEVEL = "Level";

    /**
     * Constant for key of Description.
     */
    private final static String DESCRIPTION = "Description";
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
     * Build the contact values.
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
    public abstract ContactProfilePage clickSaveNewContact();
}
