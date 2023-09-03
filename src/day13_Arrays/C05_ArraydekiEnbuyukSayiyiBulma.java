package day13_Arrays;

public class C05_ArraydekiEnbuyukSayiyiBulma {
    public static void main(String[] args) {
        //verilen int array deki en büyük sayiyi bize donduren bir method olustuturun
        int[] arr={2,4,6,8,1,3,7,5};
        System.out.println(enBuyukSayi(arr));


}
    public static int enBuyukSayi(int[] arr){
        int enBuyukSayi=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > enBuyukSayi){
                enBuyukSayi= arr[i];
            }
        }
        return enBuyukSayi;
    }
}
