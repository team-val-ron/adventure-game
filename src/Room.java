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
            if (user >= min && user <= max) {
                System.out.println("You are now in room: " + user);
            } else {
                System.out.println("Hmmm try another room...");
            }
            return enterRoom(min, max);
        }
    }
}
