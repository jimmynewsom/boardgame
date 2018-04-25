package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class HalfOrc extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeStrength(2);
        c.changeConstitution(1);
        c.setSizeAndSpeed(Actor.Size.MEDIUM, 30);
        c.setVision(Actor.Vision.DARKVISION);
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
