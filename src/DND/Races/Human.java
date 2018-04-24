package DND.Races;

import DND.Character;

public class Human extends Race {
    @Override
    void applyRacialBonuses(Character c){
        c.changeStrength(1);
        c.changeDexterity(1);
        c.changeIntelligence(1);
        c.changeWisdom(1);
        c.changeConstitution(1);
        c.changeCharisma(1);
    }
}
