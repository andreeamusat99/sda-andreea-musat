package Homework.inheritance;

public class Employee extends Person {
    private double salary;
    private int years;
    private String insuraceNumber;

    public Employee(double salary, int years, String insuraceNumber) {
        super("default");
        this.salary = years;
        this.years = years;
        this.insuraceNumber = insuraceNumber;

    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getInsuraceNumber() {
        return insuraceNumber;
    }

    public void setInsuraceNumber(String insuraceNumber) {
        this.insuraceNumber = insuraceNumber;
    }
    @Override
    public String toString(){
        return "name : " + getName() + " \nyears: " + years + "\nsalary: " + salary + "\ninsurance number:" + insuraceNumber;


    }
}

