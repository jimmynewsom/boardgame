package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Dragonborn extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeStrength(2);
        c.changeConstitution(1);
        c.setSizeAndSpeed(Actor.Size.MEDIUM, 30);
        c.setVision(Actor.Vision.REGULARSIGHT);
    }

    /*
    strength +2, charisma +1
    size = medium
    speed = 30
    draconic ancestry & breath weapon
    resistance to type determined by ancestry
    languages = [draconic, common]
     */

}
