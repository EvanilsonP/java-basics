package Array;

import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        
        // int[] numbers = new int[5];

        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // numbers[3] = 4;
        // numbers[4] = 5;

        int[] numbers = { 10, 7, 55, 98, 58 };
        
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
