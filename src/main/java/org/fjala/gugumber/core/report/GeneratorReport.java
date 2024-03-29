/*
 * @(#) GeneratorReport.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.core.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import org.fjala.gugumber.core.selenium.WebDriverConfig;
import org.fjala.gugumber.salesforce.ui.PageLayoutConfig;

/**
 * GeneratorReport class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class GeneratorReport {

    /**
     * The method getInstance get a instance of GeneratorReport.
     *
     * @return an instance GeneratorReport
     */
    public static GeneratorReport getInstance() {
        return new GeneratorReport();
    }

    /**
     * The method generateReport is to set up and create a report.
     */
    public void generateReport() {
        final File reportOutputDirectory = new File("target");
        final List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");

        final String projectName = "Salesforce";
        final boolean runWithJenkins = false;

        final Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        // additional metadata presented on main page
        configuration.addClassifications("Platform", "WINDOWS");
        configuration.addClassifications("Browser", WebDriverConfig.getInstance().getBrowserType().toString());
        configuration.addClassifications("Branch", "RELEASE/1.0");
        configuration.addClassifications("Layout", PageLayoutConfig.getPageLayoutName().toString());
        final ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        final Reportable result = reportBuilder.generateReports();
        // and here validate 'result' to decide what to do if report has failed
    }
}
