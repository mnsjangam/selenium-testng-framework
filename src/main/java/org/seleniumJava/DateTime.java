package org.seleniumJava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
    public static void main(String[] args){
        DateTime dt = new DateTime();

//        dt.printDate();
//        dt.formatAPM();

        dt.currentDateAndTime();

    }

    public void printDate(){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        myDateFormat.format(localDate);
        String formattedDate = localDate.format(myDateFormat);
        System.out.println("Today's date "+formattedDate);
    }

    public void formatAPM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yy hh.mm aa");
        Date date = new Date();
        String formatDate = simpleDateFormat.format(date);

        System.out.println("Formatted Date: " + formatDate);
    }

    // Java Program to Display Current Date and Time
    public void currentDateAndTime() {
        LocalDateTime dateTime =  LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);
    }

    // Java Program to Display Dates of a Calendar Year in Different Format
    public void displayDatesInDifferentFormat() {

    }
}
