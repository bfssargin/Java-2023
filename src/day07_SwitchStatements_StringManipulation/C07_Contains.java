package day07_SwitchStatements_StringManipulation;

public class C07_Contains {
    public static void main(String[] args) {
        String str="Java ogren offer al";
        //str da a harfi var mı
        System.out.println(str.contains("a"));//true
        System.out.println(str.contains("x"));//false
        System.out.println(str.contains("Java"));//true
        System.out.println(str.contains("Offer"));//false

        //char aratabilirmiyiz
        //System.out.println(str.contains('e')); charsequense lazım, char aratamıyoruz
        String olmayankelime="Dneiz";
        System.out.println(str.contains(olmayankelime));//false
        System.out.println(str.contains(" "));//true

    }
}
