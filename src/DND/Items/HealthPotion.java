package DND.Items;

import DND.Actors.Character;

public class HealthPotion extends Consumable {
    public HealthPotion(){
        super("health potion", "heals for 25 hp", 25, 25);
    }
    @Override
    public void use(Character self){
        self.heal(20);
    }
}