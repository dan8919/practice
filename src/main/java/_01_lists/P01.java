package _01_lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class P01 {
    public static <T> T last(List<T> elements){
        int numberOfElement = elements.size();
        return elements.get(numberOfElement-1);
    }

    public static <T> T last(LinkedList<T> elements){
        return elements.getLast();
    }

    public static <T> T lastRecursive(List<T> elements){
        if (elements == null|| elements.isEmpty()){
            throw new NoSuchElementException();
        }
        if (elements.size() == 1){
            return elements.get(0);
        }

        return lastRecursive(elements.subList(1,elements.size()));
    }

//    public static void main(String[] args) {
//        List list = Arrays.asList("a","b","c","d");
//        System.out.println(list);
//        System.out.println(list.subList(1,2));
//    }

}
