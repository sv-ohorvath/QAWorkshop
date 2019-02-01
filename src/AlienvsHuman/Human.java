package AlienvsHuman;

public class Human implements Character {
    private int health;
    private boolean isDead;
    private int ammo;

    public Human() {
        this.health = 100;
        this.ammo = 200;
        this.isDead = false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void isDead() {
        isDead = true;
        System.out.println("AlienvsHuman.Alien wins. AlienvsHuman.Human died."); }

    public void shootAlien(Alien enemy) {
        if (!isDead) {
            this.ammo -= 15;
            enemy.setHealth(enemy.getHealth() - 15);
            System.out.println("AlienvsHuman.Alien was shot!");
            if (enemy.getHealth() <= 0) {
                enemy.isDead();
            }
        } else {
            System.out.println("Can't pick up the gun. You're dead, chill bro.");
        }
    }

    public int getAmmo() {
        return ammo;
    }
}
