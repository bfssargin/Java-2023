package day08_StringManipilations;

import java.util.Scanner;

public class C04_lastIndexOf {
    public static void main(String[] args) {
        String str="Java cok faydali";
        System.out.println(str.lastIndexOf("a"));//13
        System.out.println(str.lastIndexOf("a",10));//10
        System.out.println(str.lastIndexOf("a",12));//10

        System.out.println(str.lastIndexOf("a"));//13
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.lastIndexOf("a",2));//1

        System.out.println(str.indexOf("o"));//6
        System.out.println(str.lastIndexOf("o"));//6
        System.out.println(str.indexOf("cok"));//5
        System.out.println(str.lastIndexOf("cok"));//cok

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis
        String str1="Java cok kolay";
        String str2="a";
        int bastanIndex=str1.indexOf(str2);
        int sondanIndex=str1.lastIndexOf(str2);

        if (str1.indexOf(str2)==-1){
            System.out.println("aradığınız kelime cümlede kullanılmamıs");
        } else if (bastanIndex==sondanIndex) {
            System.out.println("aradıgınız kelime 1 kere kullanılmıs");

        }else {
            System.out.println("aradığınız kelime 1 den fazla kullanılmıs");
        }

    }
}
