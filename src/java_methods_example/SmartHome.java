package java_methods_example;

import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {
        accessSmartHome();
    }

    // method that turns the music on and off
    public static void controlMusic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off?");
        String tumbler = scanner.next();
        if (tumbler.equals("on")) {
            System.out.println("The music is on");
        } else if (tumbler.equals("off")) {
            System.out.println("The music is off");
        } else {
            System.out.println("Invalid operation");
        }
    }

    // method that verifies the password and gives access to Smart home actions if the password is correct
    public static void accessSmartHome() {
        Scanner scanner = new Scanner(System.in);
        final int password = 20230124;
        System.out.println("Enter password: ");
        int passwordInput = scanner.nextInt();
        if (passwordInput == password) {
            chooseAction();
        } else {
            System.out.println("Incorrect password!");
        }
    }
    // method with the main menu for choosing the action
    public static void chooseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the object: 1 – musique, 2 – lamp, 3 – door, 4 – kettle");

        String action = scanner.next();
        switch (action) {
            case "1":
                // asking the user about speakers
                controlMusic();
                break;
            case "2":
                // asking the user about lights...
                controlLight();
                break;
            case "3":
                // asking the user about the door...
                controlDoor();
                break;
                // adding case 4
            case "4":
                controlKettle();
                break;
            default:
                System.out.println("Invalide action!");
                break;
        }
    }

        // method that controls electric kettle
        public static void controlKettle() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("on/off?");
            String button = scanner.next();
            if (button.equals("on")) {
                System.out.println("The kettle is on");
            } else if (button.equals("off")) {
                System.out.println("The kettle is off");
            } else {
                System.out.println("Invalid operation");
            }
        }

    public static void controlLight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("on/off?");
        String light = scanner.next();
        if (light.equals("on")) {
            System.out.println("The light is on");
        } else if (light.equals("off")) {
            System.out.println("The light is off");
        } else {
            System.out.println("Invalid operation");
        }
    }

    public static void controlDoor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("open/close?");
        String door = scanner.next();
        if (door.equals("open")) {
            System.out.println("The door is open");
        } else if (door.equals("close")) {
            System.out.println("The door is closed");
        } else {
            System.out.println("Invalid operation");
        }
    }

}
