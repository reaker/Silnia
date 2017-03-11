package Testuj;

import java.util.*;

public class Hash {

    final int NB = 7;

    LinkedList[] hashTab = new LinkedList[NB];

    public  Hash(){
        for (int i = 0; i <NB ; i++) {
            hashTab[i]=new LinkedList();}
            String[] napisy = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "a" };
            for (int i = 0; i < napisy.length; i++) {insert(napisy[i]);}
        for (int i = 0; i < NB; i++) {
                String report = i + " - ";
                Iterator it = hashTab[i].iterator();
                while (it.hasNext())report+= " - " + it.next();
            System.out.println(report);
            }
        System.out.println("czy zawieta a " + contains("a"));
        System.out.println("czy zawiera k "+ contains("k"));
    }

    public void insert(String s) {
        int hashCode = s.hashCode();
        int index = hashCode % NB;
        boolean isThere = isThere(index, s);
        if (!isThere) hashTab[index].add(s);
        System.out.println(s + " kod: " + hashCode +
                " indeks: " + index +
                (isThere ? " już tam jest" : " został dodany") );
    }

    public boolean contains(String s){
        return isThere(s.hashCode()%NB,s);
    }

    private  boolean isThere(int index, String s){
        for (Iterator i= hashTab[index].iterator(); i.hasNext();)
            if (s.equals(i.next())) return true;
            return false;
    }

    public static void main(String[] args) {
        new Hash();
    }
}

