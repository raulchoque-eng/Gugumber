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
 * @author Cxrisstian
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

    public String getSalutation() {
        return Salutation;
    }

    public void setSalutation(String salutation) {
        Salutation = salutation;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
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

    public String getLastName() {
        return lastName;
    }

    public String getAccount() {
        return account;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return strategyMap;
    }

}
