package DND.Items;

public class Armor extends Item {
    private int AC, strengthRequirement;
    public enum ArmorType {LIGHT, MEDIUM, HEAVY, SHIELD}
    public ArmorType type;
    public boolean stealthDisadvantage;

    public Armor(String itemName, int cost, int AC, int strReq, boolean stealth, int weight, ArmorType type){
        super(itemName, null, cost, weight);
        this.AC = AC;
        this.strengthRequirement = strReq;
        this.stealthDisadvantage = stealth;
        this.type = type;
    }

    public static final Armor[] armors = new Armor[] {
        new Armor("Padded armor", 5, 11, 0, true, 8, ArmorType.LIGHT),
            new Armor("Leather armor", 10, 11, 0, false, 10, ArmorType.LIGHT),
            new Armor("Studded leather armor", 45, 12, 0, false, 13, ArmorType.LIGHT),
            new Armor("Hide armor", 10, 12, 0, false, 10, ArmorType.MEDIUM),
            new Armor("Chain shirt", 50, 13, 0, false, 12, ArmorType.MEDIUM),
            new Armor("Scale mail", 50, 14, 0, true, 20, ArmorType.MEDIUM),
            new Armor("Breastplate", 400, 14, 0, false, 20, ArmorType.MEDIUM),
            new Armor("Half plate armor", 750, 15, 0, true, 40, ArmorType.MEDIUM),
            new Armor("Ring mail", 30, 14, 0, true, 40, ArmorType.HEAVY),
            new Armor("Chain mail", 75, 16, 13, true, 55, ArmorType.HEAVY),
            new Armor("Splint mail", 200, 17, 15, true, 60, ArmorType.HEAVY),
            new Armor("Plate mail", 1500, 18, 15, true, 65, ArmorType.HEAVY),
            new Armor("Shield", 10, 2, 0, false, 6, ArmorType.SHIELD)
    };

    /*
    I'm not going to include this because it's lame. but for completionist sake
    public static final int donTime(ArmorType at){
        switch(at){
            case LIGHT:
                return 1;
            case MEDIUM:
                return 5;
            case HEAVY:
                return 10;
            case SHIELD
                return 0;
        }
    }
    and
    public static final int doffTime(ArmorType at){
        switch(at){
            case LIGHT:
                return 1;
            case MEDIUM:
                return 1;
            case HEAVY:
                return 5;
            case SHIELD
                return 0;
        }
    }
     */
}
