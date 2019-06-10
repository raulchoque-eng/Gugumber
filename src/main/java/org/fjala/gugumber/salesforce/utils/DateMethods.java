/*
 * @(#) DateMethods.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Jala
 * Foundation, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package org.fjala.gugumber.salesforce.utils;

import org.fjala.gugumber.core.selenium.utils.DriverMethods;

import java.util.Date;

/**
 * DateMethods class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class DateMethods {

    /**
     * Constant for the patter of hour of a Date.
     */
    final static String PATTERN_TIME = "h:mm a";

    /**
     * Constant for the patter of fe of a Date.
     */
    final static String PATTERN_DATE = "dd-MM-yyyy";

    /**
     * Constructor method class.
     */
    private DateMethods() {
    }

    /**
     * Returns the hour with a format as a string.
     *
     * @param date    is the information by get a time.
     * @param addHour is information by add hours.
     * @return a hour with a format as a string..
     */
    public static String getHourBefore(final Date date, final int addHour) {
        String resTime = "";
        final String timeAsString = DriverMethods.convertDateToString(date, PATTERN_TIME);
        String dateAsString = DriverMethods.convertDateToString(date, PATTERN_DATE);
        final String[] dateHour = (timeAsString).split(":", 2);
        final String[] minAndBeforeAfterMidday = dateHour[1].split(" ");
        final int hour = Integer.parseInt(dateHour[0]);
        final int nextHour = hour + addHour;
        if ((1 <= nextHour) && (nextHour <= 11)) {
            resTime = addZeroBeforeString(nextHour).concat(":" + dateHour[1]);
        } else {
            if (hour == 12) {
                resTime = addZeroBeforeString(1) + ":" + dateHour[1];
            } else {
                if ((minAndBeforeAfterMidday[1].compareTo("AM")) == 0) {
                    resTime = addZeroBeforeString(nextHour) + ":" + minAndBeforeAfterMidday[0].concat("PM");
                } else {
                    dateAsString = addDayInDate(dateAsString);
                    resTime = addZeroBeforeString(nextHour) + ":" + minAndBeforeAfterMidday[0].concat("AM");
                }
            }
        }
        return dateAsString.concat(" " + resTime);
    }

    /**
     * Returns the number add an space and zero before it.
     *
     * @param number is for verifies if value need a zero before it.
     * @return as a string the number with space an zero.
     */
    private static String addZeroBeforeString(final int number) {
        return number < 10 ? ("0" + (number)) : Integer.toString(number);
    }

    /**
     * Adds one day in the date.
     *
     * @param date is a date as string for add a day.
     * @return as a string the next day in a date.
     */
    private static String addDayInDate(final String date) {
        final String[] dayDate = (date).split("-", 2);
        final int day = Integer.parseInt(dayDate[0]) + 1;
        return addZeroBeforeString(day).concat(dayDate[1]);
    }

    /**
     * Returns the date or time as a string of a date..
     *
     * @param date           is the date as a string.
     * @param nameDateOrTime is the value that get the date.
     * @return as a strin the date or time.
     */
    public static String getDateTime(final String date, final String nameDateOrTime) {
        final String[] arrayDate = date.split(" ", 2);
        return nameDateOrTime.equals("date") ? arrayDate[0] : arrayDate[1];
    }
}
