package array;
// find the index of an array element.
public class Ex_3 {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int findIndex = findIndex(arr,30);
        System.out.println(findIndex);
    }

//    private static int findIndex(int[] arr, int i) {
//        int index = -1;
//        for (int n = 0;n< arr.length;n++){
//           if(arr[n] == i) {
//               index = n;
//           }
//        }
//        return index;
//    }

    public static int findIndex(int[] arr, int i) {
        int index = 0;
        int len = arr.length;

        while( index < len){
            if(arr[index]==i){
                return index;
            }else index = index+1;
        }
    return -1;
    }
}
