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
        Room begin = new Room();
        System.out.println("Start game? [y/n]");
        String user = initiate.nextLine();
        if(user.equalsIgnoreCase("y")) {
            begin.enterRoom((byte) 1, (byte) 5);
        }
        System.out.println("Awww that shucks!!");
        return startGame();
    }
}
