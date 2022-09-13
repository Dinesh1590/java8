package practise;

public class DigitsCount {

    public static void main(String[] args) {
        System.out.println(count(123));
    }

    static  int count(int num){
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
       return count;
    }
}
