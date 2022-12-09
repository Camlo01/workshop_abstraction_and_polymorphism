package model;

/**
 * Functions of a ship
 */
public interface Ship {

    /**
     * Configure the year in which the ship finished the activity
     *
     * @param endingYear to set
     */
    void shipEndsActivity(Integer endingYear);

    /**
     * Ship releases the capsule
     */
    void detachCapsule();

    /**
     * Attach the capsule to the shipment
     */
    void attachCapsule();

    /**
     * Accelerate speed to one unit
     */
    void accelerateSpeed();

    /**
     * Amount to increase ship speed
     *
     * @param speed amount
     */
    void accelerateSpeed(int speed);

    /**
     * Complete and detailed information about the ship
     *
     * @return String with all details
     */
    String getShipInfo();

    /**
     * Most important information in a single line with the type of ship
     *
     * @return single line text
     */
    String getShipInfoInline();


}
