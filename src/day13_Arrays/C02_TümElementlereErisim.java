package day13_Arrays;

import java.util.Arrays;

public class C02_TümElementlereErisim {
    public static void main(String[] args) {
        /*
            bir arrayin bir arayi yazdırmak ile elementlerini yadırmak farklıdır.
            bİR arrayi yzdırmak istersek Arrays.toSrting() ile yazdırırız
            standart olarak iki tarafinda koseli parantez olut
            aralarında da space olur

            elementlerini yazdırmak istersek loop kullanırız
            ve nasil yazdiracagımız bize bağlı olur
         */
        int[]arr={2,4,6,8,1,3,8,2};
        // bu array i yazdırın
        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8, 1, 3, 8, 2]

        // array in tum elementlerini yan yana araklarında / olacak sekilde yazdırırn
        System.out.println(arr[0]+"-");
        System.out.print(arr[1]+"-");
        System.out.print(arr[2]+"-");
        System.out.print(arr[3]+"-");
        System.out.print(arr[4]+"-");
        System.out.print(arr[5]+"-");
        System.out.print(arr[6]+"-");
        System.out.print(arr[7]);
        System.out.println("");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"-");
        }
        System.out.print(arr[arr.length-1]);

    }
}
