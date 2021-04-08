package Homework.inheritance;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(500.250, 5, "21454");
        employee1.setName("Andreea");
        System.out.println(employee1);

        Employee employee2 = new Employee(23.007, 2, "71854");
        employee2.setName("Elena");
        System.out.println();
        System.out.println(employee2);
    }
}
