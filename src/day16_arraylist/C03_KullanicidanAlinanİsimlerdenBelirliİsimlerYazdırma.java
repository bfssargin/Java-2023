package day16_arraylist;

import java.util.List;

public class C03_KullanicidanAlinanİsimlerdenBelirliİsimlerYazdırma {
    public static void main(String[] args) {
        // kullancidan alinan isimlerden olusan listede 3 harften fazla olan isimleri yazdirin
        List<String> yeniIsimler = C02_KullaniciListOlusturma.kullanicidanStringAlarakListeOlusturma();
        // listenin elemanlarına ulasmak icin bir loop
        // listenin elemanları eger 3 harf veya fazlaysa yazdiran code
        for (int i = 0; i <yeniIsimler.size() ; i++) {
            if (yeniIsimler.get(i).length()>=3){
                // ahmet hasan huseyin ali ad su
                System.out.println(yeniIsimler.get(i));
            }
        }
    }
}
