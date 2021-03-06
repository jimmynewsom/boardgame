package DND.Actors;

import DND.Game;
import DND.Spells.Spell;

import java.util.ArrayList;
import java.util.Random;

public abstract class Actor {
    private static Random r = new Random();

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

    //public void move(int x, int y){}

    public void attack(Actor target){
        //choose target, determine modifiers, resolve the attack
        int roll = 1 + r.nextInt(20);
        if(roll == 20)
            System.out.println("critical hit!");
        else if(roll == 1)
            System.out.println("critical fail (that's embararassing...)");
        else if(roll + getAbilityModifier(strength) >= target.AC) {
            System.out.println("you hit the target");
            //need separate method for damage calculation
            target.takeDamage(7, Game.DamageType.SLASHING );
        }
        else
            System.out.println("the attack misses");
    }

    public void castSpell(Spell spell, Actor[] target_s){
        spell.cast(target_s);
    }

    public void takeDamage(int damage, Game.DamageType damageType){
        if(this.resistances.contains(damageType))
            hp =- damage/2;
        else if(this.vulnerabilities.contains(damageType))
            hp =+ damage/2;
        else
            hp =- damage;
        if(hp <= 0)
            isAlive = false;
    }

    public void revive(int healing){
        isAlive = true;
        hp = healing;
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
}
