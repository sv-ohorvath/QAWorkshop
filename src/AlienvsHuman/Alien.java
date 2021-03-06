package AlienvsHuman;

public class Alien implements Character {
    private int health = 200;
    private boolean isDead = false;
    private int energy = 100;

    public Alien() {}

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void isDead() {
        this.isDead = true;
        System.out.println("Human wins. Alien died.");
    }

    public void biteHuman(Human enemy) {
        if(!isDead) {
            if (this.energy >= 80 && this.energy <= 100) {
                enemy.setHealth(enemy.getHealth() - 20);
                this.energy -= 10;
            } else if (this.energy >= 60 && this.energy < 80) {
                enemy.setHealth(enemy.getHealth() - 10);
                this.energy -= 10;
            } else if (this.energy > 0 && this.energy < 60) {
                enemy.setHealth(enemy.getHealth() - 5);
                this.energy -= 10;
            }
            System.out.println("Human was bit!");
            if (enemy.getHealth() <= 0) {
                enemy.isDead();
            }
        } else {
            System.out.println("You're dead, Alien! Next time!");
        }
    }

    public int getEnergy() {
        return energy;
    }
}
