package com;

import com.dataBase.DataBaseShip;
import com.ui.UiHome;

/**
 * Main class
 */
public class WorkshopApplication {
    public static void main(String[] args) {


        //Message
        initializedSuccessfully();

        //Initialized objects by defects
        DataBaseShip.saveElementsAutomatic();

        //Show Menu with full normalize
        UiHome.showMenu();


    }

    /**
     * Shows by console that the application started successfully
     */
    private static void initializedSuccessfully() {
        System.out.println("--------------------------");
        System.out.println(" INITIALIZED SUCCESSFULLY ");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
