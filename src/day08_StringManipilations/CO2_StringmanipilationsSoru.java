package day08_StringManipilations;

import java.util.Scanner;

public class CO2_StringmanipilationsSoru {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen mail adresinizi girin");
        String email=scanner.next();
        //name@gmail.com
        //if (!email.contains("@")) {
          //  System.out.println("gecersiz mail");
        //}if (!email.contains("@gmail.com")){
          //  System.out.println("mail gmail olmalı");
        //}if (!email.endsWith("gmail.com")){
          //  System.out.println("mailde yazım hatası var ");


        // eger tetsleri kademeli olarak kullamak istiyorsak if-else kullanılır
        if (!email.contains("@")){
            System.out.println("gecersiz mail");
        }else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmalı");
        }else if (!email.endsWith("gmail.com")){
            System.out.println("mailde yazım hatası var ");
        }
    }
}
