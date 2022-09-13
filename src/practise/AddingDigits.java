package practise;

public class AddingDigits {

    public static void main(String[] args) {

        int a = 28;
        int b = 31;

        int s = 0, r = 0;
        for (int i = a; i <= b; i++) {
            int copy = i;
            while (copy > 0) {
                int rem = copy % 10;
                copy = copy / 10;
                s = s + rem;
            }
            r = s + r;
            s = 0;
        }
        System.out.println(r);
    }
}
