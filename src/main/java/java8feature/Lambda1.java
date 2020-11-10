package java8feature;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Lambda1 {

    //    (int x,int y)->{return x+y;}
//    List<Integer> intSeq = Arrays.asList(1,2,3);


    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1,2,3);
        Collection<Integer> collection = new LinkedList<>();
        collection.add(1);
        collection.add(5);
        collection.add(2);
        collection.add(3);
        collection.add(6);
        System.out.println(collection);
        System.out.println(collection.getClass().getName());

        //collection.forEach(variable ->{  }
        //variable used in lambda expression should be final or effectively find
        intSeq.forEach(x ->{
            collection.forEach(y->{
                System.out.print(y);
            });
            x += 2;
            System.out.println(x);

            System.out.println(x.compareTo(3));
        });

    }
}
