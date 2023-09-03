package day10_NestedForLOOp_MethodOlusturma;

public class C05_NestedForLOOPS {
    public static void main(String[] args) {
        /*
        verilen sayi için assadaki sekli olustur
        *
        *   *
        *   *   *
        *   *   *   *
        *   *   *   *   *
         */
        int sayi=5;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
