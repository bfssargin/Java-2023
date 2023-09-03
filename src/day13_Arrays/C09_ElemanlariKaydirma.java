package day13_Arrays;

import java.util.Arrays;

public class C09_ElemanlariKaydirma {
    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

        int [] input={4,5,6,7};
        int[]output=new int[4];

        System.out.println(Arrays.toString(input));//[4, 5, 6, 7]
        System.out.println(Arrays.toString(output));//[0, 0, 0, 0]

        //1. adım son elemani gecici bir yere kaydet
        int geciciKayitYeri=input[3];
        //elemanlari saga kaydirdik
        output[3]=input[2];
        output[2]=input[1];
        output[1]=input[0];
        System.out.println(Arrays.toString(output));//[0, 4, 5, 6]
        //kaydettigimiz son elemani yeni arrayin basına koyduk
        output[0]=geciciKayitYeri;
        System.out.println(Arrays.toString(output));//[7, 4, 5, 6]

    }
}
