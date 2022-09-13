package practise;

import java.util.Arrays;

public class RemovingZerosFromArray {

    public static void main(String[] args) {

        int[] arr = new int[]{100, 200, 210, 4004};


        for (int i = 0; i < arr.length; i++) {

           arr[i]=remove(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        for (int element: arr) {
            System.out.println(element);
        }

    }
    static int remove(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem != 0) {
                sum = sum * 10 + rem;
            }
            num/=10;
        }
        return sum;
    }
}
