package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Human extends Race {
    @Override
    public void applyRacialBonuses(Character c){
        c.changeStrength(1);
        c.changeDexterity(1);
        c.changeIntelligence(1);
        c.changeWisdom(1);
        c.changeConstitution(1);
        c.changeCharisma(1);
        c.setSizeAndSpeed(Actor.Size.MEDIUM, 30);
        c.setVision(Actor.Vision.REGULARSIGHT);
    }

    /*
    all abilities + 1
    size = medium
    speed = 30
    languages = [common, *]
     */
}
