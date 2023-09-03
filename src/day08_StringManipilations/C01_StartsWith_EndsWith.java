package day08_StringManipilations;

public class C01_StartsWith_EndsWith {
    public static void main(String[] args) {
        /*
        bir yazının str bir yazı parcacılığı ile baslayııp baslamadığını test ederek,
        true veya false cevabını verir
         */
        String str= "Java cok eglenceli";
        System.out.println(str.startsWith("java"));//false
        System.out.println(str.startsWith("Java"));//true

        System.out.println(str.startsWith(str));//her yazı kendiyle baslar
        System.out.println(str.startsWith(""));//true

        System.out.println(str.endsWith("a"));//false
        System.out.println(str.endsWith("eglenceli"));//true
        System.out.println(str.endsWith("celi"));//true
        System.out.println(str.endsWith("Java cok eglenceli"));//true



    }
}
