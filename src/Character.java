import java.util.Random;

public class Character {
    public static Random r = new Random();  //should have a singleton random for the game....

    private String name;
    private Race race;
    private DnDClass dndclass;        //there's got to be a better name for this.... also, should I include multiclassing?
    private int strength, dexterity, intelligence, wisdom, constitution, charisma;
    private int hp = 20, maxHealth = 20, mp = 0, maxMP = 0, xp = 0, level = 1, speed = 25;
    private boolean isAlive = true;

    private Item armor, weapon;
    private Item[] inventory;

    Character(String name){
        this.name = name;
    }

    void rollStats(){
        strength = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        dexterity = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        intelligence = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        wisdom = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        constitution = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        charisma = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
    }

    void gainXP(int xp){
        this.xp =+ xp;
        while(this.xp > XP_PER_LEVEL[level]){
            levelUp();
        }
    }

    void levelUp(){
        maxHealth =+ 10;
        hp =+ 10;
        level++;
    }

    private void chooseRace(Race race){
        this.race = race;
    }

    public Race getRace() { return race; }

    public void changeRace(Race race) { this.race = race; }

    private void chooseClass(DnDClass c){
        dndclass = c;
    }

    private void equipWeapon(Item weapon) { this.weapon = weapon; }

    private void equipArmor(Item armor) { this.armor = armor; }



    public void describe(){
        System.out.println( name + " the " + race + " " + dndclass );
    }

    public void attack(Monster target) { target.takeDamage(5); }

    public boolean takeDamage(int damage){
        hp =- damage;
        if(hp <= 0){
            hp = 0;
            isAlive = false;
            return false;
        } else
            return true;
    }





}