package day09_stringManipilations_forloop;

public class C08_forLoop_DikkateEdilecekler {
    public static void main(String[] args) {
        // verilen ilk deger bitisi sartini saglamiyorsa
        for (int i = 10; i < 0 ; i--) {
            System.out.println(i);
        }
        // Kod calisir ancak ilk deger icin bile bitis sarti saglanmadigindan loop body hic calismaz
        // baslangic degeri ve artis/azalis miktari ile
        // bitis sarti hic saglanamazsa
        for (int i = 10; i >=0 ; i++) {
            System.out.println(i+" ");
        }
        // buna sonsuz loop denir
        // ve makinenin rami dolana kadar kod calisir

    }
}
