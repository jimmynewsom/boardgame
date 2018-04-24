package DND.Races;

import DND.Character;

public class Elf extends Race {
    @Override
    void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
    }
}
