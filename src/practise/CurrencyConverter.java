package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {


    public static void main(String[] args) {

        Map<String,Double>  currency=new HashMap();
        currency.put("usd",80.0);
        currency.put("csd",30.0);
        currency.put("ksd",25.0);
        currency.put("psr",10.0);
        currency.put("all",5.0);
        currency.put("inr",1.0);


        System.out.println("-----currency-converter-----");

        Scanner sc =new Scanner(System.in);
        System.out.println("enter amount");
        int amt= sc.nextInt();
        System.out.println(" currency convert from ");
        String cur1 =sc.next();
        System.out.println(" currency convert to ");
        String cur2 =sc.next();

       /* for (Map.Entry<String,Integer> s:currency.entrySet())
        {
            if(s.getKey().equalsIgnoreCase(cur1))
            {
                System.out.println(amt+" "+s.getKey().toUpperCase() +" = "+s.getValue()*amt +" INR");
            }
        }*/
        double a=0,b=0;

        for (Map.Entry<String,Double> s:currency.entrySet())
        {

            if(s.getKey().equalsIgnoreCase(cur1))
            {
             a=s.getValue();

            }
            if(s.getKey().equalsIgnoreCase(cur2))
            {
                b=s.getValue();
            }



        }

        System.out.println((a/b)*amt);
    }
}
