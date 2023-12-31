package day07_SwitchStatements_StringManipulation;

public class C10_Substring {
    public static void main(String[] args) {
        String str="Java Candir";
        // sadece candir kısmını yazdırın
        System.out.println(str.substring(5));//Candir
        System.out.println(str.substring(2));// va Candir
        System.out.println(str.substring(10));// r
        System.out.println(str.substring(11));// bos satir
        //System.out.println(str.substring(12));//StringIndexOutOfBoundsException
        // sadece java kısmını yazdırın
        System.out.println(str.substring(0,4));//Java
        // java da baslangıc ve bitiş indexleri verildiğinde
        //genellikle baslangıc indezleri dahil(inclusive)
        //bitis index i hariç(exclısive)olur

        System.out.println(str.substring(3,4));//a
        System.out.println(str.substring(1,2));//a
        //eğer sadece 1 harf almak isterseniz
        //subsitring (harfinİndexsi, harfinIndexsi+1)

        System.out.println(str.substring(5,5));//hiclik
        //System.out.println(str.substring(8,5));//StringIndexOutOfBoundsException
        String str2 = "eSRa";
        // ilk harfini buyuk, kalanlari kucuk harf olacak sekilde duzenleyin
        str2 = str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase();
        System.out.println(str2); // Esra
    }
}
