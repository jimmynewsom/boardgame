package DND.Items;

import DND.Actors.Character;

public class ManaPotion extends Consumable {
    @Override
    public void use(Character self){
        self.restoreMana(20);
    }
}
