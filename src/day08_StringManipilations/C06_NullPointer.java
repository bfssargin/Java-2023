package day08_StringManipilations;

public class C06_NullPointer {
    public static void main(String[] args) {
        /*
        null bir pointerdır
        null bir değer değildir
        non-primitive datalara değer atamadığını işaret eder
        Strigng str;// değer atanmadığı için yazdırma vs işlemleri yapılamaz

        yine de değer ataması yapmadan bos olarak kalmasını,
         lakin en azından yeri geldiği zaman en azından yazdırabilmesini istiyorsak null pointer kullanılır.
         */
        String str=null;// str a bir değer atamadı, sadece bos olduğunu bildiğimizi java ya bildirdik
                        //str hala bos
        System.out.println(str);// null// içinde bir sey olmamasına karsın null pointer ile gösterildiği için
                                //en azından yazdırma işlemi yapılabiliyor
        /*
        yazdırma gibi işlemlerde hata vermesi için bos değere null ataması yapılır
         */
        // str.concat("Ali"); // nullpointerException // null olan bir değer ile methodlar kullanılmaz
        //System.out.println(str.length());//yok olan bir seyin uzunluğu ölçülemez
        String test="";// burda testin içinde "" kayıt altına alınmıs.kullanılabilir
        System.out.println(test.length());
        System.out.println(str+"Ali");
        Integer sayi=null;
        //str=null ,,,, test="";
       // System.out.println(str.isEmpty());//NullPointerException
        System.out.println(test.isEmpty());//true

        /*
        null ataması yapılan variable hicbir method ile KULLANILAMAZ!
        yazdırılabilir veya + ile kullanılabilir.
         */
    }
}
