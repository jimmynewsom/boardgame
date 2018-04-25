package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Gnome extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeIntelligence(2);
        c.setSizeAndSpeed(Actor.Size.SMALL, 25);
        c.setVision(Actor.Vision.DARKVISION);
    }

    /*
    intelligence =+ 2
    size = small
    speed = 25
    vision = darkvision
    advantage on intelligence, wisdom, and charisma saving throws
    languages = [gnomish, common]
     */
}
