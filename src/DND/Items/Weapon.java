package DND.Items;

import DND.Game.DamageType;

public class Weapon extends Item {
    int chanceToHit;
    int numDice, dieValue, normalRange, longRange;
    //maybe ranged weapons should be a subclass? maybe range should be an int and not a WeaponProperty
    public boolean isRanged;
    public enum WeaponType {SIMPLE, MARTIAL, LANCE, NET, IMPROVISED}
    public enum WeaponProperties {AMMUNITION, FINESSE, HEAVY, LIGHT, LOADING, RANGE, REACH, SPECIAl, THROWN, TWOHANDED, VERSATILE, SILVERED};
    WeaponType weaponType;
    DamageType damageType;
    WeaponProperties[] properties;
    public Weapon(String itemName, int cost, int numDice, int dieValue, DamageType dtype, int weight, WeaponType wtype, WeaponProperties[] properties ){
        this.itemName = itemName;
        this.cost = cost;
        this.numDice = numDice;
        this.dieValue = dieValue;
        this.weight = weight;
        this.weaponType = wtype;
        this.damageType = dtype;
        this.properties = properties;
    }

    //this also seems messy, but if I do it this way I only need 1 copy of every weapon. this works for now
    public static final Weapon[] weapons = new Weapon[] {
        new Weapon("Club", 1, 1, 4, DamageType.BLUDGEONING, 2, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.LIGHT}),
            new Weapon("Dagger", 2, 1, 4, DamageType.PIERCING, 1, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.LIGHT, WeaponProperties.THROWN}),
            new Weapon("Greatclub", 2, 1, 8, DamageType.BLUDGEONING, 10, WeaponType.SIMPLE, new WeaponProperties[] {WeaponProperties.TWOHANDED}),
            new Weapon("Handaxe", 5, 1, 6, DamageType.SLASHING, 2, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.LIGHT, WeaponProperties.THROWN}),
            new Weapon("Javelin", 5, 1, 6, DamageType.PIERCING, 2, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.THROWN}),
            new Weapon("Light hammer", 2, 1, 4, DamageType.BLUDGEONING, 2, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.LIGHT, WeaponProperties.THROWN}),
            new Weapon("Mace", 5, 1, 6, DamageType.BLUDGEONING, 4, WeaponType.SIMPLE, new WeaponProperties[]{}),
            new Weapon("Quarterstaff", 2, 1, 6, DamageType.BLUDGEONING, 4, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.VERSATILE}),
            new Weapon("Sickle", 1, 1, 4, DamageType.SLASHING, 2, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.LIGHT}),
            new Weapon("Spear", 1, 1, 6, DamageType.PIERCING, 3, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.THROWN, WeaponProperties.VERSATILE}),
            new Weapon("Light crossbow", 25, 1, 8, DamageType.PIERCING, 5, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.LOADING, WeaponProperties.TWOHANDED}),
            new Weapon("Dart", 5, 1, 4, DamageType.PIERCING, 1, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.THROWN}),
            new Weapon("Shortbow", 25, 1, 6, DamageType.PIERCING, 2, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.TWOHANDED}),
            new Weapon("Sling", 1, 1, 4, DamageType.BLUDGEONING, 2, WeaponType.SIMPLE, new WeaponProperties[]{WeaponProperties.AMMUNITION}),
            new Weapon("Battleaxe", 10, 1, 8, DamageType.SLASHING, 4, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.VERSATILE}),
            new Weapon("Flail", 10, 1, 8, DamageType.BLUDGEONING, 2, WeaponType.MARTIAL, new WeaponProperties[]{}),
            new Weapon("Glaive", 20, 1, 10, DamageType.SLASHING, 6, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.REACH, WeaponProperties.TWOHANDED}),
            new Weapon("Greataxe", 30, 1, 12, DamageType.SLASHING, 7, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.TWOHANDED}),
            new Weapon("Greatsword", 50, 2, 6, DamageType.SLASHING, 6, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.TWOHANDED}),
            new Weapon("Halberd", 20, 1, 8, DamageType.PIERCING, 6, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.REACH, WeaponProperties.TWOHANDED}),
            new Weapon("Lance", 10, 1, 10, DamageType.SLASHING, 6, WeaponType.LANCE, new WeaponProperties[]{WeaponProperties.REACH}),
            new Weapon("Longsword", 15, 1, 8, DamageType.SLASHING, 3, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.VERSATILE}),
            new Weapon("Maul", 10, 2, 6, DamageType.BLUDGEONING, 10, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.TWOHANDED}),
            new Weapon("Morningstar", 15, 1, 8, DamageType.PIERCING, 4, WeaponType.MARTIAL, new WeaponProperties[]{}),
            new Weapon("Pike", 5, 1, 8, DamageType.SLASHING, 18, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.REACH, WeaponProperties.TWOHANDED}),
            new Weapon("Rapier", 25, 1, 6, DamageType.PIERCING, 2, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.FINESSE}),
            new Weapon("Scimitar", 25, 1, 6, DamageType.PIERCING, 3, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.LIGHT}),
            new Weapon("Shortsword", 10, 1, 6, DamageType.SLASHING, 2, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.LIGHT}),
            new Weapon("Trident", 5, 1, 6, DamageType.PIERCING, 4, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.THROWN, WeaponProperties.VERSATILE}),
            new Weapon("War pick", 5, 1, 8, DamageType.PIERCING, 2, WeaponType.MARTIAL, new WeaponProperties[]{}),
            new Weapon("Warhammer", 15, 1, 8, DamageType.PIERCING, 2, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.VERSATILE}),
            new Weapon("Whip", 2, 1, 4, DamageType.SLASHING, 3, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.REACH}),
            new Weapon("Blowgun", 10, 1, 1, DamageType.PIERCING, 1, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.LOADING}),
            new Weapon("Hand crossbow", 75, 1, 6, DamageType.PIERCING, 3, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.LIGHT, WeaponProperties.LOADING}),
            new Weapon("Heavy crossbow", 50, 1, 10, DamageType.PIERCING, 18, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.HEAVY, WeaponProperties.LOADING, WeaponProperties.TWOHANDED}),
            new Weapon("Longbow", 50, 0, 0, DamageType.PIERCING, 2, WeaponType.MARTIAL, new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.HEAVY, WeaponProperties.TWOHANDED}),
            new Weapon("Net", 1, 1, 8, DamageType.SLASHING, 3, WeaponType.NET, new WeaponProperties[]{WeaponProperties.THROWN})
    };
}