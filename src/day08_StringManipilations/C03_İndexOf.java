package day08_StringManipilations;

public class C03_İndexOf {
    public static void main(String[] args) {

        String str="Java en iyisi";
        System.out.println(str.indexOf("e"));//5
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.indexOf("en"));//5
        System.out.println(str.indexOf("yi"));//9
        System.out.println(str.indexOf("iyisi"));//8
        System.out.println(str.indexOf("iy"));//8
        System.out.println(str.indexOf("is"));//10
        System.out.println(str.indexOf("en guzel"));//-1
        System.out.println(str.indexOf("a",2));//3
        System.out.println(str.indexOf("a",1));//1
        System.out.println(str.indexOf("i",5));//8
        System.out.println(str.indexOf("i",9));//10


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere veya daha fazla kullanilmis

        //"Java en iyisi" içerisindeki en kelimesi için
        if (str.indexOf("en")==-1){
            System.out.println("aradığınız kelime bu cumlede yok");
        }else {
            int birinciKelimeIndex=str.indexOf("en");
           if (str.indexOf("en",birinciKelimeIndex+1)==-1){
               System.out.println("bu cumlede aradığınız kelimeden 1 tane var");
           }else {
               System.out.println("bu cumlede aradığınız kelime birden fazla kullanılmıs");
           }
        }
    }
}
