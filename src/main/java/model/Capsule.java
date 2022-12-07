package model;

/**
 * Capsule entity that extends the Spacecraft abstract class and implements its interfaces
 *
 * @author Camilo Beltrán
 */
public class Capsule extends Spacecraft {

//    Constructors

    public Capsule() {
        super();
    }

    public Capsule(String name, int startActivity, Integer endActivity, String nationality, String description) {
        super(name, startActivity, endActivity, nationality, description);
    }

    public Capsule(String name, int startActivity, String nationality, String description) {
        super(name, startActivity, nationality, description);
    }
}
