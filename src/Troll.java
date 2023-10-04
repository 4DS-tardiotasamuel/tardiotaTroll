public class Troll {
    private int health;
    private int atkDamage;
    private int defence;

    public Troll(int hp, int atk, int def) throws Exception{
        if(hp<0 || atk<0 || def<0){
            throw new Exception("attributi non validi");
        }
        this.health = hp;
        this. atkDamage = atk;
        this.defence = def;
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

    @Override
    public String toString() {
        return "Troll{" +
                "health=" + health +
                ", atkDamage=" + atkDamage +
                ", defence=" + defence +
                '}';
    }
}
