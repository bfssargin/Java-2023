package day21_dateTime_varargs;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2023-04-25
        LocalDate tarih2 = LocalDate.ofYearDay(2024,200);

        System.out.println(tarih2); // 2024-07-18

        System.out.println(tarih.isAfter(tarih2)); // false
        System.out.println(tarih.isLeapYear()); // false

        System.out.println(tarih2.isLeapYear()); // true
        System.out.println(tarih.datesUntil(tarih2).count()); // 450

        System.out.println(tarih.getDayOfWeek()); // TUESDAY

        LocalDate dogumTarihi= LocalDate.of(2000,7,21);
        System.out.println("İremin doğum günü : "+dogumTarihi.getDayOfWeek()); // TUESDAY
        LocalDate dogumTarihi2=LocalDate.of(1997,12,17);
        System.out.println("Bilalin dogum günü : "+ dogumTarihi2.getDayOfWeek());

        System.out.println(tarih2.lengthOfYear()); // 366


        // kullanicidan iki kisinin dogum tarihlerini yil ay gun olarak alip
        // hangisinin daha once dogdugunu bulan bir method olusturun
    }
}
