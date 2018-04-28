package DND.Actors;

import DND.D20;

import java.util.ArrayList;

public abstract class Actor {
    protected int strength, dexterity, constitution, intelligence, wisdom, charisma;
    public enum Size {TINY, SMALL, MEDIUM, LARGE, HUGE, GARGANTUAN}
    public enum Vision {BLINDSIGHT, DARKVISION, TRUESIGHT, REGULARSIGHT, BLIND}
    public enum Alignment {GOOD, NEUTRAL, EVIL}
    public enum Morality {LAWFUL, NEUTRAL, CHAOTIC}  //bad name
    public enum Language {COMMON, DWARVISH, ELVISH, GIANT, GNOMISH, GOBLIN, HALFLING, ORC, ABYSSAL, CELESTIAL,
        DRACONIC, DEEPSPEECH, INFERNAL, PRIMORDIAL, SYLVAN, UNDERCOMMON, TELEPATHY}

    public enum Condition {BLINDED, CHARMED, DEAFENED, FRIGHTENED, GRAPPLED, INCAPACITATED, INVISIBLE,
        PARALYZED, PETRIFIED, POISONED, PRONE, RESTRAINED, STUNNED, UNCONSCIOUS}

    protected Size size;
    protected Vision vision;
    protected Alignment alignment;
    protected Morality morality; //bad name
    protected ArrayList<Condition> condition;

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
}
