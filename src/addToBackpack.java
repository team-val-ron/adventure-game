public class addToBackpack {
    private String item;
    private boolean foundItem = false;

    public addToBackpack(String item, boolean found) {
        this.item = item;
        this.foundItem = found;
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
