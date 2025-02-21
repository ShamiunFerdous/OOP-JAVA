package com.Enum;

/*
An enum is a special "class" that represents a group of constants
(unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface),
and separate the constants with a comma. Note that they should be in uppercase letters

enum is short for "enumerations", which means "specifically listed".
 */
enum Planet{
    MURCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE
}

public class EnumExample {
    public static void main(String[] args) {
        Planet myPlanet = Planet.EARTH;
        live(myPlanet);
    }

    public static void live(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here :)");
                break;
            default:
                System.out.println("You can't live here :(");
                break;
        }
    }
}
