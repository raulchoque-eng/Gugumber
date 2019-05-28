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

import org.fjala.gugumber.core.selenium.utils.StrategySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * Contact class.
 *
 * @author Cristian Lujan
 * @version 0.0.1
 */
public class Contact {

    private final static String SALUTATION = "Salutation";
    private final static String FIRST_NAME = "First Name";
    private final static String LAST_NAME = "Last Name";
    private final static String ACCOUNT = "Account";
    private final static String PHONE = "Phone";
    private final static String EMAIL = "Email";
    private final static String HOME_PHONE = "Home Phone";
    private final static String TITLE = "Title";
    private final static String DEPARTMEN = "Department";
    private final static String BIRTHDATE = "Birthdate";
    private final static String REPOST_TO = "Repost To";
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

    private String Salutation;
    private String firstName;
    private String lastName;
    private int phone;
    private int homePhone;
    private String email;
    private String account;
    private String title;
    private String department;
    private String birthdate;
    private String repostTo;
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

    public String getSalutation() {
        return Salutation;
    }

    public void setSalutation(String salutation) {
        Salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getRepostTo() {
        return repostTo;
    }

    public void setRepostTo(String repostTo) {
        this.repostTo = repostTo;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(int otherPhone) {
        this.otherPhone = otherPhone;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public int getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(int asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    public void setMailingPostalCode(String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public String getOtherZipPostalCode() {
        return otherZipPostalCode;
    }

    public void setOtherZipPostalCode(String otherZipPostalCode) {
        this.otherZipPostalCode = otherZipPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void processInformation (final Map<String,String> newContact){
        HashMap<String, StrategySetter>strategyMap = composeStrategyMap(newContact);
        newContact.keySet().forEach(key -> {
            strategyMap.get(key).executeMethod();});
    }

    public HashMap<String,StrategySetter> composeStrategyMap(final Map<String,String> newContact) {
        HashMap<String, StrategySetter>strategyMap = new HashMap<>();
        strategyMap.put(SALUTATION,()-> setSalutation(newContact.get(SALUTATION)));
        strategyMap.put(FIRST_NAME,()-> setFirstName(newContact.get(FIRST_NAME)));
        strategyMap.put(LAST_NAME,()-> setLastName(newContact.get(LAST_NAME)));
        strategyMap.put(ACCOUNT,()-> setAccount(newContact.get(ACCOUNT)));
        strategyMap.put(PHONE,()-> setPhone(Integer.parseInt(newContact.get(PHONE))));
        strategyMap.put(EMAIL,()-> setEmail(newContact.get(EMAIL)));
        strategyMap.put(HOME_PHONE,()-> setHomePhone(Integer.parseInt(newContact.get(HOME_PHONE))));
        strategyMap.put(TITLE,()-> setTitle(newContact.get(TITLE)));
        strategyMap.put(DEPARTMEN,()-> setDepartment(newContact.get(DEPARTMEN)));
        strategyMap.put(BIRTHDATE,()-> setBirthdate(newContact.get(BIRTHDATE)));
        strategyMap.put(REPOST_TO,()-> setRepostTo(newContact.get(REPOST_TO)));
        strategyMap.put(LEAD_SOURCE,()-> setLeadSource(newContact.get(LEAD_SOURCE)));
        strategyMap.put(MOBILE,()-> setMobile(Integer.parseInt(newContact.get(MOBILE))));
        strategyMap.put(OTHER_PHONE,()-> setOtherPhone(Integer.parseInt(newContact.get(OTHER_PHONE))));
        strategyMap.put(FAX,()-> setFax(Integer.parseInt(newContact.get(FAX))));
        strategyMap.put(ASSISTANT,()-> setAssistant(newContact.get(ASSISTANT)));
        strategyMap.put(ASST_PHONE,()-> setAsstPhone(Integer.parseInt(newContact.get(ASST_PHONE))));
        strategyMap.put(MAILING_STREET,()-> setMailingStreet(newContact.get(MAILING_STREET)));
        strategyMap.put(MAILING_CITY,()-> setMailingCity(newContact.get(MAILING_CITY)));
        strategyMap.put(MAILING_STATE,()-> setMailingState(newContact.get(MAILING_STATE)));
        strategyMap.put(MAILING_POSTAL_CODE,()-> setMailingPostalCode(newContact.get(MAILING_POSTAL_CODE)));
        strategyMap.put(MAILING_COUNTRY,()-> setMailingCountry(newContact.get(MAILING_COUNTRY)));
        strategyMap.put(OTHER_STREET,()-> setOtherStreet(newContact.get(OTHER_STREET)));
        strategyMap.put(OTHER_CITY,()-> setOtherCity(newContact.get(OTHER_CITY)));
        strategyMap.put(OTHER_STATE,()-> setOtherState(newContact.get(OTHER_STATE)));
        strategyMap.put(OTHER_POSTAL_CODE,()-> setOtherZipPostalCode(newContact.get(OTHER_POSTAL_CODE)));
        strategyMap.put(OTHER_COUNTRY,()-> setOtherCountry(newContact.get(OTHER_COUNTRY)));
        strategyMap.put(LANGUAGES,()-> setLanguages(newContact.get(LANGUAGES)));
        strategyMap.put(LEVEL,()-> setLevel(newContact.get(LEVEL)));
        strategyMap.put(DESCRIPTION,()-> setDescription(newContact.get(DESCRIPTION)));
        return strategyMap;
    }

}
