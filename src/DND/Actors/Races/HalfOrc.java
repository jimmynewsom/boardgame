package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class HalfOrc extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeStrength(2);
        c.changeConstitution(1);
    }

    public HalfOrc(){
        super(Actor.Size.MEDIUM, 30, Actor.Vision.DARKVISION, new Actor.Language[] {Actor.Language.COMMON, Actor.Language.ORC});
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
