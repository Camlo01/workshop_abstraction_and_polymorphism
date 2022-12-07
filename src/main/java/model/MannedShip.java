package model;

/**
 * MannedShip entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class MannedShip extends Spacecraft {

//    Constructors

    public MannedShip() {
        super();
    }

    public MannedShip(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
    }

    public MannedShip(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
    }
}
