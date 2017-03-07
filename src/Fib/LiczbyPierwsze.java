package Fib;

import java.util.*;

public class LiczbyPierwsze {

    public static void main(String[] args) {
        System.out.println("Wprowadź ile pierwszych liczb podać: ");
        Scanner scan = new Scanner(System.in);
        int count=0;
        try{
            count=scan.nextInt();
        }
        catch (InputMismatchException exc){
            System.out.println("Wprowadź liczbę całkowitą!");
        }

        for (int i = 1; i <= count; i++) {
            if (isPierwsza(i)==false)System.out.println(i);
            else System.out.println(i + " Pierwsza!");
        }
    }

    public static boolean isPierwsza(int n){
        switch (n) {
            case 1:
            case 2:
            case 3:
            return true;
            default:
                if (n%2==0) return false;

                int counter=0;
                for (int i = 1; i <= n; i++) {
                    if (n%i==0) counter++;
                }
                if (counter>2) return false;
                return true;

        }




    }
}
