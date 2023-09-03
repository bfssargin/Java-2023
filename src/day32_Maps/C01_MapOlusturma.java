package day32_Maps;

import java.util.*;

public class C01_MapOlusturma {
    public static void main(String[] args) {
        // variable olusturun
        int sayi=5;
        String str="Java candir";

        // coklu elemet collections olusruma
        List<String>liste=new ArrayList<>();
        Set <Integer>sayiSeti=new HashSet<>();
        liste.add("Bilal");
        sayiSeti.add(25);

        // map her zaman key-value ikilisi barindirir
        //dılayisiyla bu ozelliği sayesinde Map olustururken
        // key ve value nun data turleri yazilmalidir
        Map <Integer,String>ogrenciMap=new HashMap();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        System.out.println(ogrenciMap);
        // map i yazdirdigimizda key=value seklinde yazar
        // = atama isareti değilidr, yazdirirken bilgi vermek için yazilir
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        System.out.println(ogrenciMap.get(101));//Ali-Can-11-H-MF
        // 103 numarali ogrencinin subesini yazdirin
        // Map de tum bilgiler String olarak birlestirilen valu içerisindedir.
        // String deki bir bilgi ye direk ulasamayiz
        // manupilation yapmaliyiz

        // 1- once istenen ogrencinin value sini bulalim ve kaydedelim
        String value103=ogrenciMap.get(103);//Ali-Cem-11-K-TM
        // 2- value ozel bir isarettele birlestirilen farkli bilgilerden olusur
        // split ile bu bilgileri bir array e donusturup kaydedelim
        String[] valueArr=value103.split("-");//[Ali, Cem, 11, K, TM]
        // 3- artik istedigim bilgiye tanimli index ile ulasabilirim
        System.out.println(valueArr[3]);// K






    }
}
