package _01_lists;

import java.util.List;

public class P01 {
    public static <T> T last(List<T> elements){
        int numberOfElement = elements.size();
        return elements.get(numberOfElement-1);
    }

}
