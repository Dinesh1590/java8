package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adding2Lists {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(8);
        l1.add(9);
        l1.add(8);
        l1.add(9);

        List<Integer> l2 = new ArrayList<>();
        l2.add(8);
        l2.add(2);
        l2.add(3);

        System.out.println(addingList(l1, l2));
    }

    static List<Integer> addingList(List<Integer> l1, List<Integer> l2) {
        List<Integer> l3 = new ArrayList<>();

        int dif = l1.size() - l2.size();
        int dif1 = l2.size() - l1.size();

        if (l1.size() == l2.size()) {
            for (int i = 0; i < l2.size(); i++) {
                l3.add(l1.get(i) + l2.get(i));
            }
        } else if (l1.size() > l2.size()) {

            for (int i = 0; i < l2.size(); i++) {
                l3.add(l1.get(i) + l2.get(i));
            }
            for (int i = 0; i < dif; i++) {
                l3.add(l1.get(l2.size() + i));
            }

        } else {
            for (int i = 0; i < l1.size(); i++) {
                l3.add(l1.get(i) + l2.get(i));
            }
            for (int i = 0; i < dif1; i++) {
                l3.add(l2.get(l1.size() + i));
            }
        }

        int sum=0;
        for(int i=0;i<l3.size();i++)
        {
            int num=sum+l3.get(i);
            sum=0;
            if(num>9){
                while (num>0)
                {
                    int rem=num%10;
                    l3.set(i,rem);
                    sum=num/10;
                    break;
                }}else{
                l3.set(i,num);
            }
        }
        if(sum>0)
        {
            l3.add(sum);
        }
        Collections.sort(l3);
        return l3;

    }
}
