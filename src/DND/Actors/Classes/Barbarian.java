package DND.Actors.Classes;

import DND.Items.Armor;
import DND.Items.Weapon;

public class Barbarian extends DND.Actors.Classes.Class {
    //String path

    public Barbarian() {
        base_hp = 12;
        hp_per_level = 7;
        //startingItems =
        armorProficiencies = new Armor.ArmorType[] {Armor.ArmorType.LIGHT, Armor.ArmorType.MEDIUM, Armor.ArmorType.SHIELD};
        weaponProficiencies = new Weapon.WeaponType[]{Weapon.WeaponType.SIMPLE, Weapon.WeaponType.MARTIAL};
    }

    private void enterRage(){

    }

    private void exitRage(){

    }

    private void recklessAttack(){

    }






        /*
        Rage: on your turn, enter rage as a bonus action
            - advantage on strength checks and saving throws
            - bonus to damage roll (scales with barbarian level)
            - resistance to bludgeoning, piercing, and slashing damage

        Unarmored defense
            while not wearing armor (shield doesn't count), AC = 10 + dexMod + conMod

        Reckless attack
            - advantage on attack, disadvantage on defense until next turn

        subclass - paths
         */




}
