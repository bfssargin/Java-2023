package day10_NestedForLOOp_MethodOlusturma;

public class C03_NestedforLoop {
    public static void main(String[] args) {
        /*
        verilen bir sayi için assaddaki tabloyu olustutun
        orn:sayi=3
        1*1 1*2 1*3 1*4
        2*1 2*1 2*3 2*4
        3*1 3*2 3*3 3*4
        4*1 4*2 4*3 4*4

         */
        int sayi=3;
        for (int i = 1; i <=sayi ; i++) {//dısardaki loop satırları kontrol eder
            for (int j = 1; j <= sayi; j++) {//içrdeki loop(inner) sutunları kontrol eder
                System.out.print(i+"*"+j+"  ");
            }
            System.out.println("");
        }
         /*
            verilen iki sayi icin asagidaki tabloyu olusturun
            orn : a = 3
                  b = 4
            1*1  1*2  1*3  1*4
            2*1  2*2  2*3  2*4
            3*1  3*2  3*3  3*4
         */
        int a = 3;
        int b = 4;
        for (int i = 1; i <=a ; i++) { // outer ==> satirlari
            for (int j = 1; j <=b ; j++) { // inner ==> sutunlari
                System.out.print(i+"*"+j+"  ");
            }
            System.out.println("");
        }


    }
}
