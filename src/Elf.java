public class Elf extends Race {
    @Override
    void applyRacialBonuses(Character c) {
        c.dexterity =+ 2;
    }
}
