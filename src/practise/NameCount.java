package practise;

import java.util.*;

public class NameCount {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        String input = "Veeru is just Veeru and veeru knows Java and sql ";
        input = input.toLowerCase();
        String[] str = input.split(" ");

        for (String word : str) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
            }
        });


        for (Map.Entry<String, Integer> li : list) {

            System.out.println(li.getKey() + " " + li.getValue());
        }
    }

}
