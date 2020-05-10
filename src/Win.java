public class Win {
    private byte Win;

    public byte getWin() {
        return Win;
    }

    public void setWin(byte winOrLose) {
        Win = winOrLose;
    }

    public byte resultWin(byte result) {
        Room roomResult = new Room();
        StartGame playAgain = new StartGame();

        if(result == 5) {
            System.out.println("You found your friend!");
            System.out.println("----------------------");
            System.out.println("\n" +
                    "____    ____  ______    __    __     ____    __    ____  __  .__   __.  __  \n" +
                    "\\   \\  /   / /  __  \\  |  |  |  |    \\   \\  /  \\  /   / |  | |  \\ |  | |  | \n" +
                    " \\   \\/   / |  |  |  | |  |  |  |     \\   \\/    \\/   /  |  | |   \\|  | |  | \n" +
                    "  \\_    _/  |  |  |  | |  |  |  |      \\            /   |  | |  . `  | |  | \n" +
                    "    |  |    |  `--'  | |  `--'  |       \\    /\\    /    |  | |  |\\   | |__| \n" +
                    "    |__|     \\______/   \\______/         \\__/  \\__/     |__| |__| \\__| (__) \n" +
                    "                                                                            \n");
            System.out.println("Would you like to play again?");
            playAgain.startGame();
        }
        return resultWin(result);
    }
}
