package AlienvsHuman;

public class Human implements Character {
    private int health = 100;
    private boolean isDead = false;
    private int ammo = 200;

    public Human() {}

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void isDead() {
        isDead = true;
        System.out.println("Alien wins. Human died."); }

    public void shootAlien(Alien enemy) {
        if (!isDead) {
            this.ammo -= 15;
            enemy.setHealth(enemy.getHealth() - 15);
            System.out.println("Alien was shot!");
            if (enemy.getHealth() <= 0) {
                enemy.isDead();
            }
        } else {
            System.out.println("Can't pick up the gun, you're dead. Chill bro.");
        }
    }

    public int getAmmo() {
        return ammo;
    }
}
