public class Troll {
    private int health;
    private int atkDamage;

    public Troll(int hp, int atk){
        this.health = hp;
        this. atkDamage = atk;
    }

    public int getHealth() {
        return health;
    }

    public int getAtkDamage() {
        return atkDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
