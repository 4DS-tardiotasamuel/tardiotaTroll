public class Troll {
    private int health;
    private int atkDamage;

    public Troll(int hp, int atk) throws Exception{
        if(hp<0 || atk<0){
            throw new Exception("attributi non validi");
        }
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
