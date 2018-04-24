package DND.Races;

import DND.Character;

public class Halfling extends Race {
    @Override
    void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
    }
}
