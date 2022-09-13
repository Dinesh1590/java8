package practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractise {

    public static void main(String[] args) {

        Map<Employee, String> map = new LinkedHashMap<>();
        String companyName = "codexbox";
        Employee employee = null;
        for (int i = 0; i < 10; i++) {
            employee = new Employee("dinesh", i + 1, 23, 20000 + i);
            //System.out.println(employee);
            map.put(employee, companyName);
        }
        for (Map.Entry<Employee, String> map1 : map.entrySet()
        ) {
            System.out.println(map1.getKey().toString()+ " =  " + map1.getValue());

        }

    }

}
