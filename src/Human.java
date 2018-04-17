public class Human extends Race {
    @Override
    void applyRacialBonuses(Character c){
        c.strength =+ 1;
        c.dexterity =+ 1;
        c.intelligence =+ 1;
        c.wisdom =+ 1;
        c.constitution =+ 1;
        c.charisma =+ 1;
    }
}
