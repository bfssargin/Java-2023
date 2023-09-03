package day09_stringManipilations_forloop;

import java.util.Scanner;

public class C02_StringManipilations {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sifre girin");
        String sifre=scanner.nextLine();
        // tüm hatalari raporlamam istendiği için bağımsız if cümlesi kullanmalıyım
        //tum sartları sağladığını kontrol etmek için sayaç kullanalım
        int sayac=0;
        // ilk harf kucuk olmalı
        char ilkHarf=sifre.charAt(0);
        if (!(ilkHarf>='a'&&ilkHarf<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }
        //son karakter rakam olmali
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (!(sonHarf>='0'&&sonHarf<='9')){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }
        //- sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk içermemeli");
            sayac++;
        }
        //  - uzunlugu en az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println("sifrenin uzuznluğu en az 10 karakter olmalı");
            sayac++;

        }
        if (sayac==0){
            System.out.println("Sifreniz basari ile kaydedilmistir");
        }
    }
}
