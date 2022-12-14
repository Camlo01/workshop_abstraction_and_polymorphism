package com.ui;

import java.util.Scanner;

/**
 * Class where the main start menu logic is handled
 *
 * @author Camilo Beltrán
 */
public class UiHome {

    /**
     * Method that displays the main menu on the console
     */
    public static void showMenu() {
        int response = 0;
        // Show all prompts to select what you want to do
        menuBody();
        do {
            Scanner inputOption = new Scanner(System.in);
            response = Integer.parseInt(inputOption.nextLine());

            switch (response) {
                case 1:
//                    1. Ship menu - [here you will find more options]
                    clearView();
                    UiShipMenu.shipMenu();
                    response = 0;
                    break;
                case 2:
//                    2. See quickly all the ships - [Consult database]
                    UiShipMenu.viewShips();
                    System.out.println("5. To see the menu again");
                    System.out.print("Option: ");
                    break;
                case 3:
//                    3. Application information - version
                    clearView();
                    System.out.println("5. To see the menu again");
                    System.out.println("Version: 2.0");
                    System.out.println("Creator: Camilo Beltrán");
                    System.out.println("Support: support@camilo.com");
                    break;
                case 4:
//                    4. Close application - [X]
                    clearView();
                    System.out.println("Program closed, come back soon [zzz]");
                    response = 0;
                    break;
                case 5:
//                    5. To see the menu again
                    clearView();
                    menuBody();
                    break;
                default:
//                    something wrong
                    clearView();
                    System.out.println("5. To see the menu again");
                    System.out.println("Try to enter a correct option [?]");
                    System.out.print("Option: ");
            }
        } while (response != 0);
    }

    /**
     * Text to display inside showMenu() stacked to improve its reading
     */
    private static void menuBody() {
        System.out.println("-------------------- Home --------------------");
        System.out.println("Welcome to the aeronautics space agency app!");
        System.out.println("--- SELECT BY TYPING THE OPTION");
        System.out.println();
        System.out.println("1. Ship menu - [here you will find more options] ");
        System.out.println("2. See quickly all the ships - [Consult database]");
        System.out.println("3. Application information - version");
        System.out.println("4. Close application - [X]");
        System.out.println();
        System.out.print("Option: ");

    }

    /**
     * Method with several line breaks to clean the console
     */
    protected static void clearView() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
