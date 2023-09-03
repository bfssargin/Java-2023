package day32_Maps;

import java.util.Map;
import java.util.Set;

public class C03_Keys {
    public static void main(String[] args) {
        // her class da map ile islem yapabilmek icin bir map olusturmak ve ogrencileri eklemek zorundayiz
        // MapMethodlar clasında bir map olusturup
        // ogrencileri ekkleyip bize döndüren bir method olusruralim

        Map<Integer,String> ogrenciMap=MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);// {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        // map deki tüm key leri yazdirin
        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106]

        // bu seti kaydetmek istersek
        Set<Integer>keySeti=ogrenciMap.keySet();
        //keySeti deki ogrenci numaralarini assadaki formatta yazdiririn
        /* 1-101
         2- 102
         3- 103

         */
        int siraNo=1;
        for (Integer eachKey:keySeti
             ) {
            System.out.println(siraNo+ "- "+ eachKey);
            siraNo++;//1- 101
            // 2- 102
            // 3- 103
            // 4- 104
            // 5- 105
            // 6- 106
            System.out.println("");
            // tum ogrencilrin isim ve soyisimlerini bir liste olarak yazdiran bir method olusturun
            MapMethodlar.tumOgreciListesiYazdir(ogrenciMap);
            /*
                1- Ali Can
                2- Veli Cem
                3- Ali Cem
                4- Ayse Can
                5- Sevgi Cem
                6- Sevgi Can

             */

        }


    }
}
