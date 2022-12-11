package com.model;

import java.util.ArrayList;

/**
 * UnmannedShip entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class UnmannedShip extends Spacecraft {

    private ArrayList<String> supplies = new ArrayList<>();

//    Constructors

    /**
     * Empty constructor
     */
    public UnmannedShip() {
        super();
    }

    public UnmannedShip(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
    }

    public UnmannedShip(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
    }

//    Getters and Setters

    public ArrayList<String> getSupplies() {
        return supplies;
    }

    public void setSupplies(ArrayList<String> supplies) {
        this.supplies = supplies;
    }

    @Override
    public String getShipInfo() {
        return "--------------- Information ---------------\n" +
                "-- Unmanned Spacecraft \n" +
                "Name: " + name + "\n" +
                "Start Activity: " + startActivity + "\n" +
                (statusActive ? " - The ship is currently active -  " : "End Activity: " + endActivity) + "\n" +
                "Nationality: " + nationality + "\n" +
                "Description: " + description + "\n";
    }

    @Override
    public String getShipInfoInline() {
        return "Unmanned Ship: " + super.getShipInfoInline();
    }
}
