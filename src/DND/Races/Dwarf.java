package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Dwarf extends Race {
    public static final Actor.Size size = Actor.Size.MEDIUM;
    public static final int speed = 25;
    public static final Actor.Vision vision = Actor.Vision.DARKVISION;
    public static final Actor.Language[] languages = {Actor.Language.COMMON, Actor.Language.DWARVISH};

    @Override
    public void applyRacialBonuses(Character c) {
        c.changeConstitution(2);
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
