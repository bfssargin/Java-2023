package day07_SwitchStatements_StringManipulation;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Java Candir";
        //buyuk harfle yazdırın
        System.out.println(str.toUpperCase());//JAVA CANDİR
        System.out.println(str);
        //str ı buyuk harfli olarak ata
        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(str.toLowerCase());
        //str ı turkce karekterleri dikkate alarak kucuk harfe cevirin
        str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);//java candır
        String str2="Kimse beni aramı";
        //türkçe karekterlee uygun olarak yazdır
        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));//KİMSE BENİ ARAMI

    }
}
