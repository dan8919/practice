package array;

import java.util.Arrays;

// find the second largest element in an array.
public class Ex_10 {
    public static void main(String[] args) {
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        System.out.println("Original numeric array:"+ Arrays.toString(my_array));

        Arrays.sort(my_array);
        System.out.println("After sorting:"+ Arrays.toString(my_array));

        int leng = my_array.length;
        System.out.println(my_array[leng-2]);

    }
}
