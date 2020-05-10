public class Win {
    private byte Win;

    public byte getWin() {
        return this.Win;
    }

    public void setWin(byte win) {
        this.Win = win;
    }

    public byte resultWin(byte result) {
        // this will be used to ask user if they would like to play again.
        StartGame playAgain = new StartGame();

        // should return win if user is == to 5.
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
