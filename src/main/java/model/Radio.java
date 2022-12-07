package model;

/**
 * Functions of a radio transmitter
 */
public interface Radio {

    void sendMessage(String message);

    void alert();

    void sosMessage();


}
