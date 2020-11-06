package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

    public class Vector01 {
        public static void main(String[] args) {
            Vector<Integer> v = new Vector<Integer>();
            v.add(1);
            v.add(2);
            v.add(3);
            v.add(4);


            System.out.println(v);


            //Use iterator
            Iterator<Integer> it = v.iterator();

            //if hasNext->loof
            while (it.hasNext()){
               int n = it.next();
                System.out.println(n);
            }

        }

        public void m1(){
            LinkedList<String> l = new LinkedList<String>();
            l.add("first");
            l.add("second");
            l.add("third");

            System.out.println(l.getFirst());
            System.out.println(l.getLast());
        }

    }


