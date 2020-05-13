import java.sql.SQLOutput;
import java.util.Scanner;

public class addToBackpack {
    Scanner input = new Scanner(System.in);
    private String item;
    private boolean foundItem = false;

    public addToBackpack(String item, boolean found) {
        this.item = item;
        this.foundItem = found;
        System.out.println("Select weapon: ");
        input.nextLine();
        if(this.item.equalsIgnoreCase("Throw some Hands")) {
            System.out.println("You chose: Throw some Hands.");
        }
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isFoundItem() {
        return this.foundItem;
    }

    public void setFoundItem(boolean found) {
        this.foundItem = found;
    }
}
