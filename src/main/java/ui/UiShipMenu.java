package ui;

import dataBase.DataBaseShip;
import model.*;

import java.util.Scanner;

/**
 * Class with spaceships menu page functions
 *
 * @author Camilo Beltrán
 */
public class UiShipMenu {

    /**
     * Menu with different functions to interact with the ship database
     */
    public static void shipMenu() {
        int response = 0;
        shipMenuBody();

        do {
            Scanner inputOption = new Scanner(System.in);
            response = Integer.parseInt(inputOption.next());

            switch (response) {
                case 1:
                    UiHome.clearView();
                    createShip();
                    response = 0;
                    break;
                case 2:
                    UiHome.clearView();
                    viewShips();
                    System.out.println("4. To see the menu again");
                    System.out.print("Option: ");
                    break;
                case 3:
                    UiHome.clearView();
                    UiHome.showMenu();
                    response = 0;
                    break;
                case 4:
                    UiHome.clearView();
                    shipMenuBody();
                    break;
                default:
                    UiHome.clearView();
                    System.out.println("4. To see the menu again");
                    System.out.println("Try to enter a correct option [?]");
                    System.out.print("Option: ");
            }

        } while (response != 0);

    }

    private static void shipMenuBody() {
        System.out.println();
        System.out.println("------------------ 1. Ship --------------------");
        System.out.println("- What do you want to do");
        System.out.println("---");
        System.out.println("1. Create a spacecraft");
        System.out.println("2. See ships");
        System.out.println("3. Back to home");
        System.out.println();
        System.out.print("Option: ");

    }

    /**
     * Method with a form for the creation of a ship and depending on its type which spaceship it is
     */
    public static void createShip() {

        Scanner input = new Scanner(System.in);

        UiHome.clearView();

        System.out.println();
        System.out.println("--------------- Creating Ship -----------------");
        System.out.println("Complete the fields");
        System.out.println();

        //Variables of object to create
        int kindOfShip = whatKindOfShip(input);
        String name = whatNameIsTheShip(input);
        int startActivity = whenStartActivityWas(input);
        Integer endActivity = whenEndActivity(input);
        String nationality = whatNationalityItIs(input);
        String description = whatDescription(input);


        if (endActivity == null) {
            switch (kindOfShip) {
                case 1:
                    DataBaseShip.saveShip(new Capsule(name, startActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;
                case 2:
                    DataBaseShip.saveShip(new MannedShip(name, startActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;
                case 3:
                    DataBaseShip.saveShip(new SpaceShuttle(name, startActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;
                case 4:
                    DataBaseShip.saveShip(new UnmannedShip(name, startActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;
            }
        } else {
            switch (kindOfShip) {
                case 1:
                    DataBaseShip.saveShip(new Capsule(name, startActivity, endActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;
                case 2:
                    DataBaseShip.saveShip(new MannedShip(name, startActivity, endActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;
                case 3:
                    DataBaseShip.saveShip(new SpaceShuttle(name, startActivity, endActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;
                case 4:
                    DataBaseShip.saveShip(new UnmannedShip(name, startActivity, endActivity, nationality, description));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    System.out.println("--------------- VEHICLE SAVED -----------------");
                    break;

            }

        }
        //Finishing showing the menu again
        shipMenu();

    }

    /**
     * Method that queries the simulated database and displays all the ships it finds
     */
    public static void viewShips() {

        System.out.println("------------------ 2. Ships --------------------");
        System.out.println("- List");
        System.out.println();
        DataBaseShip.showShips();
        System.out.println();
    }


//    Methods for create the ship included in the createShip()

    /**
     * Method that converts Scanner object to String.
     * The main objective of this method is to stack functionality in a more verbal way.
     *
     * @param input Scanner object
     * @return String name of the ship
     */
    private static String whatNameIsTheShip(Scanner input) {
        System.out.println("Write the name of the vehicle");
        System.out.print("Name: ");
        return input.nextLine();
    }

    /**
     * Method that converts Scanner object to int.
     * The main objective of this method is to stack functionality in a more verbal way.
     *
     * @param input Scanner object
     * @return int of 4 digits
     */
    private static int whenStartActivityWas(Scanner input) {
        System.out.println("Write the year of start vehicle");
        System.out.print("Year: ");
        return Integer.parseInt(input.nextLine());
    }

    /**
     * Method that converts Scanner object to Integer.
     * <p>
     * It is validated if the ship is currently active, if so, a null value is returned.
     * and if it is not active, the year in which it ended is returned
     * <p>
     * The main objective of this method is to stack functionality in a more verbal way.
     *
     * @param input Scanner object
     * @return (2022) or (null) if it is not active
     */
    private static Integer whenEndActivity(Scanner input) {
        int answer = 0;
        do {
            System.out.println("Is this vehicle currently active?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Option:");
            answer = Integer.parseInt(input.nextLine());
            if (answer != 1 && answer != 2) {
                System.out.println();
                System.out.println();
                System.out.println(" - WRITE A VALID OPTION -");
            }
        } while (answer != 1 && answer != 2);

        if (answer == 2) {
            System.out.println("What is the year of end activity");
            System.out.print("Year: ");
            return Integer.parseInt(input.nextLine());
        }
        return null;
    }

    /**
     * Method that converts Scanner object to String.
     * The main objective of this method is to stack functionality in a more verbal way.
     *
     * @param input Scanner object
     * @return String of the nationality
     */
    private static String whatNationalityItIs(Scanner input) {
        System.out.println("Write the nationality");
        System.out.print("Nationality: ");
        return input.nextLine();
    }

    /**
     * Method that converts Scanner object to String.
     * The main objective of this method is to stack functionality in a more verbal way.
     *
     * @param input Scanner object
     * @return String of the description
     */
    private static String whatDescription(Scanner input) {
        System.out.println("Add some description");
        System.out.print("Description:");
        return input.nextLine();
    }

    /**
     * Method that converts Scanner object to int.
     * The main objective of this method is to stack functionality in a more verbal way.
     *
     * @param input Scanner object
     * @return int value that indicate the kind of ship
     */
    private static int whatKindOfShip(Scanner input) {
        System.out.println("Select the type of vehicle to create");
        System.out.println("1. Capsule ");
        System.out.println("2. Manned Spaceship ");
        System.out.println("3. Space shuttle");
        System.out.println("4. Unmanned SpaceShip");
        System.out.print("Option: ");
        return Integer.parseInt(input.nextLine());

    }

}
