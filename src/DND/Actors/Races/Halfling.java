package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Halfling extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
    }

    public Halfling(){
        super(Actor.Size.SMALL, 25, Actor.Vision.REGULARSIGHT, new Actor.Language[] {Actor.Language.COMMON, Actor.Language.HALFLING});
    }

    /*
    dexterity =+ 2
    size = small
    speed = 25
    lucky - when you roll a 1 on an attack roll, you can reroll (idk how I can implement this without hard coding it into the attack method, which is bad)
     & nimbleness"
    resistance to fear
    languages = [halfling, common]
     */
}
