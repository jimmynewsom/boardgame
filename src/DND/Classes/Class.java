package DND.Classes;

import DND.Actors.Character;
import DND.Items.Item;

public abstract class Class {
    protected int base_hp, hp_per_level, classLevel;
    protected Character.WeaponProficiencies[] weaponProficienies;
    protected Character.ArmorProficiencies[] armorProficiencies;
    protected Item[] startingItems;
    //saving throws
    protected Character.Skills[] skillProficiencies;

    //protected Character.ToolProficiences[] toolProficiencies;
    //private Feat[] feats;

    public int getHP(int con_mod, int level){
        return base_hp + hp_per_level + (level * con_mod);
    }
    //public abstract void abilityScoreIncrease(Character player);
}
