import java.util.Scanner;

public class Room {
    Scanner input = new Scanner(System.in);
    Battle fight = new Battle();

    private byte pickRoom;
    private byte potion = 3;

    public byte getPickRoom() {
        return this.pickRoom;
    }

    public void setPickRoom(byte pickRoom) {
        this.pickRoom = pickRoom;
    }

    public byte enterRoom(byte min, byte max) {
        if(fight.getSpiderHP() <= 0) {
            System.out.println(("/╲/\\╭(✖╭╮✖)╮/\\╱\\"));
            System.out.println("You received a key from the spider");
            fight.setKey();
        }
        System.out.print("UserHP " + fight.getUserHP());
        System.out.println(" Monster HP " + fight.getSpiderHP());
        System.out.println("Select a room from " + min + " to " + max);
        byte user = input.nextByte();

        while(true) {
            // feel free to change the context
            // this was just a template to make sure everything was working.
            // and according to my calculations everything is looking good.
            if (user >= min && user <= max) {
                System.out.println();
            } else {
                System.out.println("Hmmm try another room...");
                System.out.println();
            }
            if(user == 1) {
                System.out.println("You are in the living room.");
                System.out.println("---------------------------");
                System.out.println();
            } else if(user == 2) {
                if(potion > 0) {
                    System.out.println("███████████████████████████████████████████████");
                    System.out.println("██           You are in the kitchen          ██");
                    System.out.println("██         You found a potion! +1 HP         ██");
                    System.out.println("███████████████████████████████████████████████");
                    fight.addPotion();
                    potion--;
                } else {
                    System.out.println("███████████████████████████████████████████████");
                    System.out.println("██           You are in the kitchen          ██");
                    System.out.println("██ No more potions! But here's a sandwich!   ██");
                    System.out.println("███████████████████████████████████████████████");
                }
                System.out.println();
                enterRoom(min, max);
            } else if(user == 3) {
                if(fight.getSpiderHP() <= 0) {
                    System.out.println(("/╲/\\╭(✖╭╮✖)╮/\\╱\\"));
                    enterRoom(min, max);
                } else {
                    System.out.println("███████████████████████████████████████████████");
                    System.out.println("██           You are in the bathroom         ██");
                    System.out.println("██         A big scary spider appears!!      ██");
                    System.out.println("███████████████████████████████████████████████");
                    System.out.println();
                    System.out.println(("/╲/\\╭[☉﹏☉]╮/\\╱\\"));
                    System.out.println();
                    System.out.println("███████████████████████████████████████████████");
                    System.out.println("██           What do you want to do:         ██");
                    System.out.println("██   1. Attack                               ██");
                    System.out.println("██   2. Leave (Back to Main room)            ██");
                    System.out.println("███████████████████████████████████████████████");
                    byte choice = input.nextByte();
                    if(choice == 1) {
                        fight.setMonsterHP();
                        fight.setUserHP();
                        enterRoom(min, max);
                    } else {
                        enterRoom(min, max);
                    }

                }
            } else if(user == 4) {
                System.out.println("You are in the garage");
                System.out.println("---------------------");
                System.out.println();
            } else if(user == 5) {
                if(fight.getKey()) {
                    Win result = new Win();
                    result.resultWin(user);
                }
                System.out.println("███████████████████████████████████████████████");
                System.out.println("██     Hmm the door seems to be locked.      ██");
                System.out.println("██     Maybe there is a key somewhere.       ██");
                System.out.println("███████████████████████████████████████████████");
                enterRoom(min, max);
            } else {
                Lose result = new Lose();
                result.resultLost(user);
            }
            return enterRoom(min, max);
        }
    }
}
