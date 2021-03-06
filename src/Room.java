import java.util.Scanner;

public class Room {
    Scanner input = new Scanner(System.in);

    private byte pickRoom;

    public byte getPickRoom() {
        return this.pickRoom;
    }

    public void setPickRoom(byte pickRoom) {
        this.pickRoom = pickRoom;
    }

    public byte enterRoom(byte min, byte max) {
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
                System.out.println("You are in the kitchen.");
                System.out.println("-----------------------");
                System.out.println();
            } else if(user == 3) {
                System.out.println("You are in the bathroom");
                System.out.println("-----------------------");
                System.out.println();
            } else if(user == 4) {
                System.out.println("You are in the garage");
                System.out.println("---------------------");
                System.out.println();
            } else if(user == 5) {
                Win result = new Win();
                result.resultWin(user);
            } else {
                Lose result = new Lose();
                result.resultLost(user);
            }
            return enterRoom(min, max);
        }
    }
}
