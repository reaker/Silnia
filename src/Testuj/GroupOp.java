package Testuj;
import java.util.*;

public class GroupOp {

    List<String> list1 = new ArrayList<String>();
    Set<String> set1 = new HashSet<String>();

    void add(String ...strings ) {
        for (String s : strings) {
            list1.add(s);
            set1.add(s);
        }
    }

    public GroupOp() {
        add("Pies", "Kot", "Tygrys", "Zebra", 'Z' + "ebra");
        System.out.println(list1);
        list1.removeAll(set1);
        System.out.println("Usunięte będą wszystkie elementy, bo działa equals:\n"+ list1);
        list1.addAll(set1);
        System.out.println(list1);
        //List<Integer> list2 = new ArrayList<Integer>(list1);  // błąd w kompilacji
        // Zastosowanie Arrays.asList();
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        System.out.println(list2);
        // ale teraz list2 jest fixed-size
        try {
            list2.add(35);
        } catch(Exception exc) {
            System.out.println("Wystąpił wyjątek: " + exc);
            System.out.println("bo lista niemodyfikowalna:\n" + list2);
        }
        System.out.println("Możemy zrobić, aby była modyfikowalna:");
        list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println("Teraz możemy dodać coś");
        list2.addAll(Arrays.asList(35, 1, 2, 3));
        System.out.println(list2);
        System.out.println("Gdy chcemy usunąć duplikaty:");
        Set<Integer> set2 = new HashSet<Integer>(list2);
        System.out.println(set2);
        System.out.println("A czy możemy połączyć kolekcje z różnymi typami elementów?\nTak.");
        // Nalezy uzyć typu Object
        List<Object> list3 = new ArrayList<Object>(list1);
        list3.addAll(set2);
        System.out.println(list3);
        // Tyle, że przy iteracjach już musimy posługiwać się typem Object
        // i ew. robić konwersje zawężające
        int sum = 0;
        String txt = "";
        for(Object o : list3) {
            if (o instanceof Integer) sum += (Integer) o;
            else txt += (String) o;
        }
        System.out.println("Suma liczb: " + sum);
        System.out.println("Napis: " + txt);
        // A na koniec sprawdzimy jak z listy zrobić tablicę
        // Najlepiej tak, bo będzie uwzględniony typ elementów
        System.out.println("Tablica z listy");
        String[] tab = (String[]) list1.toArray(new String[0]);
        for (String string : tab) {
            System.out.println(string + " " + string.length());
        }

    }

    public static void main(String[] args) {
        new GroupOp();
    }
}