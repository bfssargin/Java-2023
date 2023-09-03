package day13_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] arr1={"Ayten", "Sevda","Adem"};
        //array yazdırmak istersek
        // arrays clasından toString methodunu kullanmalıyız
        System.out.println(arr1);//[Ljava.lang.String;@6acbcfc0
        System.out.println(Arrays.toString(arr1));//[Ayten, Sevda, Adem]

        /*
            koseli parantez içinde elementleri yazdırır.
            elementler arasinda bir virgül ve bir space birakir.
         */

        // bir arrayin uzunlugunu ulasmak istersek
        // array da kac tane element olduğunu gösterir
        // method degil, variable dır, yaninda () yok.
        System.out.println(arr1.length);//3

        int[]arr2=new int[6];
        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0, 0, 0]
        arr2[0]=5;
        arr2[3]=9;
        arr2[4]=1;
        System.out.println(Arrays.toString(arr2));//[5, 0, 0, 9, 1, 0]




    }
}
