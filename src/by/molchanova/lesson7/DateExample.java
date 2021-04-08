package by.molchanova.lesson7;

import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class DateExample {

    public static void main(String[] args) throws ParseException {
//        Calendar calendar = new GregorianCalendar();
//        System.out.println(calendar);
//        System.out.println("*********************");
//        Date date = calendar.getTime();
//        System.out.println(date);
//        calendar.add(Calendar.MONTH, 2);
//        date = calendar.getTime();
//        System.out.println(date);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy kk:mm:ss z");
//        System.out.println(simpleDateFormat.format(date));
//        String dateString = "08.06.2020 20:43:47 MSK";
//        Date date1 = simpleDateFormat.parse(dateString);
//        System.out.println(date1);
//
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(localDateTime.format(timeFormatter));
    }
}
