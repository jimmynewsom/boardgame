package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Halfling extends Race {
    public static final Actor.Size size = Actor.Size.SMALL;
    public static final int speed = 25;
    public static Actor.Vision vision = Actor.Vision.REGULARSIGHT;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.HALFLING};

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
    }

    /*
    dexterity =+ 2
    size = small
    speed = 25
    "lucky & nimbleness"
    resistance to fear
    languages = [halfling, common]
     */
}
