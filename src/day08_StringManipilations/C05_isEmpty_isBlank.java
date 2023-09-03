package day08_StringManipilations;

public class C05_isEmpty_isBlank {
    public static void main(String[] args) {

        String str="Java Candir";
        //str bos mu
        System.out.println(str.isEmpty());//false

        //str sadece bosluklardan mı olusuyor
        System.out.println(str.isBlank());//false

        str="           ";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//true

        str="";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//true
    }
}
