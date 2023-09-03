package day06_nestedIfElseStatement;

import java.util.Scanner;

public class C01_sifrekontrolu {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayi girmesini isteyin
        sayi assadaki 4 sarti sağliyorsa mukemmel sayi
        saglmayan sartların tamanını kullanıcıya soyleyin
        1- sayi 4 basamaklı olmaldır
        2- sayi 3 ile bölünebilmelidir
        3- sayi 5 ile bölünebilmesidir.
        4- sayinin birler basamagı tek sayi olmalıdır.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi girin");
        int sayi=scanner.nextInt();
        boolean sifreBasariliMi=true;
        //1- sayi 4 basamaklı olmaldır
        if (sayi<1000||sayi>9999){
            System.out.println("sayi 4 basamaklı olmalıdır");
            sifreBasariliMi=false;
        }if (sayi % 3 !=0){
            System.out.println("sayi 3 ile bölünebilmelidir");
            sifreBasariliMi=false;
        }//sayi 5 ile bölünebilmesidir.
        if (sayi % 5 !=0){
            System.out.println("sayi 5 ile bölünebilmesidir.");
            sifreBasariliMi=false;
        }
        //sayinin birler basamagı tek sayi olmalıdır.
        if ((sayi %10)%2==0 ){
            System.out.println("sayinin birler basamagı tek sayi olmalıdır.");
            sifreBasariliMi=false;
        }if (sifreBasariliMi){
            System.out.println("mukemmel sayi");
        }
    }
}
