package day07_SwitchStatements_StringManipulation;

public class C06_charAt_lenght {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor. Kendisini cok seviyoruz";
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(29));
        //System.out.println(str.charAt(35));//StringIndexOutOfBoundsException

        //str da toplam kac karakter var
        System.out.println(str.length());//30
        //son harfi yazdırın
        int uzunluk=str.length();
        System.out.println(str.charAt(uzunluk-1));
        //son harften bir onceki harf yazdırın
        System.out.println(str.charAt(uzunluk-2));

        //sondan 3. harfi yazdırın
        System.out.println(str.charAt(str.length() - 3));

    }
}
