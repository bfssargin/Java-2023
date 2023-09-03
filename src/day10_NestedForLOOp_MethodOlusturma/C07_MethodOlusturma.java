package day10_NestedForLOOp_MethodOlusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {
        //verilen iki sayinin toplamını yazdıran bir method olusturun

        ikiSayiTopla(5,9);
        ikiSayiTopla(7,1);
        ikiSayiTopla(67,87);

    }
    public static void ikiSayiTopla(int sayi1, int sayi2){
        /*
        public: access modifier==> erisim belirleyici, simdilik hep public yapalım
        static: ozel bir keyword dur. ileride anlatılacak simdilik bunu kullanacaz
        void: retorn type, methodun bana bir sey döndürmeyecegini, sadece yazdıracagını belirtit.
        isim: methodun yaptıgı is ile baglantılı olmalı
        (parametreler): methodun yapabileceği is için bibim gödermemis gereken değişkenler

         */
        System.out.println("iki sayinin toplamı:"+(sayi1+sayi2));



    }



}
