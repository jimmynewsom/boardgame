package DND.Actors.Races;

import DND.Actors.Actor;
import DND.Actors.Character;

public class Gnome extends Race {
    @Override
    public void applyRacialBonuses(Character c) {
        c.changeIntelligence(2);
    }

    public Gnome(){
        super(Actor.Size.SMALL, 25, Actor.Vision.DARKVISION, new Actor.Language[] {Actor.Language.COMMON, Actor.Language.GNOMISH});
    }

    /*
    intelligence =+ 2
    size = small
    speed = 25
    vision = darkvision
    advantage on intelligence, wisdom, and charisma saving throws
    languages = [gnomish, common]
     */
}
