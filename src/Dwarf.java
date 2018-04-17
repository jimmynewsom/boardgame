public class Dwarf extends Race {
    @Override
    void applyRacialBonuses(Character c) {
        c.constitution =+ 2;
        //poison resistance
    }
}
