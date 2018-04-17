import java.util.Random;

public class Character {
    static Random r = new Random();

    String name;
    public int strength, dexterity, intelligence, wisdom, constitution, charisma;
    Race race;
    DNDClass dndclass;        //there's got to be a better name for this....
    int hp = 20, maxHealth = 20, mp = 0, xp = 0, level = 1;

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

    void chooseRace(Race race){
        this.race = race;
    }

    void chooseClass(DNDClass c){
        dndclass = c;
    }

    void describe(){
        System.out.println(name + " the " + race + " " + dndclass);
    }
}