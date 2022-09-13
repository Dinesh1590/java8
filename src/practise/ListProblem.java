package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListProblem {

    public static void main(String[] args) {
        int count = 0;
        List<Integer> list = new ArrayList<>();

        int[] arr = {1, 2, 2, 3, 4, 5};

        String[] str={"a","b","c"};

        list.add(1);
        list.add(0);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(0);
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,str);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
    }
}
