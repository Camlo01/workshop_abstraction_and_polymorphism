package com.dataBase;

import com.model.*;

import java.util.ArrayList;

/**
 * Class that simulates the storage of a database together with methods to interact with it
 *
 * @author Camilo Beltrán
 */
public class DataBaseShip {

    static private ArrayList<Spacecraft> ships = new ArrayList<>();


    /**
     * Save ship to ArrayList simulating a database
     *
     * @param ship
     */
    public static void saveShip(Spacecraft ship) {
        try {
            ships.add(ship);
        } catch (Exception exception) {
            System.out.println("Error: " + exception);
        }
    }

    /**
     * Save all the elements of an ArrayList of type spacecraft
     *
     * @param ships ArrayList
     */
    public static void saveAll(ArrayList<Spacecraft> ships) {
        for (Spacecraft ship : ships) {
            saveShip(ship);
        }
    }

    /**
     * Loop through the array to return the elements with their position in lists
     */
    public static void showShips() {
        int limit = ships.size();
        for (int i = 0; i < limit; i++) {
            Integer listItem = i + 1;
            System.out.println(listItem + ". " + (ships.get(i)).getShipInfoInline());
        }
    }

    /**
     * Delete the ship located on the index entered position
     *
     * @param shipToDelete position of array
     * @return boolean if the operation wa successfully
     */
    public static boolean deleteShip(int shipToDelete) {
        if (shipToDelete <= ships.size()) {
            ships.remove(shipToDelete - 1);
            return true;
        }
        return false;
    }


    /**
     * Returns a ship located at the index of the entered position
     *
     * @param index position of array
     * @return the ship
     */
    public static Spacecraft getShipByIndex(int index) {
        return ships.get(index - 1);
    }


    /**
     * Items automatically saved to not leave the database empty
     */
    public static void saveElementsAutomatic() {
        //Space Shuttle
        Spacecraft s1 = new SpaceShuttle("Saturno V", 1967, 1972, "American", "Eu Ship");
        Spacecraft s2 = new SpaceShuttle("Protón", 2001, "Russia", "Russian Ship");
        Spacecraft s3 = new SpaceShuttle("H-IIA", 2001, "Japan", "Japanese Ship");


        //Unmanned ship
        Spacecraft s4 = new UnmannedShip("Explorer", 1958, 1970, "American", "From NASA");
        Spacecraft s5 = new UnmannedShip("Luna I", 1959, "Russian", "From Russia");
        Spacecraft s6 = new UnmannedShip("Soho", 1995, "Europe", "Europe ESA/A SI");


        //Manned ship

        Spacecraft s7 = new MannedShip("Apollo", 1966, 1975, "American", "Eu Ship");
        Spacecraft s8 = new MannedShip("Soyuz", 1967, "Russia", "Soviet union");
        Spacecraft s9 = new MannedShip("EEI", 1998, "International", "For everyone");

        //Capsule

        Spacecraft s10 = new Capsule("Vostok", 1961, 1963, "Soviet Union", "first crewed space capsule");
        Spacecraft s11 = new Capsule("Vostok", 1964, 1965, "Soviet Union", " had a backup solid fuel retrorocket ");
        Spacecraft s12 = new Capsule("Apollo", 1975, 1975, "American", "first crewed space capsule");


        ships.add(s1);
        ships.add(s2);
        ships.add(s3);
        ships.add(s4);
        ships.add(s5);
        ships.add(s6);
        ships.add(s7);
        ships.add(s8);
        ships.add(s9);
        ships.add(s10);
        ships.add(s11);
        ships.add(s12);

    }

}
