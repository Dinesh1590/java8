package practise;

import java.util.*;

public class ListChecking {
    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3};

        Map<Integer,String> map=new TreeMap<>();
        map.put(4,"kjhk");
        map.put(8,"jhg");
        map.put(7,"jj");
        map.put(77,null);

        System.out.println(map);

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);


        List<Integer> list1=new ArrayList<>(list);

        System.out.println(list1.get(1));

        List<String>  str=new LinkedList<>();





    }
}
