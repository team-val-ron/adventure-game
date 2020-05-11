import java.util.Scanner;

public class Battle {

    Scanner input = new Scanner(System.in);
    private byte userHP = 1;
    private byte spiderHP = 5;
    private boolean key = false;


    public void setKey() {
        this.key = true;
    }

    public boolean getKey() {
        return this.key;
    }

    public void addPotion() {
        this.userHP++;
    }

    public byte getUserHP() {
        return this.userHP;
    }

    public byte getSpiderHP () {
        return this.spiderHP;
    }

    public void setUserHP () {
        byte damage = randomDamage();
        this.userHP -= damage;
        System.out.println("You sustained " + damage + " from the spider.");
    }

    public void setMonsterHP () {
        byte damage = randomDamage();
        this.spiderHP -= damage;
        System.out.println("You inflicted " + damage + " to the spider.");
    }

    public byte randomDamage() {
        byte damage = (byte) (Math.random() * 3);
        return damage;
    }



//    public void damageUserHP(byte randomNum) {
//         this.userHP -= randomNum;
//    }
//
//    public void damageMonsterHP(byte randomNum) {
//        this.spiderHP -= randomNum;
//    }


}
