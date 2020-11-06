package collection;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("first");
        l.add("second");
        l.add("third");

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}
