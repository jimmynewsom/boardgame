package DND.Actors;

import DND.D20;
import DND.Game;

import java.util.ArrayList;

public abstract class Actor {
    protected int strength, dexterity, constitution, intelligence, wisdom, charisma;
    public enum Size {TINY, SMALL, MEDIUM, LARGE, HUGE, GARGANTUAN}
    public enum Vision {BLINDSIGHT, DARKVISION, TRUESIGHT, REGULARSIGHT, BLIND}
    public enum Alignment {GOOD, NEUTRAL, EVIL}
    public enum MoralCode {LAWFUL, NEUTRAL, CHAOTIC}
    public enum Language {COMMON, DWARVISH, ELVISH, GIANT, GNOMISH, GOBLIN, HALFLING, ORC, ABYSSAL, CELESTIAL,
        DRACONIC, DEEPSPEECH, INFERNAL, PRIMORDIAL, SYLVAN, UNDERCOMMON, TELEPATHY}

    protected Size size;
    protected Vision vision;
    protected Alignment alignment;
    protected MoralCode morality;
    protected ArrayList<Game.Condition> conditions;
    protected ArrayList<Game.DamageType> resistances;
    protected ArrayList<Game.DamageType> vulnerabilities;

    protected boolean isAlive;
    protected int maxHP, hp, speed, AC;

    public int getAbilityModifier(int abilityScore){
        return (abilityScore - 10) / 2;
    }

    public void attack(Actor target){
        //choose target, determine modifiers, resolve the attack
        int roll = D20.rolld20();
        if(roll == 20)
            System.out.println("critical hit!");
        else if(roll == 1)
            System.out.println("critical fail (that's embararssing...)");
        else if(roll + getAbilityModifier(strength) >= target.AC) {
            System.out.println("you hit the target");
            //roll for damage
        }
        else
            System.out.println("the attack misses");
    }

    public void takeDamage(int damage){
        hp =- damage;
        if(hp <= 0)
            isAlive = false;
    }

    public void heal(int healing){
        if(hp + healing > maxHP)
            hp = maxHP;
        else
            hp =+ healing;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public Size getSize() {
        return size;
    }

    public Vision getVision() {
        return vision;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public MoralCode getMorality() {
        return morality;
    }

    public ArrayList<Game.Condition> getConditions() {
        return conditions;
    }

    //combat methods





    public void shortRest(){}

    public void longRest(){}
}
