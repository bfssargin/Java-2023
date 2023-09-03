package day10_NestedForLOOp_MethodOlusturma;

public class C06_MethodOlusturma {
    public static void main(String[] args) {
        String str="Java'nin robotları";
        str.toUpperCase();
        //eger bir method bize bir sonuc dödürüryorsa method calistiğinda
        // methodu calistirmak sonucu görmek için yeterli değildir
        // sonucu görmek istiyorsak;
        // - ya dire methodCall ı sout içersirne yaparız
        //- veya dönen bilgiyi bir variable a kaydeder.
        // kodumuzda istediğimiz zaman onu yazdırır veya kullanırız.

        System.out.println(str.toUpperCase());//JAVA'NİN ROBOTLARI
        str=str.toUpperCase();

    }
}
