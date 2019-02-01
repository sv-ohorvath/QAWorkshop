import AlienvsHuman.Alien;
import AlienvsHuman.Human;

//import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        Alien alien = new Alien();

        System.out.println("Score: \nAlienvsHuman.Human health: " + human.getHealth() + " vs. AlienvsHuman.Alien health: " + alien.getHealth() + "\n");
        alien.biteHuman(human);
        System.out.println("Score: \nAlienvsHuman.Human health: " + human.getHealth() + " vs. AlienvsHuman.Alien health: " + alien.getHealth() + "\n");
        human.shootAlien(alien);
        human.shootAlien(alien);
        System.out.println("Score: \nAlienvsHuman.Human ammo: " + human.getAmmo() + " vs. AlienvsHuman.Alien energy: " + alien.getEnergy());
        System.out.println("Score: \nAlienvsHuman.Human health: " + human.getHealth() + " vs. AlienvsHuman.Alien health: " + alien.getHealth() + "\n");
        alien.biteHuman(human);
        System.out.println("Score: \nAlienvsHuman.Human health: " + human.getHealth() + " vs. AlienvsHuman.Alien health: " + alien.getHealth() + "\n");
        human.setHealth(0);
        alien.biteHuman(human);
        human.shootAlien(alien);


    }
}

