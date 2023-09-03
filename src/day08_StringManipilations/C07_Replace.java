package day08_StringManipilations;

public class C07_Replace {
    public static void main(String[] args) {
        /*
        bir yazı içerisinde belli baslı harfleri ya da kelimeleri istediğimiz
         baska bir unsur ile değiştirilmesidir
         */
        String str="Javasiz olmaz";
        System.out.println(str.replace("J", "H"));//Havasiz olmaz
        System.out.println(str.replace("a",""));//Jvsiz olmz
        System.out.println(str.replace("Javasiz", "X"));//X olmaz
        System.out.println(str.replace("v","yayayaya"));//Jayayayayaasiz olmaz
        System.out.println(str.replace("va","lalalala"));//Jalalalalasiz olmaz

        System.out.println(str);//Javasiz olmaz
        // atama yapılmadığı surece yapılan değişiklikler sadece o satırı içerir

       //str içindeki boslukları yok edein
        String str1="Java ile hayat Cok daha güzel";
        System.out.println(str1.replace(" ", ""));//JavailehayatCokdahagüzel
        System.out.println("str1:"+str1);//str1:Java ile hayat Cok daha güzel
        System.out.println(str.replace(" ",""));
        System.out.println("str1 = " + str1);
        String str2 = " Java hayattir";
        System.out.println(str2.replaceFirst("a", "X"));



    }
}
