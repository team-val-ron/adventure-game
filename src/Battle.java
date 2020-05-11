import java.util.Scanner;

public class Battle {

    Scanner input = new Scanner(System.in);
    byte userHP = 5;
    byte spiderHP = 2;

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
        if(getSpiderHP() <= 0) {
            System.out.println(("/╲/\\╭(✖╭╮✖)╮/\\╱\\"));
            return;
        }
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
