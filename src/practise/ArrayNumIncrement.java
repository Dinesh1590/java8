package practise;

public class ArrayNumIncrement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7};
        int k = 3;
        int num = 0, sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = arr[0] + arr[i] + sum;
            num = sum * k + num;
            arr[0] = 0;
        }
        System.out.println(num);
    }
}
