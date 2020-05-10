import java.util.Scanner;

public class StartGame {
    Scanner initiate = new Scanner(System.in);
    private String start;

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String startGame() {
        Room begin = new Room(); // call the Room class
        System.out.println("Start game? [y/n]");
        String user = initiate.nextLine();
        if(user.equalsIgnoreCase("y")) {
            // for now user can only enter a room number from 1 to 5
            begin.enterRoom((byte) 1, (byte) 5);
        }
        System.out.println("Awww that shucks!!"); // if user says nah don't wanna play
        return startGame(); // this will force them to play...lol
    }
}
