package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Elf extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 30;
    public static final Actor.Vision vision = Actor.Vision.DARKVISION;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.ELVISH};

    @Override
    public void applyRacialBonuses(Actor c) {
        c.changeDexterity(2);
    }

    /*
    dexterity =+ 2
    size = medium
    speed = 30
    darkvision
    resistance to charm and sleep
    languages = [elvish, common]
     */
}
