package com.model;

/**
 * Functions of a radio transmitter
 */
public interface Radio {

    /**
     * radio send message
     *
     * @param message to send
     */
    void sendMessage(String message);

    /**
     * radio send alert message
     *
     * @param message to send
     */
    void alert(String message);

    /**
     * radio send sos message
     *
     * @param message to send
     */
    void sosMessage(String message);


}
