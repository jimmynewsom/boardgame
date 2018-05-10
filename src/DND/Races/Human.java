package DND.Races;

import DND.Actors.Actor;
import DND.Actors.Character;
import com.sun.org.apache.regexp.internal.RE;

public class Human extends Race {
    @Override
    public void applyRacialBonuses(Character c){
        c.changeStrength(1);
        c.changeDexterity(1);
        c.changeIntelligence(1);
        c.changeWisdom(1);
        c.changeConstitution(1);
        c.changeCharisma(1);
    }

    public Human(){
        super(Actor.Size.MEDIUM, 30, Actor.Vision.REGULARSIGHT, new Actor.Language[] {Actor.Language.COMMON});
    }

    /*
    all abilities + 1
    size = medium
    speed = 30
    languages = [common, *]
    regular sight
     */
}
