/*
 * @(#) LoaderProperties.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 *
 */

package org.fjala.gugumber.core.selenium.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * LoaderProperties class.
 *
 * @author Areliez Vargas
 * @version 0.0.1
 */
public class LoaderProperties {

    private static final String URL_SALESFORCE_PROPERTIES = "salesforce.properties";
    private Map<String, String> properties = new HashMap<>();

    /**
     * Constructor protected.
     */
    protected LoaderProperties() {
        addPropertiesPivotal();
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void addPropertiesPivotal() {
        Properties propertiesPivotal = readFile(URL_SALESFORCE_PROPERTIES);
        propertiesPivotal.forEach((key, value) -> properties.put(key.toString(), value.toString()));
    }

    /**
     * Initialize a new LoaderProperties.
     *
     * @return a LoaderProperties.
     */
    public static LoaderProperties getInstance() {
        return new LoaderProperties();
    }

    /**
     * Load a property file.
     *
     * @param path of properties.
     * @return the properties.
     */
    public Properties readFile(String path) {
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream(path);
            // load a properties file
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
