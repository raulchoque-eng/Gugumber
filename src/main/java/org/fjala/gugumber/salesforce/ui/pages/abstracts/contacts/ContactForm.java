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

package org.fjala.gugumber.salesforce.ui.pages.abstracts.contacts;

import org.fjala.gugumber.core.selenium.utils.StrategySetter;
import org.fjala.gugumber.salesforce.ui.BasePage;

import java.util.HashMap;
import java.util.Map;

/**
 * ContactForm class
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public abstract class ContactForm extends BasePage {

    private final static String SALUTATION = "Salutation";
    private final static String FIRST_NAME = "First Name";
    private final static String LAST_NAME = "Last Name";
    private final static String ACCOUNT = "Account";
    private final static String PHONE = "Phone";
    private final static String EMAIL = "Email";
    private final static String HOME_PHONE = "Home Phone";
    private final static String TITLE = "Title";
    private final static String DEPARTMENT = "Department";
    private final static String BIRTHDATE = "Birthdate";
    private final static String REPORTS_TO = "Reports To";
    private final static String LEAD_SOURCE = "Lead Source";
    private final static String MOBILE = "Mobile";
    private final static String OTHER_PHONE = "Other Phone";
    private final static String FAX = "Fax";
    private final static String ASSISTANT = "Assistant";
    private final static String ASST_PHONE = "Asst Phone";
    private final static String MAILING_STREET = "Mailing Street";
    private final static String MAILING_CITY = "Mailing City";
    private final static String MAILING_STATE = "Mailing State/Province";
    private final static String MAILING_POSTAL_CODE = "Mailing Zip/Postal Code";
    private final static String MAILING_COUNTRY = "Mailing Country";
    private final static String OTHER_STREET = "Other Street";
    private final static String OTHER_CITY = "Other City";
    private final static String OTHER_STATE = "Other State/Province";
    private final static String OTHER_POSTAL_CODE = "Other Zip/Postal Code";
    private final static String OTHER_COUNTRY = "Other Country";
    private final static String LANGUAGES = "Languages";
    private final static String LEVEL = "Level";
    private final static String DESCRIPTION = "Description";


    public void setContactInformation (final Map<String,String> contact){
        HashMap<String, StrategySetter>strategyMap = composeStrategyMap(contact);
        contact.keySet().forEach(key -> {
            strategyMap.get(key).executeMethod();});
    }

    /**
     * Build the contact values.
     * @param contact of type String.
     * @return The HashMap
     */
    public HashMap<String,StrategySetter> composeStrategyMap(final Map<String,String> contact) {
        HashMap<String, StrategySetter>strategyMap = new HashMap<>();
        strategyMap.put(SALUTATION,()-> setSalutation(contact.get(SALUTATION)));
        strategyMap.put(FIRST_NAME,()-> setFirstName(contact.get(FIRST_NAME)));
        strategyMap.put(LAST_NAME,()-> setLastName(contact.get(LAST_NAME)));
        strategyMap.put(ACCOUNT,()-> setAccount(contact.get(ACCOUNT)));
        strategyMap.put(PHONE,()-> setPhone(Integer.parseInt(contact.get(PHONE))));
        strategyMap.put(EMAIL,()-> setEmail(contact.get(EMAIL)));
        strategyMap.put(HOME_PHONE,()-> setHomePhone(Integer.parseInt(contact.get(HOME_PHONE))));
        strategyMap.put(TITLE,()-> setTitle(contact.get(TITLE)));
        strategyMap.put(DEPARTMENT,()-> setDepartment(contact.get(DEPARTMENT)));
        strategyMap.put(BIRTHDATE,()-> setBirthdate(contact.get(BIRTHDATE)));
        strategyMap.put(REPORTS_TO,()-> setReportsTo(contact.get(REPORTS_TO)));
        strategyMap.put(LEAD_SOURCE,()-> setLeadSource(contact.get(LEAD_SOURCE)));
        strategyMap.put(MOBILE,()-> setMobile(Integer.parseInt(contact.get(MOBILE))));
        strategyMap.put(OTHER_PHONE,()-> setOtherPhone(Integer.parseInt(contact.get(OTHER_PHONE))));
        strategyMap.put(FAX,()-> setFax(Integer.parseInt(contact.get(FAX))));
        strategyMap.put(ASSISTANT,()-> setAssistant(contact.get(ASSISTANT)));
        strategyMap.put(ASST_PHONE,()-> setAsstPhone(Integer.parseInt(contact.get(ASST_PHONE))));
        strategyMap.put(MAILING_STREET,()-> setMailingStreet(contact.get(MAILING_STREET)));
        strategyMap.put(MAILING_CITY,()-> setMailingCity(contact.get(MAILING_CITY)));
        strategyMap.put(MAILING_STATE,()-> setMailingState(contact.get(MAILING_STATE)));
        strategyMap.put(MAILING_POSTAL_CODE,()-> setMailingPostalCode(contact.get(MAILING_POSTAL_CODE)));
        strategyMap.put(MAILING_COUNTRY,()-> setMailingCountry(contact.get(MAILING_COUNTRY)));
        strategyMap.put(OTHER_STREET,()-> setOtherStreet(contact.get(OTHER_STREET)));
        strategyMap.put(OTHER_CITY,()-> setOtherCity(contact.get(OTHER_CITY)));
        strategyMap.put(OTHER_STATE,()-> setOtherState(contact.get(OTHER_STATE)));
        strategyMap.put(OTHER_POSTAL_CODE,()-> setOtherPostalCode(contact.get(OTHER_POSTAL_CODE)));
        strategyMap.put(OTHER_COUNTRY,()-> setOtherCountry(contact.get(OTHER_COUNTRY)));
        strategyMap.put(LANGUAGES,()-> setLanguages(contact.get(LANGUAGES)));
        strategyMap.put(LEVEL,()-> setLevel(contact.get(LEVEL)));
        strategyMap.put(DESCRIPTION,()-> setDescription(contact.get(DESCRIPTION)));
        return strategyMap;
    }

    protected abstract void setSalutation(String salutation);

    protected abstract void setFirstName(String firstName);

    protected abstract void setLastName(String lastName);

    protected abstract void setAccount(String account);

    protected abstract void setPhone(int phone);

    protected abstract void setEmail(String email);

    protected abstract void setHomePhone(int homePhone);

    protected abstract void setTitle(String tittle);

    protected abstract void setDepartment(String department);

    protected abstract void setBirthdate(String birthdate);

    protected abstract void setReportsTo(String reportsTo);

    protected abstract void setLeadSource(String leadSource);

    protected abstract void setMobile(int mobile);

    protected abstract void setOtherPhone(int otherPhone);

    protected abstract void setFax(int fax);

    protected abstract void setAssistant(String assistant);

    protected abstract void setAsstPhone(int AsstPhone);

    protected abstract void setMailingStreet(String mailingStreet);

    protected abstract void setMailingCity(String mailingCity);

    protected abstract void setMailingState(String mailingState);

    protected abstract void setMailingPostalCode(String mailingPostalCode);

    protected abstract void setMailingCountry(String mailingCountry);

    protected abstract void setOtherStreet(String otherStreet);

    protected abstract void setOtherCity(String otherCity);
    
    protected abstract void setOtherState(String otherState);

    protected abstract void setOtherPostalCode(String otherPostalCode);

    protected abstract void setOtherCountry(String otherCountry);

    protected abstract void setLanguages(String languages);

    protected abstract void setLevel(String level);

    protected abstract void setDescription(String description);

    public abstract ContactProfilePage clickSaveNewContact();
}
