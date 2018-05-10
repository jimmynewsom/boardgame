package DND.Classes;

import DND.Items.Armor;
import DND.Items.Weapon;

public class Warlock extends Class {
    //String pact

    public Warlock(){
        base_hp = 8;
        hp_per_level = 5;
        weaponProficiencies = new Weapon.WeaponType[] {Weapon.WeaponType.SIMPLE};
        armorProficiencies = new Armor.ArmorType[] {Armor.ArmorType.LIGHT};
        //starting items



    }

    /*

     */


}
