package day24_Inheritance;

public class Btoyota extends Araba{
    String marka= "Toyota";
    String uretimYeri="Uretim yeri belirtilmedi";
    String lastik="Toyota araclar pirelli lastikleri kullanir";
    public void guvenlik(){
        System.out.println("Toyota araclar ekstara guvenlik donanimlarina sahiptir");
    }
    public void aku(){
        System.out.println("Toyota araclar inci aku kullanir");
    }
}
