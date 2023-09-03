package day27_pollymorphism_abstractClasses;

import java.util.ArrayList;

public class C02 extends C01_OverridingReturnType{

    void method1(){

    }
    double method2(){
        //return type void veya primitive data turu ise ovverriden method ile overriding method un return typelari
        //aynı olmalıdır
        return 3;
    }
    String method3(){
        // return type nun primiteve ise
        //child class daki methodun return type i
        // parent class daki ovverriden methodunun return type nın
        // AYNİSİ veya CLASS i olmalidir
        // IS-A relationship ile kontrol edilebilir.
        //Covariant
        return "Selenium Heycandir";
    }
    ArrayList<String> method4(){

        return new ArrayList<>();
    }
}

