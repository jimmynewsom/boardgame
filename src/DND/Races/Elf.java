package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Elf extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
        c.setSizeAndSpeed(Actor.Size.MEDIUM, 30);
        c.setVision(Actor.Vision.DARKVISION);
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
