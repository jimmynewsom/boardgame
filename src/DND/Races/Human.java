package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Human extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 30;
    public static final Actor.Vision vision = Actor.Vision.REGULARSIGHT;
    public static final Actor.Language[] languages = {Actor.Language.COMMON};

    @Override
    public void applyRacialBonuses(Character c){
        c.changeStrength(1);
        c.changeDexterity(1);
        c.changeIntelligence(1);
        c.changeWisdom(1);
        c.changeConstitution(1);
        c.changeCharisma(1);
    }

    /*
    all abilities + 1
    size = medium
    speed = 30
    languages = [common, *]
    regular sight
     */
}
