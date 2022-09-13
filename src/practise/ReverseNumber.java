package practise;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNum(123453));
    }
    static int reverseNum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        return sum;
    }
}
