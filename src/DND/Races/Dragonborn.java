package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Dragonborn extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 30;
    public static final Actor.Vision vision = Actor.Vision.REGULARSIGHT;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.DRACONIC};

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeStrength(2);
        c.changeConstitution(1);
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
