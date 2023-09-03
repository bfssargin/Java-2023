package day10_NestedForLOOp_MethodOlusturma;

public class C09_faktoriyalDeğeriYazdırma {
    public static void main(String[] args) {
        //verdiğimiz bir sayinin faktoriyal değerini yazdıran
        // bir method olusturun
        faktoriyalDegeriYazdır(5);
        faktoriyalDegeriYazdır(7);
    }
    public static void faktoriyalDegeriYazdır(int sayi){
        int faktoriyal=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyal*=i;

        }
        System.out.println(sayi+"!= "+faktoriyal);



    }
}
