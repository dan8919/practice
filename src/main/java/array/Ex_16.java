package array;

import java.util.Arrays;

//move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
public class Ex_16 {
    public static void main(String[] args) {
        int[] array_nums = {0,0,1,0,3,0,5,0,6};
        System.out.println("Original array:"+ Arrays.toString(array_nums));

        int i = 0 ;
//        int len = array_nums.length;
//        for(int j = 0,)
        for(int j = 0, l = array_nums.length; j < l;) {
            if(array_nums[j] == 0)
                j++;
            else {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i ++;
                j ++;
            }
        }
        while (i < array_nums.length)
            array_nums[i++] = 0;
        System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : array_nums)
            System.out.print(n+"  ");
        System.out.print("\n");
    }
}
