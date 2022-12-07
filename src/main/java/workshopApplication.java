import dataBase.DataBaseShip;
import model.*;
import ui.UiHome;


public class workshopApplication {
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
