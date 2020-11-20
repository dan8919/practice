package array;

import java.lang.reflect.Array;
import java.util.Arrays;

// insert an element (specific position) into an array.
public class Ex_4 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int index_position = 2;
        int newValue = 5;
        System.out.println("Original Array:"+ Arrays.toString(my_array));

        for(int i = my_array.length-1; i > index_position; i--){
            System.out.println(my_array[i]);
            //move to next index. the last one will be lost.
            //my_array[2] = 56 apper twice.
        }
        System.out.println(Arrays.toString(my_array));
        //56<->5
        my_array[index_position] = newValue;
        System.out.println(Arrays.toString(my_array));
    }

}
