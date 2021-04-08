package Homework.inheritanceAndPolimorphism;

public class Main {
    public static void main(String[] args) {
        Student student1 = new ComputerSienceStudents(6);
        System.out.println( "CS student will pass?" + student1.pass(6));

        Student student2 = new NsStuents(4);
        System.out.println("NS student will pass?" + student2.pass(3));
    }
}
