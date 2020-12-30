package _01_lists;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class CollectionUtils {
    public static <T>LinkedList<T> linkedList(T...elements){
        return Stream.of(elements).collect(toCollection(LinkedList::new));
    }

    public static <T>ArrayDeque<T> arrayList(T...elements){
        return Stream.of(elements).collect(toCollection(ArrayDeque::new));
    }
}
