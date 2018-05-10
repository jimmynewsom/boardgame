package DND.Classes;

import DND.Actors.Character;
import DND.Items.Item;
import DND.Items.Weapon;
import DND.Items.Armor;
import DND.Spells.Spell;

public abstract class Class {
    protected int base_hp, hp_per_level, classLevel;
    protected Weapon.WeaponType[] weaponProficiencies;
    protected Armor.ArmorType[] armorProficiencies;
    protected Item[] startingItems;
    //saving throws
    protected Character.Skills[] skillProficiencies;
    protected boolean isMagicUser;
    protected Spell[] spellList;
    protected Subclass subclass;

    //protected Character.ToolProficiences[] toolProficiencies;
    //public abstract void abilityScoreIncrease(Character player);
}