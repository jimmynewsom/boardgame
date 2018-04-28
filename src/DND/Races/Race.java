package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

//most races include an abilitiy score increase, age*(lifespan), alignment, size, speed, & language
//some races have subraces which would just inherit from the parent races
//some races also have racial abilities, and ill deal with those on a case by case basis


public abstract class Race {
    public Actor.Size size;
    public int speed;
    public static Actor.Vision vision;
    public static Actor.Language[] languages;
    public abstract void applyRacialBonuses(Actor c);
}
