package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Gnome extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 30;
    public static final Actor.Vision vision = Actor.Vision.DARKVISION;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.GNOMISH};

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeIntelligence(2);
    }

    /*
    intelligence =+ 2
    size = small
    speed = 25
    vision = darkvision
    advantage on intelligence, wisdom, and charisma saving throws
    languages = [gnomish, common]
     */
}
