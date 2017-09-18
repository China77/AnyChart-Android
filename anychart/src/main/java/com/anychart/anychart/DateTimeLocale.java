package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DateTimeLocale extends JsObject  {

    
    private String[] ampms;
    private String dateFormats;
    private String dateTimeFormats;
    private String[] eras;
    private String[] erasNames;
    private Double firstDayOfWeek;
    private Double firstWeekCutOfDay;
    private String formats;
    private String[] months;
    private String[] narrowMonths;
    private String[] narrowWeekdays;
    private String[] quarters;
    private String[] shortMonths;
    private String[] shortQuarters;
    private String[] shortWeekdays;
    private String[] standaloneMonths;
    private String[] standaloneNarrowMonths;
    private String[] standaloneNarrowWeekdays;
    private String[] standaloneShortMonths;
    private String[] standaloneShortWeekdays;
    private String[] standaloneWeekdays;
    private String timeFormats;
    private String[] weekdays;
    private Double[] weekendRange;

    
    public DateTimeLocale(String[] ampms, String dateFormats, String dateTimeFormats, String[] eras, String[] erasNames, Double firstDayOfWeek, Double firstWeekCutOfDay, String formats, String[] months, String[] narrowMonths, String[] narrowWeekdays, String[] quarters, String[] shortMonths, String[] shortQuarters, String[] shortWeekdays, String[] standaloneMonths, String[] standaloneNarrowMonths, String[] standaloneNarrowWeekdays, String[] standaloneShortMonths, String[] standaloneShortWeekdays, String[] standaloneWeekdays, String timeFormats, String[] weekdays, Double[] weekendRange) {
        this.ampms = ampms;
        this.dateFormats = dateFormats;
        this.dateTimeFormats = dateTimeFormats;
        this.eras = eras;
        this.erasNames = erasNames;
        this.firstDayOfWeek = firstDayOfWeek;
        this.firstWeekCutOfDay = firstWeekCutOfDay;
        this.formats = formats;
        this.months = months;
        this.narrowMonths = narrowMonths;
        this.narrowWeekdays = narrowWeekdays;
        this.quarters = quarters;
        this.shortMonths = shortMonths;
        this.shortQuarters = shortQuarters;
        this.shortWeekdays = shortWeekdays;
        this.standaloneMonths = standaloneMonths;
        this.standaloneNarrowMonths = standaloneNarrowMonths;
        this.standaloneNarrowWeekdays = standaloneNarrowWeekdays;
        this.standaloneShortMonths = standaloneShortMonths;
        this.standaloneShortWeekdays = standaloneShortWeekdays;
        this.standaloneWeekdays = standaloneWeekdays;
        this.timeFormats = timeFormats;
        this.weekdays = weekdays;
        this.weekendRange = weekendRange;

        js.append(String.format(Locale.US, "{ampms: %s,dateFormats: %s,dateTimeFormats: %s,eras: %s,erasNames: %s,firstDayOfWeek: %f,firstWeekCutOfDay: %f,formats: %s,months: %s,narrowMonths: %s,narrowWeekdays: %s,quarters: %s,shortMonths: %s,shortQuarters: %s,shortWeekdays: %s,standaloneMonths: %s,standaloneNarrowMonths: %s,standaloneNarrowWeekdays: %s,standaloneShortMonths: %s,standaloneShortWeekdays: %s,standaloneWeekdays: %s,timeFormats: %s,weekdays: %s,weekendRange: %s}",  Arrays.toString(ampms), dateFormats, dateTimeFormats, Arrays.toString(eras), Arrays.toString(erasNames), firstDayOfWeek, firstWeekCutOfDay, formats, Arrays.toString(months), Arrays.toString(narrowMonths), Arrays.toString(narrowWeekdays), Arrays.toString(quarters), Arrays.toString(shortMonths), Arrays.toString(shortQuarters), Arrays.toString(shortWeekdays), Arrays.toString(standaloneMonths), Arrays.toString(standaloneNarrowMonths), Arrays.toString(standaloneNarrowWeekdays), Arrays.toString(standaloneShortMonths), Arrays.toString(standaloneShortWeekdays), Arrays.toString(standaloneWeekdays), timeFormats, Arrays.toString(weekdays), Arrays.toString(weekendRange)));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}