package DND.Items;

import DND.Actors.Character;

public abstract class Consumable extends Item {
    public Consumable(String name, String desc, int cost, int weight){
        super(name, desc, cost, weight);
    }
    public abstract void use(Character self);
}
