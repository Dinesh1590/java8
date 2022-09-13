package practise;

import java.util.Arrays;

public class MissingNumbers {
    static  int[] arr = new int[]{1,3,5,7,10};

    public static void main(String[] args) {

        for (int i = 0; i < arr.length - 1; i++) {

            if ((arr[i] + 1) != arr[i + 1]) {
                System.out.println(arr[i] + 1);
                if((arr[i] + 2) != arr[i + 1]) {
                    find(i);
                }
            }
        }
    }
    static int  n=2;
    static void find(int i) {

        if ((arr[i] + n) != arr[i + 1]) {
            System.out.print(arr[i]+n+" ");
            n++;
            if (arr[i] + n != arr[i + 1]) {
                find(i++);
            }
        }
    }
}
