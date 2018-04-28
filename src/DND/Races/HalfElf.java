package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class HalfElf extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 30;
    public static final Actor.Vision vision = Actor.Vision.DARKVISION;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.ELVISH};

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeCharisma(2);
    }

    /*
    charisma +2, * +1
    size = medium
    speed = 30
    vision = darkvision
    resistance to charm and sleep
    * skill proficiency x2
    languages = [elvish, common, *]
     */
}
