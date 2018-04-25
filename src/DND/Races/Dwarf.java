package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Dwarf extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeConstitution(2);
        c.setSizeAndSpeed(Actor.Size.MEDIUM, 25);
        c.setVision(Actor.Vision.DARKVISION);
    }

    /*
    constitution =+ 2
    size = medium
    speed = 25
    vision = darkvision
    resistance to poison
    proficiency with battleaxe, handaxe, light hammer, and warhammer
    languages = [dwarvish, common]
     */



}
