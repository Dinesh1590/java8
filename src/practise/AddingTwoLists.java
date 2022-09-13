package practise;

import java.util.ArrayList;
import java.util.List;

public class AddingTwoLists {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(20);
        l1.add(40);

        List<Integer> l2 = new ArrayList<>();
        l2.add(20);
        l2.add(2);
        l2.add(27);
        l2.add(20);
        l2.add(4);
        l2.add(6);
        l2.add(6);
        l2.add(6);
        // List<Integer> l3=new ArrayList<>();

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
        return l3;
    }
}