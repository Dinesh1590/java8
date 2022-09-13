package practise;

import java.util.ArrayList;
import java.util.List;

public class LuckyPrimeNumbersPQ {

    public static void main(String[] args) {
       int n=10;
        System.out.println(lucky(primes(n),n));
    }
    private static int lucky(List<Integer> primes,int n) {

        int count=0;
        for(int i=0;i< primes.size();i++)
        {
            for (int j = i+1; j < primes.size(); j++) {

                if(primes.get(i)*primes.get(j)<=n)
                {
                    count++;
                }
            }
        }
       return count;
    }
    private static List<Integer> primes(int n) {

        List<Integer> list=new ArrayList<>();

        for(int i=1;i<n;i++)
        {
            int counter=0;
            for(int j=1; j<n; j++)
            {
                if(i%j==0)
                {
                     counter++;
                }
            }
            if (counter==2)
            {
                 list.add(i);
            }
        }
        return list;
    }
}
