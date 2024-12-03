package day3_5_calendar;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class Day3_5_Calendar {

    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        Formatter f = new Formatter();
        System.out.println(f.format(Locale.ITALY, "%tA %1$tB %1$tY %1$tj", date));
        System.out.println(String.format(Locale.forLanguageTag("ru"), "%tA %1$tB %1$tY %1$tj", date));
    }
}
