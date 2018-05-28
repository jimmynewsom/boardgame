package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

//making each race its own subclass might be inefficient, but I think its the most extensible design
//this way each race can be further customized independently from the rest
//also, its the best way to represent this logical relationship (definitely an is-a relationship, so i can use inheritance)

//most races include an abilitiy score increase, age*(lifespan), alignment, size, speed, & language
//some races have subraces which would just inherit from the parent races
//some races also have racial abilities, and ill deal with those on a case by case basis

public abstract class Race {
    public final Actor.Size size;
    public final int speed;
    public final Actor.Vision vision;
    public final Actor.Language[] languages;
    //public final Game.DamageType[] resistances;
    public abstract void applyRacialBonuses(Character c);

    public Race(Actor.Size size, int speed, Actor.Vision vision, Actor.Language[] languages){
        this.size = size;
        this.speed = speed;
        this.vision = vision;
        this.languages = languages;
    }

    public void racialAbility(Actor[] target_s){}
}
