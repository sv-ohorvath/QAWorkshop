public class Alien implements Character {
    protected int health;
    private boolean isDead;
    private int energy;
    private Human enemy = new Human();

    public Alien() {
        super();
        this.health = 200;
        this.energy = 100;
        this.isDead = false;
    }

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

    public void biteHuman() {
        if(!isDead) {
            if (this.energy >= 80 && this.energy <= 100) {
                enemy.health -= 20;
                this.energy -= 10;
            } else if (this.energy >= 60 && this.energy < 80) {
                enemy.health -= 10;
                this.energy -= 10;
            } else if (this.energy > 0 && this.energy < 60) {
                enemy.health -= 5;
                this.energy -= 10;
            }
            System.out.println("Human was bit!");
            if (enemy.health <= 0) {
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
