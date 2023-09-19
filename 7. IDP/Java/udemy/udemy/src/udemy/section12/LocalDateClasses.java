package udemy.section12;

import java.time.LocalDate;

public class LocalDateClasses {
    /*
    Date : Joda Time Framework
        LocalDate, LocalDateTime, LocalTime < 3개 클래스 제공 Java 8 이후
        LocalDate now = LocalDate.now(); // Java.time 패키지에 포함
        LocalDateTime now = LocalDateTime.now(); // import 필요

     */
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.isLeapYear()); //윤년?

        System.out.println(today.plusDays(100));
        //plusMonths, plusYears
        //minusDays, minusMonths, minusYears
        LocalDate hundredYearsBefore = today.minusYears(100);
        // 불변성 클래스
        System.out.println(hundredYearsBefore);

        LocalDate yesterday = LocalDate.of(2023, 9, 18);
        System.out.println(yesterday);
        System.out.println(today);

        today.withYear(2022);
        today.withMonth(3);

        today.withDayOfYear(120);

        System.out.println(today.isBefore(yesterday)); //오늘은 어제보다 전인가?
        System.out.println(today.isAfter(yesterday)); // 오늘은 어제보다 이후 인가?


    }
}
