public class Halfling extends Race {
    @Override
    void applyRacialBonuses(Character c) {
        c.dexterity =+ 2;
    }
}
