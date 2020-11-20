package array;

//Write a Java program to test if an array contains a specific value.
public class Ex_2 {
    public static void main(String[] args) {
         int [] my_array1 = {1789, 2035, 1899, 1456, 2013,
                 1458, 2458, 1254, 1472, 2365,
                 1456, 2265, 1457, 2456};

        System.out.println(contains(my_array1,2013));
        System.out.println(contains(my_array1,2020));
    }

    public static boolean contains(int[] my_array1, int i) {
        for (int n : my_array1){
            if (i == n){
                return  true;
            }
        }
        return false;
    }
}
