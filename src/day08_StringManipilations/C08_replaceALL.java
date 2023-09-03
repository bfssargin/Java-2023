package day08_StringManipilations;

public class C08_replaceALL {
    public static void main(String[] args) {

        //STR İÇİNDEKİ BÜTÜN SAYILARI METHOD İLE TEMİZLEYİN
        String str="J23a3345v4353a 234C354345a3456n345dir";
        /*
        replaceAll methodu elementlerin ortak özelliklerini kullanarak genel işlemleri yapmak için kullanılır.

        genel özellikler Regex olarak tanımlanıyor.
         */
        System.out.println(str.replaceAll("\\d", ""));//Java Candir


    }
}
