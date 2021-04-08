package com.sda.andreea.inharitance.exercise2;

public class Main {
    public static void main(String[] args) {
        Animals[] animalsArray = new Animals[4];
        animalsArray[0] = new Cat();
        animalsArray[1] = new Cat();
        animalsArray[2] = new Dog();
        animalsArray[3] = new Dog();

        for (int i = 0; i < animalsArray.length; i++){
            System.out.println("Animal at index " + i + " yield voice is " + animalsArray[i].yieldVoice());
        }


    }
}
