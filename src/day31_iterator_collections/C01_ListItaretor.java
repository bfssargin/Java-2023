package day31_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListItaretor {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);
        System.out.println(sayilar); // [5, 12, 3, 9]
        // index kullanmadan listenin tum elementlerini kalici olarak 2 ekleyin
        ListIterator lit=sayilar.listIterator();
        int sayi=0;
        while (lit.hasNext()){
            sayi= (int) lit.next();
            lit.set(sayi+2);
        }
        System.out.println(sayilar);
        // iterator lullanarak list in elementlerini son dan basa dogru yazdirin
        // yukaridaki islem den dolayi itaretor en sonda

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        // itaretor u nerede birakirsak orada kalir
        // basta oldugundan emin olmak isterseniz
        // ya yeni bir itaretor olusturursunuz veya loop body si bos olan
       //  bir while loop ile en basa gidersiniz

        // ornegin  itaretor u en sona goturelim
        while (lit.hasNext()){
            lit.next();
        }
        System.out.println(lit.previousIndex());//3
        System.out.println(lit.nextIndex());//4
    }
}
