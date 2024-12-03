package day1_lab1;

import java.util.StringTokenizer;

public class Date {

    private int year, month, day;
    private static int era;
    static {
        era = 1;
        System.out.println("static block init era "+era);
    }
    
    static {
        era = 2;
        System.out.println("static block init era "+era);
    }
    
    {
        System.out.println("code block");
    }
    
    public Date() {
        this(2024, 11, 25);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(String date) {
        StringTokenizer st = new StringTokenizer(date);
        year = Integer.parseInt(st.nextToken("-"));
        month = Integer.parseInt(st.nextToken("-"));
        day = Integer.parseInt(st.nextToken("-"));
    }

    public Date incYear() {
        if(day==29 && month==2) {
            month++;
            day=1;
        }
        year++;
        return this;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static int getEra() {
        return era;
    }

    public static void setEra(int era) {
        Date.era = era;
    }
    
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d (%d)", day, month, year, era);
    }

}
