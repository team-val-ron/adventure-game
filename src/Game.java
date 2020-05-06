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

    public static void pickRoom(Scanner input) {
        byte room1 = 1;
        byte room2 = 2;
        byte room3 = 3;
        byte health = 0;

        while (health != 0) {
            System.out.println("Pick a room: ");
            byte pickRoom = input.nextByte();
            if (pickRoom == room1) {
                System.out.println("You are in room 1");
                pickRoom(input);
            } else if (pickRoom == room2) {
                System.out.println("You are in room 2");
                pickRoom(input);
            } else if (pickRoom == room3) {
                System.out.println("You are in room 3");
                pickRoom(input);
            } else {
                System.out.println("You found yo friend!");
            }
        }
        System.out.println("You Died!");
    }
}
