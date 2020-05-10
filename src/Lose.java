public class Lose {
    private byte lost;

    public byte getLost() {
        return this.lost;
    }

    public void setLost(byte lost) {
        this.lost = lost;
    }

    public byte resultLost(byte result) {
        StartGame playAgain = new StartGame();
        if (result == 0) {
            System.out.println("You lose!");
            System.out.println("\n" +
                    " __        ______        _______. _______ .______      \n" +
                    "|  |      /  __  \\      /       ||   ____||   _  \\     \n" +
                    "|  |     |  |  |  |    |   (----`|  |__   |  |_)  |    \n" +
                    "|  |     |  |  |  |     \\   \\    |   __|  |      /     \n" +
                    "|  `----.|  `--'  | .----)   |   |  |____ |  |\\  \\----.\n" +
                    "|_______| \\______/  |_______/    |_______|| _| `._____|\n" +
                    "                                                       \n");
            playAgain.startGame();
        }
        return resultLost(result);
    }
}
