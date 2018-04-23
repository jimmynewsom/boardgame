public class Halfling extends Race {
    @Override
    void applyRacialBonuses(Character c) {
        c.changeDexterity(2);
    }
}
