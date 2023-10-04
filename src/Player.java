public class Player {

    private int health;
    private int atkDamage;
    private int defence;
    private String race;

    public Player(int hp, int atk, int def, String race) throws Exception{
        if(hp<0 || atk<0 || def<0){
            throw new Exception("attributi non validi");
        }
        this.health = hp;
        this. atkDamage = atk;
        this.defence = def;
        this.race = race;
    }
}
