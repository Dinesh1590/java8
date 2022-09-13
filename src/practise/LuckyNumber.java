package practise;

public class LuckyNumber {

    public static void main(String[] args) {

        System.out.println(luckyNum(4532));
    }
    static int luckyNum(int num) {

        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        if (sum > 9) {
            sum = luckyNum(sum);
        }
        return sum;
    }
}
