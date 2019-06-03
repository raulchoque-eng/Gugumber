/*
 * @(#) Contact.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.entities;

import static org.fjala.gugumber.salesforce.keys.ContactKeys.ACCOUNT;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.ASSISTANT;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.ASST_PHONE;
import static org.fjala.gugumber.salesforce.keys.ContactKeys.BIRTHDATE;
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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.fjala.gugumber.core.StrategySetter;

/**
 * Contact class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class Contact {

    /**
     * Variable for the salutation of an Contact.
     */
    private String salutation;

    /**
     * Variable for the first name of an Contact.
     */
    private String firstName;

    /**
     * Variable for the last name of an Contact.
     */
    private String lastName;

    /**
     * Variable for the phone of an Contact.
     */
    private int phone;

    /**
     * Variable for the home phone of an Contact.
     */
    private int homePhone;

    /**
     * Variable for the email of an Contact.
     */
    private String email;

    /**
     * Variable for the account of an Contact.
     */
    private String account;

    /**
     * Variable for the title of an Contact.
     */
    private String title;

    /**
     * Variable for the department of an Contact.
     */
    private String department;

    /**
     * Variable for the birth date of an Contact.
     */
    private Date birthdate;

    /**
     * Variable for the reports to of an Contact.
     */
    private String reportsTo;

    /**
     * Variable for the lead source of an Contact.
     */
    private String leadSource;

    /**
     * Variable for the mobile of an Contact.
     */
    private int mobile;

    /**
     * Variable for the other phone of an Contact.
     */
    private int otherPhone;

    /**
     * Variable for the fax  of an Contact.
     */
    private int fax;

    /**
     * Variable for the assistant of an Contact.
     */
    private String assistant;

    /**
     * Variable for the assistant phone of an Contact.
     */
    private int asstPhone;

    /**
     * Variable for the mailing street of an Contact.
     */
    private String mailingStreet;

    /**
     * Variable for the mailing city of an Contact.
     */
    private String mailingCity;

    /**
     * Variable for the mailing state of an Contact.
     */
    private String mailingState;

    /**
     * Variable for the mailing postal code of an Contact.
     */
    private String mailingPostalCode;

    /**
     * Variable for the mailing country of an Contact.
     */
    private String mailingCountry;

    /**
     * Variable for the other street of an Contact.
     */
    private String otherStreet;

    /**
     * Variable for the other city of an Contact.
     */
    private String otherCity;

    /**
     * Variable for the other state of an Contact.
     */
    private String otherState;

    /**
     * Variable for the other postal code of an Contact.
     */
    private String otherZipPostalCode;

    /**
     * Variable for the other country of an Contact.
     */
    private String otherCountry;

    /**
     * Variable for the languages of an Contact.
     */
    private String languages;

    /**
     * Variable for the level of an Contact.
     */
    private String level;

    /**
     * Variable for the description of an Contact.
     */
    private String description;

    /**
     * Gets the salutation.
     *
     * @return salutation as string.
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the salutation sending a string.
     *
     * @param salutation for the contact.
     */
    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    /**
     * Gets the first name.
     *
     * @return first name as string.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name sending a string.
     *
     * @param firstName for the contact.
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return last name as string.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name sending a string.
     *
     * @param lastName for the contact.
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the phone.
     *
     * @return phone as string.
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets the phone sending a string.
     *
     * @param phone for the contact.
     */
    public void setPhone(final int phone) {
        this.phone = phone;
    }

    /**
     * Gets the home Phone.
     *
     * @return homePhone as string.
     */
    public int getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the home Phone sending a string.
     *
     * @param homePhone for the contact.
     */
    public void setHomePhone(final int homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * Gets the email.
     *
     * @return email as string.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email sending a string.
     *
     * @param email for the contact.
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Gets the account.
     *
     * @return account as string.
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the account sending a string.
     *
     * @param account for the contact.
     */
    public void setAccount(final String account) {
        this.account = account;
    }

    /**
     * Gets the title.
     *
     * @return title as string.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title sending a string.
     *
     * @param title for the contact.
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the department.
     *
     * @return department as string.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department sending a string.
     *
     * @param department for the contact.
     */
    public void setDepartment(final String department) {
        this.department = department;
    }

    /**
     * Gets the birthdate.
     *
     * @return birthdate as string.
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the birthdate sending a string.
     *
     * @param birthdate for the contact.
     */
    public void setBirthdate(final Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Gets the reports.
     *
     * @return reportsTo as string.
     */
    public String getReportsTo() {
        return reportsTo;
    }

    /**
     * Sets the reports to sending a string.
     *
     * @param reportsTo for the contact.
     */
    public void setReportsTo(final String reportsTo) {
        this.reportsTo = reportsTo;
    }

    /**
     * Gets the lead source.
     *
     * @return leadSource as string.
     */
    public String getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the lead source sending a string.
     *
     * @param leadSource for the contact.
     */
    public void setLeadSource(final String leadSource) {
        this.leadSource = leadSource;
    }

    /**
     * Gets the mobile.
     *
     * @return mobile as string.
     */
    public int getMobile() {
        return mobile;
    }

    /**
     * Sets the mobile sending a string.
     *
     * @param mobile for the contact.
     */
    public void setMobile(final int mobile) {
        this.mobile = mobile;
    }

    /**
     * Gets the other phone.
     *
     * @return otherPhone as string.
     */
    public int getOtherPhone() {
        return otherPhone;
    }

    /**
     * Sets the other phone sending a string.
     *
     * @param otherPhone for the contact.
     */
    public void setOtherPhone(final int otherPhone) {
        this.otherPhone = otherPhone;
    }

    /**
     * Gets the fax.
     *
     * @return fax as string.
     */
    public int getFax() {
        return fax;
    }

    /**
     * Sets the fax sending a string.
     *
     * @param fax for the contact.
     */
    public void setFax(final int fax) {
        this.fax = fax;
    }

    /**
     * Gets the assistant.
     *
     * @return assistant as string.
     */
    public String getAssistant() {
        return assistant;
    }

    /**
     * Sets the assistant sending a string.
     *
     * @param assistant for the contact.
     */
    public void setAssistant(final String assistant) {
        this.assistant = assistant;
    }

    /**
     * Gets the asst phone.
     *
     * @return asstPhone as string.
     */
    public int getAsstPhone() {
        return asstPhone;
    }

    /**
     * Sets the asst phone sending a string.
     *
     * @param asstPhone for the contact.
     */
    public void setAsstPhone(final int asstPhone) {
        this.asstPhone = asstPhone;
    }

    /**
     * Gets the mailing street.
     *
     * @return mailingStreet as string.
     */
    public String getMailingStreet() {
        return mailingStreet;
    }

    /**
     * Sets the mailing street sending a string.
     *
     * @param mailingStreet for the contact.
     */
    public void setMailingStreet(final String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    /**
     * Gets the mailing city.
     *
     * @return mailingCity as string.
     */
    public String getMailingCity() {
        return mailingCity;
    }

    /**
     * Sets the mailing city sending a string.
     *
     * @param mailingCity for the contact.
     */
    public void setMailingCity(final String mailingCity) {
        this.mailingCity = mailingCity;
    }

    /**
     * Gets the mailing state.
     *
     * @return mailingState as string.
     */
    public String getMailingState() {
        return mailingState;
    }

    /**
     * Sets the mailing state sending a string.
     *
     * @param mailingState for the contact.
     */
    public void setMailingState(final String mailingState) {
        this.mailingState = mailingState;
    }

    /**
     * Gets the mailing Postal Code.
     *
     * @return mailingPostalCode as string.
     */
    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    /**
     * Sets the mailing Postal Code sending a string.
     *
     * @param mailingPostalCode for the contact.
     */
    public void setMailingPostalCode(final String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    /**
     * Gets the mailing country Code.
     *
     * @return mailingCountry as string.
     */
    public String getMailingCountry() {
        return mailingCountry;
    }

    /**
     * Sets the mailing country sending a string.
     *
     * @param mailingCountry for the contact.
     */
    public void setMailingCountry(final String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    /**
     * Gets the other street.
     *
     * @return otherStreet as string.
     */
    public String getOtherStreet() {
        return otherStreet;
    }

    /**
     * Sets the other street sending a string.
     *
     * @param otherStreet for the contact.
     */
    public void setOtherStreet(final String otherStreet) {
        this.otherStreet = otherStreet;
    }

    /**
     * Gets the other city.
     *
     * @return otherCity as string.
     */
    public String getOtherCity() {
        return otherCity;
    }

    /**
     * Sets the other city sending a string.
     *
     * @param otherCity for the contact.
     */
    public void setOtherCity(final String otherCity) {
        this.otherCity = otherCity;
    }

    /**
     * Gets the other State.
     *
     * @return otherState as string.
     */
    public String getOtherState() {
        return otherState;
    }

    /**
     * Sets the other state sending a string.
     *
     * @param otherState for the contact.
     */
    public void setOtherState(final String otherState) {
        this.otherState = otherState;
    }

    /**
     * Gets the other Zip Postal Code.
     *
     * @return otherZipPostalCode as string.
     */
    public String getOtherZipPostalCode() {
        return otherZipPostalCode;
    }

    /**
     * Sets the other Postal Code sending a string.
     *
     * @param otherZipPostalCode for the contact.
     */
    public void setOtherZipPostalCode(final String otherZipPostalCode) {
        this.otherZipPostalCode = otherZipPostalCode;
    }

    /**
     * Gets the other country.
     *
     * @return otherCountry as string.
     */
    public String getOtherCountry() {
        return otherCountry;
    }

    /**
     * Sets the other country sending a string.
     *
     * @param otherCountry for the contact.
     */
    public void setOtherCountry(final String otherCountry) {
        this.otherCountry = otherCountry;
    }

    /**
     * Gets the languages.
     *
     * @return languages as string.
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * Sets the languages sending a string.
     *
     * @param languages for the contact.
     */
    public void setLanguages(final String languages) {
        this.languages = languages;
    }

    /**
     * Gets the level.
     *
     * @return level as string.
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the level sending a string.
     *
     * @param level for the contact.
     */
    public void setLevel(final String level) {
        this.level = level;
    }

    /**
     * Gets the description.
     *
     * @return description as string.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description sending a string.
     *
     * @param description for the contact.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets full name for title.
     *
     * @return full name as string.
     */
    public String getFullName() {
        if (getSalutation() == null) {
            setSalutation(" ");
        }
        if (getFirstName() == null) {
            setFirstName(" ");
        }
        final String fullName = getSalutation().concat(" ").concat(getFirstName()).concat(" ").concat(getLastName());
        return fullName.trim();
    }

    /**
     * Process information for composing the strategy map.
     *
     * @param newContact of type string
     */
    public void processInformation (final Map<String,String> newContact) {
        final HashMap<String, StrategySetter> strategyMap = composeStrategyMap(newContact);
        newContact.keySet().forEach(key -> {
            strategyMap.get(key).executeMethod(); });
    }

    /**
     * Build the contact values.
     *
     * @param newContact of type String.
     * @return The HashMap
     */
    public HashMap<String,StrategySetter> composeStrategyMap(final Map<String,String> newContact) {
        final HashMap<String, StrategySetter> strategyMap = new HashMap<>();
        strategyMap.put(SALUTATION,() -> setSalutation(newContact.get(SALUTATION)));
        strategyMap.put(FIRST_NAME,() -> setFirstName(newContact.get(FIRST_NAME)));
        strategyMap.put(LAST_NAME,() -> setLastName(newContact.get(LAST_NAME)));
        strategyMap.put(ACCOUNT,() -> setAccount(newContact.get(ACCOUNT)));
        strategyMap.put(PHONE,() -> setPhone(Integer.parseInt(newContact.get(PHONE))));
        strategyMap.put(EMAIL,() -> setEmail(newContact.get(EMAIL)));
        strategyMap.put(HOME_PHONE,() -> setHomePhone(Integer.parseInt(newContact.get(HOME_PHONE))));
        strategyMap.put(TITLE,() -> setTitle(newContact.get(TITLE)));
        strategyMap.put(DEPARTMENT,() -> setDepartment(newContact.get(DEPARTMENT)));
//        strategyMap.put(BIRTHDATE,() -> setBirthdate(newContact.get(BIRTHDATE)));
        strategyMap.put(REPORTS_TO,() -> setReportsTo(newContact.get(REPORTS_TO)));
        strategyMap.put(LEAD_SOURCE,() -> setLeadSource(newContact.get(LEAD_SOURCE)));
        strategyMap.put(MOBILE,() -> setMobile(Integer.parseInt(newContact.get(MOBILE))));
        strategyMap.put(OTHER_PHONE,() -> setOtherPhone(Integer.parseInt(newContact.get(OTHER_PHONE))));
        strategyMap.put(FAX,() -> setFax(Integer.parseInt(newContact.get(FAX))));
        strategyMap.put(ASSISTANT,() -> setAssistant(newContact.get(ASSISTANT)));
        strategyMap.put(ASST_PHONE,() -> setAsstPhone(Integer.parseInt(newContact.get(ASST_PHONE))));
        strategyMap.put(MAILING_STREET,() -> setMailingStreet(newContact.get(MAILING_STREET)));
        strategyMap.put(MAILING_CITY,() -> setMailingCity(newContact.get(MAILING_CITY)));
        strategyMap.put(MAILING_STATE,() -> setMailingState(newContact.get(MAILING_STATE)));
        strategyMap.put(MAILING_POSTAL_CODE,() -> setMailingPostalCode(newContact.get(MAILING_POSTAL_CODE)));
        strategyMap.put(MAILING_COUNTRY,() -> setMailingCountry(newContact.get(MAILING_COUNTRY)));
        strategyMap.put(OTHER_STREET,() -> setOtherStreet(newContact.get(OTHER_STREET)));
        strategyMap.put(OTHER_CITY,() -> setOtherCity(newContact.get(OTHER_CITY)));
        strategyMap.put(OTHER_STATE,() -> setOtherState(newContact.get(OTHER_STATE)));
        strategyMap.put(OTHER_POSTAL_CODE,() -> setOtherZipPostalCode(newContact.get(OTHER_POSTAL_CODE)));
        strategyMap.put(OTHER_COUNTRY,() -> setOtherCountry(newContact.get(OTHER_COUNTRY)));
        strategyMap.put(LANGUAGES,() -> setLanguages(newContact.get(LANGUAGES)));
        strategyMap.put(LEVEL,() -> setLevel(newContact.get(LEVEL)));
        strategyMap.put(DESCRIPTION,() -> setDescription(newContact.get(DESCRIPTION)));
        return strategyMap;
    }
}
