package day09_stringManipilations_forloop;

import java.util.Scanner;

public class C03_String_Manipilation {
    public static void main(String[] args) {
        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim=scanner.nextLine();

        System.out.println("lütfen soyisim giriniz");
        String soyisim=scanner.nextLine();

        if (isim.length()>soyisim.length()){
            isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
            soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase();

        }else {
            isim = isim.toUpperCase().charAt(0)+ isim.substring(1).toLowerCase();
            soyisim= soyisim.toUpperCase();
        }
        System.out.println(isim + " " + soyisim);



    }
}
