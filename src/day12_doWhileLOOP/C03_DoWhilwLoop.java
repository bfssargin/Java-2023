package day12_doWhileLOOP;

public class C03_DoWhilwLoop {
    public static void main(String[] args) {
        // Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
        // for loop ile yapalim
        for (int i = 'k'; i <='t' ; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println("");
        // while loop ile yapalim
        char harf='k';
        while (harf <= 't'){
            System.out.print(harf + " ");
            harf++;
        }
        System.out.println("");
        // do while loop ile yapalim
        harf= 'k';
        do {
            System.out.print(harf + " ");
            harf++;
        }while (harf<='t');
    }
}
