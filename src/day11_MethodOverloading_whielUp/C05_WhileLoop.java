package day11_MethodOverloading_whielUp;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdn bir sayi alıp 3 ile bölünüp bölünmedigini yazın
        //kullanıcı 3 ile bölünebilen sayi girinceye kadar tekrar değer isteyin
        /*
        tekrar sayisi tam olarak bilinmeyen tekrar sayisi farklı bir sarta bağlı olan durumlarda
        WhilLoop kullanırız
         */

        Scanner scanner=new Scanner(System.in);

        // girilen sayi 3 e bölünebilene kadar tekrar et
        //whileloop da içine yazılan sart sağlanmadığı muddetce kod tekrar calişir
        int sayi=2;
        while (sayi%3!=0){
            System.out.println("lütfen pozitif bir tam sayi girin");
             sayi=scanner.nextInt();

            if (sayi%3==0){
                System.out.println("3 ile tam bölünebiliyor");
            }else {
                System.out.println("3 ile tam bölünemiyor");
            }

        }
    }
}
