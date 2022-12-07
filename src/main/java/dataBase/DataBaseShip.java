package dataBase;

import model.*;

import java.util.ArrayList;

/**
 * Class that simulates the storage of a database together with methods to interact with it
 *
 * @author Camilo Beltrán
 */
public class DataBaseShip {

    static private ArrayList<Spacecraft> ships = new ArrayList<>();


    public static void saveShip(Spacecraft ship) {
        try {
            ships.add(ship);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void saveAll(ArrayList<Spacecraft> ships) {
        for (Spacecraft ship : ships) {
            saveShip(ship);
        }
    }

    public static void showShips() {
        try {

            ships.forEach((ship) -> {
                System.out.println(ship.getShipInfoInline());
            });

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    /**
     * Items automatically saved to not leave the database empty
     */
    public static void saveElementsAutomatic() {
        //Space Shuttle
        Spacecraft s1 = new SpaceShuttle("Saturno V", 1967, 1972, "EEUU", "Eu Ship");
        Spacecraft s2 = new SpaceShuttle("Protón", 2001, "Russia", "Russian Ship");
        Spacecraft s3 = new SpaceShuttle("H-IIA", 2001, "Japan", "Japanese Ship");


        //Unmanned ship
        Spacecraft s4 = new UnmannedShip("Explorer", 1958, 1970, "EEUU", "From NASA");
        Spacecraft s5 = new UnmannedShip("Luna I", 1959, "Russian", "From Russia");
        Spacecraft s6 = new UnmannedShip("Soho", 1995, "Europe", "Europe ESA/A SI");


        //Manned ship

        Spacecraft s7 = new MannedShip("Apolo", 1966, 1975, "EEUU", "Eu Ship");
        Spacecraft s8 = new MannedShip("Soyuz", 1967, "Russia", "Soviet union");
        Spacecraft s9 = new MannedShip("EEI", 1998, "International", "For everyone");

        ships.add(s1);
        ships.add(s2);
        ships.add(s3);
        ships.add(s4);
        ships.add(s5);
        ships.add(s6);
        ships.add(s7);
        ships.add(s8);
        ships.add(s9);

    }

}
