package array;


import java.util.Arrays;

// remove duplicate elements from an array.
public class Ex_9 {
    public static void main(String[] args) {
        unique_array(new int[] {0, 3, -2, 4, 3, 2});

        unique_array(new int[] {10, 22, 10, 20, 11, 22});
    }

    private static void unique_array(int[] my_array) {

        System.out.println("Original Array: ");

        for(int i = 0; i < my_array.length; i++){
            System.out.println(my_array[i]+"\t");
        }

        int no_unique_elements = my_array.length;

        for(int i = 0; i<no_unique_elements; i++){
            int my_array_i = my_array[i];
            for(int j = i+1; j<no_unique_elements; j++){
                if (my_array_i == my_array[j]){
                    my_array[j] = my_array[no_unique_elements-1];
                    no_unique_elements--;
                    j--;
                }
            }
        }

        //Copying only unique elements of my_array into array1
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
        System.out.println();
        System.out.println("Array with unique value = array1:");
        for(int i = 0; i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
        System.out.println();

        System.out.println("my_array:"+Arrays.toString(my_array));
        System.out.println("array1:"+Arrays.toString(array1));
        System.out.println("------------------------------------------------");

    }
}
