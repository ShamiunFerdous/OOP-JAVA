package com.Enum;

enum Planet2 {

    MURCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);

    int value;

    // we can declare constructor in enum.
    Planet2(int value) {
        this.value = value;
    }
}

public class EnumExample2 {
    public static void main(String[] args) {
        Planet2 planet = Planet2.MURCURY;
        LIVE(planet);
    }

    public static void LIVE(Planet2 planet) {
        switch (planet){
            case EARTH:
                System.out.println("You can live here :)");
                System.out.println("Planet number is " + planet.value);
                break;
            default:
                System.out.println("You can't live here :(");
                System.out.println("Planet number is " + planet.value);
                break;
        }
    }
}
