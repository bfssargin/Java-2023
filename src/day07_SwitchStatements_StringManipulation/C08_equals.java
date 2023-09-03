package day07_SwitchStatements_StringManipulation;

public class C08_equals {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3="java";
        String str4="JAVA";
        String str5="JaVa";
        String str6=new String("Java");
        // normalde non primitive data türündeki objeler, new keyword u ile olusturabiliriz
        //string i de new keyword u ile olustururabilirz
        //ancak java bizim isimizi kolaylastırmak icin
        //string e direk değer atamasını da sağlamıstır
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//false
        System.out.println(str4.equals(str5));//false
        System.out.println(str2.equals(str6));//true
        /*
        equals methodu verilen iki stringin metin olarak aynı olup olmadığına bakar.
        case sensitive dir. dolayısıyla buyuk kucuk harf farklarına dikkat edilmelidir.

         */
        //string için== kullanılamaz mı?
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str6);//false Java == Java


        /*
        equals methodu sadece değerlere bakar metin aynı ise sonuc true,
        metin farklı ise sonuc false olur
        == ise hem metin değerini hemde referansa bakar
        ilerde anlatacagımız uzere java bazen aynı referansları farklı objelere de verir

        simdilil
        iki stringin metin olarak ayni olduğunu kontrol etmek isterseniz
        equals methodunu kullanın
         */
    }
}
