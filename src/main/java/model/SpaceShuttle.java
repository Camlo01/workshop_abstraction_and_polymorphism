package model;

/**
 * SpaceShuttle entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class SpaceShuttle extends Spacecraft {

//    Constructors

    public SpaceShuttle() {
        super();
    }

    public SpaceShuttle(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
    }

    public SpaceShuttle(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
    }
}
