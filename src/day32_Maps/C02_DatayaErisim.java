package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_DatayaErisim {
    public static void main(String[] args) {
        // numarasi verilen ogrencinin isim ve soyismine
        // ilk harfleri buyuk, sonraki harfleri kucuk olacak sekilde yazdirirn

        // map de bir bilgiye erisim birkac adım ile mümkün oldugundan bu islemleri method olarak olusturup
        // ihtiyac duyuldugunda kullanmak daha kullanıslı olacaktir.

        Map<Integer,String> ogrenciMap=new HashMap();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        // map ve ogrenci numarasi verdiğimizde istenen formatta isim ve soyisim bilgisini
        // bize dödüren bir method olusturalim
        System.out.println(MapMethodlar.numaraIleOgreciBulma(ogrenciMap,104));// Ayse Can
    }

}
