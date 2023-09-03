package day09_stringManipilations_forloop;

import java.util.Scanner;

public class C01_sTRİNGmANİPİLATİONS {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //  - cumlede ev geciyorsa, “home home sweet home” yazdirin
        //  - cumlede is geciyorsa, “calismak guzeldir”
        //  - ikisini de iceriyorsa “Hem ev lazim hem is”
        //  - hicbirini icermiyorsa “cok calisman lazim” yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir cümle girin");
        String cumle=scanner.nextLine();
        //if else kullanmalıyız. en kısıtlayıcı olandan baslayalım
        if (cumle.contains("ev")&& cumle.contains("is")){
            System.out.println("hem ev lazım hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");

        } else if (cumle.contains("is")) {
            System.out.println("calısmak guzeldir");

        }else {
            System.out.println("cok calısman lazım");
        }
    }
}
