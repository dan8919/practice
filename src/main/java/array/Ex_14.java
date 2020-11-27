package array;
//find all pairs of elements in an array whose sum is equal to a specified number.
public class Ex_14 {
    public static void main(String[] args) {
        pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);

        pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);

    }

    private static void pairs_value(int[] inputArray, int inputNumber) {
        System.out.println("Paris of elements and their sum:");

        int len = inputArray.length;

        for(int i = 0; i < len-1 ;i++ ){
            for (int j = i+1; j<len; j++){
                if(inputNumber == inputArray[i] +inputArray[j]){
                    System.out.println(inputArray[i]+","+inputArray[j]);
                };

            }
        }
    }

}
