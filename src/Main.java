//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        Alien alien = new Alien();

        System.out.println("Score: \nHuman health: " + human.getHealth() + " vs. Alien health: " + alien.getHealth() + "\n");
        alien.biteHuman();
        System.out.println("Score: \nHuman health: " + human.getHealth() + " vs. Alien health: " + alien.getHealth() + "\n");
        human.shootAlien();
        human.shootAlien();
        System.out.println("Score: \nHuman ammo: " + human.getAmmo() + " vs. Alien energy: " + alien.getEnergy());
        System.out.println("Score: \nHuman health: " + human.getHealth() + " vs. Alien health: " + alien.getHealth() + "\n");
        alien.biteHuman();
        System.out.println("Score: \nHuman health: " + human.getHealth() + " vs. Alien health: " + alien.getHealth() + "\n");
        human.setHealth(0);
        alien.biteHuman();
        human.shootAlien();


    }
}

