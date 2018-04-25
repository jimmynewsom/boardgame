package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class HalfElf extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeCharisma(2);
        c.setSizeAndSpeed(Actor.Size.MEDIUM, 30);
        c.setVision(Actor.Vision.DARKVISION);
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
