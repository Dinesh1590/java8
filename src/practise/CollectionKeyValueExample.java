package practise;

import java.util.*;

public class CollectionKeyValueExample {

    public static void main(String[] args) {

        Employee employee1 = new Employee("dinesh", 101, 20, 10000);
        Employee employee2 = new Employee("ram", -103, 24, 10040);
        Employee employee3 = new Employee("vidya", 1, 25, 10800);
        Employee employee4 = new Employee("divya", 100, 26, 100088);
        Employee employee5 = new Employee("vikas", -10, 27, 10008);

        Map<Integer, Employee> map = new HashMap<>();
        map.put(employee1.getId(), employee1);
        map.put(employee2.getId(), employee2);
        map.put(employee5.getId(), employee5);
        map.put(employee3.getId(), employee3);
        map.put(employee4.getId(), employee4);

        List<Map.Entry<Integer, Employee>> list = new ArrayList(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                if(o1.getKey()>o2.getKey())
                {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });

        for (Map.Entry<Integer, Employee> li : list) {

                System.out.println(li.getKey() + " " + li.getValue().toString());
            }

    }
}

