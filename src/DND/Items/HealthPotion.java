package DND.Items;

import DND.Actors.Character;

public class HealthPotion extends Consumable {
    @Override
    public void use(Character self){
        self.heal(20);
    }
}