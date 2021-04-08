package com.sda.andreea.enums.exerciseplanets;

public enum Planets {
    JUPITER(135, "Jupiter"),
    PLUTO(35, "Pluto"),
    EARTH (169,"Earth");


    private double dimension;
    private String name;
    private double distanceFromEarth;

     Planets(double dimension, String name){  //nu ma lasa sa pun modif acc ->pt ca constrcutorul nu se instantiaza, pot instantia enum ul meu doar aici
        this.dimension = dimension;
        this.name = name;
    }
    public String toString(){
        return name + " " + dimension;
    }
    public double distanceFromEarth(){
return distanceFromEarth;
    }


}
