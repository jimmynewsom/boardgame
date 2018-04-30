package DND.Actors;

import DND.D20;

import java.util.ArrayList;

public abstract class Actor {
    protected int strength, dexterity, constitution, intelligence, wisdom, charisma;
    public enum Size {TINY, SMALL, MEDIUM, LARGE, HUGE, GARGANTUAN}
    public enum Vision {BLINDSIGHT, DARKVISION, TRUESIGHT, REGULARSIGHT, BLIND}
    public enum Alignment {GOOD, NEUTRAL, EVIL}
    public enum MoralCode {LAWFUL, NEUTRAL, CHAOTIC}
    public enum Language {COMMON, DWARVISH, ELVISH, GIANT, GNOMISH, GOBLIN, HALFLING, ORC, ABYSSAL, CELESTIAL,
        DRACONIC, DEEPSPEECH, INFERNAL, PRIMORDIAL, SYLVAN, UNDERCOMMON, TELEPATHY}

    public enum Condition {BLINDED, CHARMED, DEAFENED, FRIGHTENED, GRAPPLED, INCAPACITATED, INVISIBLE,
        PARALYZED, PETRIFIED, POISONED, PRONE, RESTRAINED, STUNNED, UNCONSCIOUS}

    protected Size size;
    protected Vision vision;
    protected Alignment alignment;
    protected MoralCode morality;
    protected ArrayList<Condition> conditions;

    protected boolean isAlive;
    protected int maxHealth, currentHealth, maxMana, currentMana, speed, AC;

    public int getAbilityModifier(int abilityScore){
        return (abilityScore - 10) / 2;
    }

    public void attack(Actor target){
        //choose target, determine modifiers, resolve the attack
        int roll = D20.rolld20();
        if(roll == 20)
            System.out.println("critical hit!");
        else if(roll == 1)
            System.out.println("critical fail (that's embarassing...)");
        else if(roll + getAbilityModifier(strength) >= target.AC)
            System.out.println("you hit the target");
        else
            System.out.println("the attack misses");
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

    public ArrayList<Condition> getConditions() {
        return conditions;
    }
}
