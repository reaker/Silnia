package BinarySerach;

import java.util.*;


public class BinarySearch {

    public static int[] arr = new int[]{3,5,6,4,8,9,7,10,15,55};

    public static void main(String[] args) {

        // dzielimy obszar na poł od 0 do length-1. sprawdzamy czy to ta liczba?
        // jesli nie to sprawdzamy czy ta ktora mamy jest < czy > od podanej liczby
        System.out.println("Tablica w tej chwili wygląda tak: ");
        Arrays.sort(arr);
        for (int i:arr) {System.out.print(i+ " ");}

        System.out.println("\nPodaj dowolną liczbę z tej tablicy, a podam jej indeks dzięki wyszukiwaniu binarnemu.");

        Scanner scan = new Scanner(System.in);
        int numberToFind = scan.nextInt();

        int left, right, center;
        left=0;
        right=arr.length-1;

        while(left<=right){

            center=(left+right)/2;
            //warunek dla opcji ze znaleźliśmy liczbę
            if(arr[center]==numberToFind) {System.out.println("JUPI. Liczba: " + numberToFind + " została znaleziona na indeksie: " + center);return;}

            //warunek ze nie znalezlismy i liczba aktualna z tablicy jest mniejsza od liczby ktorej szukamy
            else if (arr[center]<numberToFind){
                left=center+1;
            }
            else {right=center-1;}
        }
        if (left>right) System.out.println("Ups. Nie ma takiej liczby.");
    }
}