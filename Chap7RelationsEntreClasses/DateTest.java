package Chap7RelationsEntreClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class DateTest {
    
    public static void main(String[] args) {
        GregorianCalendar gc1 = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar(2019, 8, 17, 22, 14);
        LocalDateTime ld1 = LocalDateTime.now();
        LocalDateTime ld2 = LocalDateTime.of(2019, 9 , 17, 22, 14);
        LocalDateTime ld3 = LocalDateTime.parse("2019-09-17T22:14:00");
    
         LocalDateTime ld5 = LocalDateTime.of(2019, 9, 17, 22, 14);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = ld5.format(formatter);
        System.out.println();
        System.out.println(gc1.getTimeZone().getID());
        System.out.println();
        System.out.println(gc2.getTimeZone().toZoneId());
        System.out.println();
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println();
        System.out.println();
        System.out.println(formattedDate);
    }
}
