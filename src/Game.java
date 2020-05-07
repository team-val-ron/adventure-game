import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        startGame(input);
    }

    public static void startGame(Scanner input) {
        System.out.println("Hide n Seek");
        System.out.println("Start game? [y/n]");
        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Game Started");
            pickRoom(input);
        }
    }
    public static byte health = 5; // this makes variable public to other methods.

    public static void pickRoom(Scanner input, byte choice) {
        byte potion = 3;
        boolean key = false;
//        byte health = 5;
        health(input, health);
    }

    public static void health(Scanner input, byte health) {
        byte choice = 0;
        byte room1 = 1;
        byte room2 = 2;
        byte room3 = 3;
        while (health != 0) {
            System.out.println("Pick a room: ");
            byte pickRoom = input.nextByte();
            if (pickRoom == room1) {
                System.out.println("You are in room 1");
                pickRoom(input, choice);
            } else if (pickRoom == room2) {
                System.out.println("You are in room 2");
                System.out.println("This is the kitchen. Do you want to make a potion?");
                System.out.println("1: Make potion");
                System.out.println("2: Leave");
                choice = input.nextByte();
                if (choice == 1) {
                    System.out.println("Making Potion!");
                    health++;
                    System.out.println("Your health is: " + health);
                    pickRoom(input, choice);
                } else {
                    System.out.println("You are leaving");
                    System.out.println("You are back in the main lobby.");
                    pickRoom(input, choice);
                }
                pickRoom(input, choice);
            } else if (pickRoom == room3) {
                System.out.println("You are in room 3");
                System.out.println("There is a big spider in the room. What do you want to do?");
                System.out.println("1: Fight");
                System.out.println("2: Run");
                choice = input.nextByte();
                if (choice == 1) {
                    System.out.println("Fight!");
                } else {
                    System.out.println("You are running!");
                    System.out.println("You are back in the main lobby.");
                    pickRoom(input, choice);
                }
                pickRoom(input, choice);
            } else {
                if (key == true) {
                    System.out.println("Open door.");
                    System.out.println("You found yo friend!");
                } else {
                    System.out.println("Door is closed.");
                }
            }
        }
        System.out.println("You Died!");
    }
}
