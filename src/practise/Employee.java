package practise;

import java.util.Objects;

public class Employee {
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    private int age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    Employee(String name, int id, int age, int salary) {

        this.age = age;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return name + " " + +age + " " + salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Double.compare(employee.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash( salary,age);
    }



}
