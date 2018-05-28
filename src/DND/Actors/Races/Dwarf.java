package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Dwarf extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeConstitution(2);
    }

    public Dwarf(){
        super(Actor.Size.MEDIUM, 25, Actor.Vision.DARKVISION, new Actor.Language[] {Actor.Language.COMMON, Actor.Language.DWARVISH});
    }

    /*
    constitution =+ 2
    size = medium
    speed = 25
    vision = darkvision
    resistance to poison
    proficiency with battleaxe, handaxe, light hammer, and warhammer & tools of choice*
    stonecunning* - double proficiency bonus for history checks related to stonework
    languages = [dwarvish, common]
     */



}
