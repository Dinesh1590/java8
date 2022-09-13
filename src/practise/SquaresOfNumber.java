package practise;

public class SquaresOfNumber {

    public static void main(String[] args) {

        int n=5;
        System.out.println( squaresOfNumber(n));


    }
static int p;
    private static int squaresOfNumber(int n) {
        if(n==0)
        {
            return p;
        }
        p=p+(n*n);
        n--;
        return squaresOfNumber(n);

    }
}
