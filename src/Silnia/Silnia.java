package Silnia;

import java.util.Scanner;

/**
 * Created by sebastian on 2017-03-07.
 */
public class Silnia {

    //Programik pokazujący silnię danej liczby

    public static void main(String[] args) {

        System.out.println("Wprowadź liczbę. Podam jej silnię. ");
        Scanner scan= new Scanner(System.in);

        int number = 0;

        try{
            number=scan.nextInt();
        }
        catch (Exception exc) {System.out.println("Zły format wprowadzonej danej.");}

        System.out.println(obliczSilnie(number));

    }
    //zwraca silnię podanej w argumencie liczby
    private static int obliczSilnie(int n){
        int temp=1;
        for (int i = 1; i <= n; i++) {
            temp=temp*i;
        }
        return temp;
    }
}
