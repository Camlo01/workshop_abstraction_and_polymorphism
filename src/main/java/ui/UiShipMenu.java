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
        System.out.println();
        System.out.println("------------------ 1. Ship --------------------");
        System.out.println("- What do you want to do");
        System.out.println("---");
        System.out.println("1. Create a spacecraft");
        System.out.println("2. See ships");
        System.out.println("3. Back to home");
        System.out.print("Option: ");

        do {
            Scanner inputOption = new Scanner(System.in);
            response = Integer.parseInt(inputOption.next());

            switch (response) {
                case 1:
                    createShip();
                    response = 0;
                    break;
                case 2:
                    viewShips();
                    System.out.print("Option: ");
                    break;
                case 3:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    UiHome.showMenu();
                    response = 0;
                    break;
            }

        } while (response != 0);

    }

    /**
     * Method with a form for the creation of a ship and depending on its type which spaceship it is
     */
    public static void createShip() {

        Scanner input = new Scanner(System.in);

        String name;
        int startActivity;
        Integer endActivity = null;
        String nationality;
        String description;

        int kindOfShip = 0;
        Integer status = 0;

        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println();
        System.out.println("--------------- Creating Ship -----------------");
        System.out.println("Answer the questions first");
        System.out.println();

//        Type of vehicle
        System.out.println("Select the type of vehicle to create");
        System.out.println("1. Capsule ");
        System.out.println("2. Manned Spaceship ");
        System.out.println("3. Space shuttle");
        System.out.println("4. Unmanned SpaceShip");
        System.out.print("Option: ");
        kindOfShip = Integer.parseInt(input.nextLine());

//        Name of vehicle
        System.out.println("Write the name of the vehicle");
        System.out.print("Name: ");
        name = input.nextLine();

//        Year of vehicle started
        System.out.println("Write the year of start vehicle");
        System.out.print("Year: ");
        startActivity = Integer.parseInt(input.nextLine());


//        Indicate status of vehicle
        do {
            System.out.println("Is this vehicle currently active?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Option:");

            status = Integer.parseInt(input.nextLine());
            System.out.println(status);
            if (status != 1 && status != 2) {
                System.out.println(" - WRITE A VALID OPTION -");
            }
        } while (status != 1 && status != 2);

        if (status == 2) {
            System.out.println("What is the year of end activity");
            System.out.print("Year: ");
            endActivity = Integer.parseInt(input.nextLine());
        }

//        Nationality
        System.out.println("Write the nationality");
        System.out.print("Nationality: ");
        nationality = input.nextLine();

//        Description
        System.out.println("Add some description");
        System.out.print("Description:");
        description = input.nextLine();

//          status = 1 is equal to active
        if (status == 1) {
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
        }

        //          status = 1 is equal to active
        if (status == 2) {
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

}
