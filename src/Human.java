public class Human implements Character {
    protected int health;
    private boolean isDead;
    private int ammo;
    private Alien enemy = new Alien();

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
        System.out.println("Alien wins. Human died."); }

    public void shootAlien() {
        if (!isDead) {
            this.ammo -= 15;
            enemy.health -= 15;
            System.out.println("Alien was shot!");
            if (enemy.health <= 0) {
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
