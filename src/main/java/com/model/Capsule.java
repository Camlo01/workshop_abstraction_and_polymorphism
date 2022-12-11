package com.model;

/**
 * Capsule entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class Capsule extends Spacecraft {

    private boolean isLoadedParachute;
    private boolean isAttached;

//    Constructors

    /**
     * Empty constructor
     */
    public Capsule() {
        super();
        this.isLoadedParachute = false;
        this.isAttached = false;
    }

    public Capsule(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
        this.isLoadedParachute = false;
        this.isLoadedParachute = false;
        this.isAttached = false;
    }

    public Capsule(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
        this.isLoadedParachute = false;
        this.isAttached = false;
    }

//    Getters and Setters

    public void loadParachute() {
        this.isLoadedParachute = true;
    }

    public void unloadParachute() {
        this.isLoadedParachute = false;
    }

    public void openParachute() {
        this.isLoadedParachute = false;
    }

    @Override
    public void detachCapsule() {
        this.isAttached = false;
    }

    @Override
    public void attachCapsule() {
        this.isAttached = true;
    }


    @Override
    public String getShipInfo() {
        return "--------------- Information ---------------\n" +
                "-- Capsule \n" +
                "Name: " + name + "\n" +
                "Start Activity: " + startActivity + "\n" +
                (statusActive ? " - The ship is currently active -  " : "End Activity: " + endActivity) + "\n" +
                "Nationality: " + nationality + "\n" +
                "Description: " + description + "\n" +
                "Parachute: " + ((isLoadedParachute) ? "Loaded" : "no parachute [!]") + "\n" +
                "Attached to ship: " + ((isAttached) ? " Yes" : "No") + "\n";
    }

    @Override
    public String getShipInfoInline() {
        return "Capsule: " + super.getShipInfoInline();
    }
}
