package day12_doWhileLOOP;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
        /*
        whileloop da kullanacagımız variablr lar bastan deger atamamız gerekir.
        eger bu varibla lar yanlıs değer atarsak while
        loop bodysi hiç calısmayabilir
        java bu dezavantajı ortadan kaldırmak için dowhile loop olusturmustur.
        dowhileloop ilk kontrolu yapmadan kodu 1 kez cakıstırır sonra kontrol yapar
         */


        // kullanicidan sayi degerleri alip toplayalim
        // kullanici 0'a bastiginda islem bitsin
        // ve toplami yazdirsin

        Scanner scanner=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        while (sayi !=0){
            System.out.println("lütfen toplamamk için bir sayi yazıb \nbitirmek için 0 a basın");
            sayi=scanner.nextInt();
            toplam+=sayi;
        }
    }
}
