package com.sda.andreea.enums.exerciseplanets;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Indroduceti numele planetei: ");
        Scanner scanner = new Scanner(System.in);
        String planetName = scanner.nextLine().toUpperCase(Locale.ROOT);
        Planets planet;
        try {
            planet = Planets.valueOf(planetName);
            System.out.println(planet);
            System.out.println("Distanta de la Pamant la planeta este : " + planet.distanceFromEarth());

        } catch ( IllegalArgumentException e) {
            Planets.values();
            for (int i = 0; i < Planets.values().length; i++){
                System.out.println(Planets.values()[i].name());
            }
        }

    }
}
