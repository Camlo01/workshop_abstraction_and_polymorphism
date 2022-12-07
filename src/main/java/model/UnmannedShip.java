package model;

/**
 * UnmannedShip entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class UnmannedShip extends Spacecraft {

//    Constructors

    public UnmannedShip() {
        super();
    }

    public UnmannedShip(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
    }

    public UnmannedShip(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
    }
}
