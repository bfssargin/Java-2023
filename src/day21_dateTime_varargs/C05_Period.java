package day21_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C05_Period {
    public static void main(String[] args) {


        System.out.println("===============");

        LocalDate IremDogum=LocalDate.of(2000,7,21);
        LocalDate bugun2=LocalDate.now();
        Period yasIrem=Period.between(IremDogum,bugun2);
        System.out.println(yasIrem);
    }
}
