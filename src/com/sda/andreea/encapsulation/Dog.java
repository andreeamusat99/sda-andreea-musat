package com.sda.andreea.encapsulation;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;

    public Dog(String name, int age, String gender, String race){
        this.name = name;
        this.age = age;
        this.gender = gender;
        if(gender.equals("f") || gender.equals("m")){
            this.gender = gender;
        } else {
            //System.out.println("Invalid gender");
            throw new IllegalStateException("Invalid gender");  //daca se arunca exceptie obiectul nu va fi creat
        }
        this.race = race;

    }
    public Dog(String gender, String race){
        //this e referinta interna; e un fel e new Dog
        //intre parenteze vrem sa apelecam constrcutorul de deasupra
        this("Azorica",12, gender, race );
    }
    public String getRace(){
        return race;
    }
    public int getAge(){
        return age;
    }
    public void setRace(String race){
        this.race = race;
    }
    public void setAge(int age){
        this.age = age;
    }
}
