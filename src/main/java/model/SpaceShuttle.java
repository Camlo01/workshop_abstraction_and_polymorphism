package model;

/**
 * SpaceShuttle entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class SpaceShuttle extends Spacecraft {

    private String payload;

//    Constructors

    /**
     * Empty constructor
     */
    public SpaceShuttle() {
        super();
        setPayload(null, null, null, null, null);
    }

    public SpaceShuttle(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
        setPayload(null, null, null, null, null);
    }

    public SpaceShuttle(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
        setPayload(null, null, null, null, null);
    }

//    Getters and Setters


    public void setPayload(String payloadLEO, String payloadISS, String payloadGTO, String payloadGEO, String payloadEarthReturned) {
        this.payload = " ----- Capacity of payload ----- \n" +
                "\n" +
                "Payload to low Earth orbit (LEO)\n" +
                "- " + payloadLEO + " \n" +
                "\n" +
                "Payload to International Space Station (ISS)\n" +
                "- " + payloadISS + " \n" +
                "\n" +
                "Payload to geostationary transfer orbit (GTO)\n" +
                "- " + payloadGTO + "\n" +
                "\n" +
                "Payload to geostationary orbit (GEO)\n" +
                "- " + payloadGEO + "\n" +
                "\n" +
                "Payload to Earth, returned\n" +
                "- " + payloadEarthReturned;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String getShipInfo() {
        return "--------------- Information ---------------\n" +
                "-- Space Shuttle \n" +
                "Name: " + name + "\n" +
                "Start Activity: " + startActivity + "\n" +
                (statusActive ? " - The ship is currently active -  " : "End Activity: " + endActivity) + "\n" +
                "Nationality: " + nationality + "\n" +
                "Description: " + description + "\n" +
                payload;
    }

    @Override
    public String getShipInfoInline() {
        return "Space Shuttle: " + super.getShipInfoInline();
    }
}
