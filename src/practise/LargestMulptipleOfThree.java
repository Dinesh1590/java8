package practise;

public class LargestMulptipleOfThree {

    public static void main(String[] args) {

        int[] arr = {-6, -91, 10112, -100, -84, -22, 1, 473};

        System.out.println(greater(arr));
    }
    private static int greater(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max && arr[i]%3==0) {
                max = arr[i];
            }
        }
        return max;
    }
}
