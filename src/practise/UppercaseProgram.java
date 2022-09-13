package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UppercaseProgram {
    Function<String, String> name = e -> e.toUpperCase();

    public static void main(String[] args) {
        System.out.println(new UppercaseProgram().name.apply("dinesh"));

        String str = "renuka";
        List<Employee> list = new ArrayList<>();
        System.out.println(str.toUpperCase());

        Employee employee = new Employee("ram", 1, 21, 30000);
        Employee employee1 = new Employee("bhargav", 2, 18, 30000);
        Employee employee2 = new Employee("kalyan", 3, 17, 30000);
        Employee employee3 = new Employee("chandan", 4, 22, 30000);
        Employee employee4 = new Employee("vidya", 5, 26, 300000);

        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        list.forEach(x -> {
            if (x.getAge() > 18) {
                System.out.println(x.getName()+" eligible for voting ");
            } else {
                System.out.println(x.getName()+" you are not eligible for voting");
            }
        });
    }
}
