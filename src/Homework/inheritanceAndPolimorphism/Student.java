package Homework.inheritanceAndPolimorphism;

public class Student {
    private  int ticks;

    public Student(int ticks){
        this.ticks = ticks;
    }
    public boolean pass(int numberOfCredits){
        if(numberOfCredits == ticks){
        return true;
    } else {
        return false;
    }
}
}

