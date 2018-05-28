package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Tiefling extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeConstitution(2);
    }

    public Tiefling(){
        super(Actor.Size.MEDIUM, 30, Actor.Vision.DARKVISION, new Actor.Language[] {Actor.Language.COMMON, Actor.Language.INFERNAL});
    }

    /*
    intelligence +1, charisma +2
    size = medium
    speed = 30
    vision = darkvision
    resistance to fire
    "infernal legacy"
    languages = [infernal, common]
     */
}
