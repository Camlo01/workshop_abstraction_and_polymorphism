package model;

/**
 * Functions of a ship
 */
public interface Ship {

    void shipEndsActivity(Integer endingYear);

    void takeOffShip();

    void accelerateSpeed();

    void accelerateSpeed(int speed);

    String getShipInfo();

    String getShipInfoInline();


}
