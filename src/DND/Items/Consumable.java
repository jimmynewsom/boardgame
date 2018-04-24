package DND.Items;

import DND.Character;

public abstract class Consumable extends Item {
    public abstract void use(Character self);
}
