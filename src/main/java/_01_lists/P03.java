package _01_lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class P03 {
    public static <T> T kth(final List<T> list,final int k){return  list.get(k);}

    public static <T> T kthRecursive(final LinkedList<T> list,final int k){
        if (k == 0){
            return list.getFirst();
        }
        return kthRecursive(new LinkedList<>(list.subList(1,list.size())),k - 1);
    }

    public static <T> T kthStream(final List<T> list, final int k){
      return list.stream().limit(k + 1).collect(Collectors.toCollection((LinkedList::new))).getLast();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().limit(3).collect(Collectors.toCollection((LinkedList::new))).get(0));
        System.out.println(numbers.stream().limit(3).collect(Collectors.toCollection((LinkedList::new))).stream().toArray());
        System.out.println(numbers.stream().limit(3).collect(Collectors.toCollection((LinkedList::new))).toArray());
        System.out.println(numbers.stream().limit(3));

        System.out.println(numbers.subList(1,numbers.size()));
    }
}
