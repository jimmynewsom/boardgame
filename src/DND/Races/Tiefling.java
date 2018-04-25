package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Tiefling extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeConstitution(2);
        c.setSizeAndSpeed(Actor.Size.MEDIUM, 25);
        c.setVision(Actor.Vision.DARKVISION);
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
