package model;

import java.util.ArrayList;

/**
 * MannedShip entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class MannedShip extends Spacecraft {

    private ArrayList<String> crew = new ArrayList<>();

//    Constructors

    /**
     * Empty constructor
     */
    public MannedShip() {
        super();
    }

    public MannedShip(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
    }

    public MannedShip(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
    }

//    Getters and Setters

    public ArrayList<String> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<String> memberName) {
        this.crew = memberName;
    }

    @Override
    public String getShipInfo() {
        return "--------------- Information ---------------\n" +
                "-- Manned Spacecraft \n" +
                "Name: " + name + "\n" +
                "Start Activity: " + startActivity + "\n" +
                (statusActive ? " - The ship is currently active -  " : "End Activity: " + endActivity) + "\n" +
                "Nationality: " + nationality + "\n" +
                "Description: " + description + "\n";
    }

    @Override
    public String getShipInfoInline() {
        return "Manned Ship: " + super.getShipInfoInline();
    }
}
