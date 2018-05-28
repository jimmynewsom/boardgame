package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Elf extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
    }

    public Elf() {
        super(Actor.Size.MEDIUM, 30, Actor.Vision.DARKVISION, new Actor.Language[] {Actor.Language.COMMON, Actor.Language.ELVISH});
    }

    /*
    dexterity =+ 2
    size = medium
    speed = 30
    darkvision
    resistance to charm and sleep
    languages = [elvish, common]
     */
}
