package DND.Classes;

import DND.Actors.Character;
import DND.Items.Weapon;

public class Barbarian extends DND.Classes.Class {

    public Barbarian(){
        base_hp = 12;
        hp_per_level = 7;
        //startingItems =
        armorProficiencies = new Character.ArmorProficiencies[] {Character.ArmorProficiencies.LIGHT, Character.ArmorProficiencies.MEDIUM, Character.ArmorProficiencies.SHIELD};
        weaponProficienies = new Character.WeaponProficiencies[]{Character.WeaponProficiencies.SIMPLE, Character.WeaponProficiencies.MARTIAL};
    }


}
