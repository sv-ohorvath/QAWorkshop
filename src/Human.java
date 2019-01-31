public class Human implements Character {
    protected static int health;
    private static int ammo;
    private static boolean isDead;

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

    public static boolean isDead() {
        isDead = true;
        System.out.println("Alien wins. Human died.");
        return true;
    }

    public void shootAlien() {
        if (!isDead) {
            this.ammo -= 15;
            Alien.health -= 15;
            System.out.println("Alien was shot!");
            if (Alien.health <= 0) {
                Alien.isDead();
            }
        } else {
            System.out.println("Can't pick up the gun. You're dead, chill bro.");
        }
    }

    public int getAmmo() {
        return ammo;
    }
}
