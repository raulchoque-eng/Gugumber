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
     * Variable for the salutation of an Contact.
     */
    private String salutation;
    private String firstName;
    private String lastName;
    private int phone;
    private int homePhone;
    private String email;
    private String account;
    private String title;
    private String department;
    private Date birthdate;
    private String reportsTo;
    private String leadSource;
    private int mobile;
    private int otherPhone;
    private int fax;
    private String assistant;
    private int asstPhone;
    private String mailingStreet;
    private String mailingCity;
    private String mailingState;
    private String mailingPostalCode;
    private String mailingCountry;
    private String otherStreet;
    private String otherCity;
    private String otherState;
    private String otherZipPostalCode;
    private String otherCountry;
    private String languages;
    private String level;
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
