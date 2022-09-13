package practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UsePractise {
    public static void main(String[] args) {

        Employee employee6=new Employee("dinesh",101,23,1000001);
        Employee employee1=new Employee("ramesh",102,23,1000003);
        Employee employee2=new Employee("suresh",103,23,1000004);
        Employee employee3=new Employee("divya",104,23,100000);
        Employee employee4=new Employee("vidya",105,23,1000006);
        Employee employee5=new Employee("vidya",105,23,1000002);

        Map<Employee,Integer>  map=new HashMap<>();

        map.put(employee6,1);
        map.put(employee2,1);
        map.put(employee1,1);
        map.put(employee3,1);
        map.put(employee4,1);
        map.put(employee5,1);


        System.out.println(map);


        Set<String> set=new HashSet<>();
set.add(new String("abc"));
set.add(new String("abc1"));

        System.out.println(set.size());





    }
}
