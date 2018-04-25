package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

//because races and classes are so different they will get their own objects (for now)
//but since items are pretty similar, they won't

public abstract class Race {
    public Actor.Size size;
    public static int speed;
    public static Actor.Language[] languages;
    public abstract void applyRacialBonuses(Character c);
}
