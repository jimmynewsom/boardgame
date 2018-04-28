package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Tiefling extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 30;
    public static final Actor.Vision vision = Actor.Vision.DARKVISION;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.INFERNAL};

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeConstitution(2);
    }

    /*
    intelligence +1, charisma +2
    size = medium
    speed = 30
    vision = darkvision
    resistance to fire
    "infernal legacy"
    languages = [infernal, common]
     */
}
