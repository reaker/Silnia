package Recursion;

/**
 * Created by sebastian on 2017-03-07.
 */
public class Recursion {

    //Prosty programik z rekursją.
    public static void main(String[] args) {

    recurence(10);
    }

    public static void recurence(int licznik){
            if (licznik == 0) return;
            else {
                System.out.println("Licznik: " + licznik);
                recurence(--licznik);
                return;
            }
        }
}
