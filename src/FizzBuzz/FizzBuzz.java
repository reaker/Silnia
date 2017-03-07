package FizzBuzz;

/**
 *"Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 */

//Zadanie znalezione w internecie jako trudne... Nie wiem, rozwiązałem w 1-2 minuty, a ponoć 99% ludzi odpada w testach na tym zadaniu.
public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i%3==0){
                if (i%5==0){System.out.println(i+" FizzBuzz");continue;}
                else {System.out.println(i+" Fizz");continue;}
            }
            if (i%5==0){
                System.out.println(i+" Buzz");continue;
            }
        }
    }
}
