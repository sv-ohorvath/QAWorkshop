public class Alien implements Character {
    protected static int health;
    private int energy;
    private static boolean isDead;

    public Alien() {
        this.health = 200;
        this.energy = 100;
        this.isDead = false;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public static boolean isDead() {
        isDead = true;
        System.out.println("Human wins. Alien died.");
        return true;
    }

    /*public void biteHuman() {
        if(!isDead) {
            if (this.energy >= 80 && this.energy <= 100) {
                Human.health -= 20;
                this.energy -= 10;
            } else if (this.energy >= 60 && this.energy < 80) {
                Human.health -= 10;
                this.energy -= 10;
            } else if (this.energy > 0 && this.energy < 60) {
                Human.health -= 5;
                this.energy -= 10;
            }
            System.out.println("Human was bit!");
            if (Human.health <= 0) {
                Human.isDead();
            }
        } else {
            System.out.println("You're dead, Alien! Next time!");
        }
    }*/

    public void biteHuman() {
        switch (!isDead) {
            case (this.energy >= 80 && this.energy <= 100):
                Human.health -= 20;
                this.energy -= 10;
                System.out.println("Human was bit!");
                break;
            case (this.energy >= 60 && this.energy < 80):
                Human.health -= 10;
                this.energy -= 10;
                System.out.println("Human was bit!");
                break;
            case (this.energy > 0 && this.energy < 60):
                Human.health -= 5;
                this.energy -= 10;
                System.out.println("Human was bit!");
                break;
            case Human.health <= 0:
                Human.isDead();
                break;
        }
        System.out.println("You're dead, Alien! Next time!");
    }

    public int getEnergy() {
        return energy;
    }
}
