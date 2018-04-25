package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Halfling extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
        c.setSizeAndSpeed(Actor.Size.SMALL, 25);
        c.setVision(Actor.Vision.REGULARSIGHT);
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
