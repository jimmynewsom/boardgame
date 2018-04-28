package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class HalfOrc extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 30;
    public static final Actor.Vision vision = Actor.Vision.DARKVISION;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.ORC};

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeStrength(2);
        c.changeConstitution(1);
    }

    /*
    strength +2, constitution +1
    size = medium
    speed = 30
    vision = darkvision
    "relentless endurance and savage attacks"
    proficiency with battleaxe, handaxe, light hammer, and warhammer
    languages = [orc, common]
     */
}
