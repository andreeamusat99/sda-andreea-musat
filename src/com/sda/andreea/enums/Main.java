package com.sda.andreea.enums;

public class Main {
    public static void main(String[] args) {
        enumsExample();
    }


        public static void  enumsExample() {
            System.out.println(LengthUnit.FOOT.convertToMeters());
for(LengthUnit lengthUnit : LengthUnit.values()){
    System.out.println(lengthUnit);
        }
    }
}
