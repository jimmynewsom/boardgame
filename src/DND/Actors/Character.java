package DND.Actors;

        import DND.Classes.Class;
        import DND.Races.Race;
        import DND.Items.Item;
        import DND.Items.Weapon;
        import DND.Items.Armor;
        import DND.Items.Consumable;
        import DND.D20;

        import java.util.ArrayList;

/*
depending on what's public & private, I can change how ridiculous my game is.
For example - name would normally be private, because the player chooses it and that's that.
but you could also take it the other way, and have monsters change player's names. kinda funny

same for stats. they should be private with rules for access
but if they were public your less limited in terms of how you can throw mechanics together
& people can have fun doing crazy builds
*/


public class Character extends Actor {
    private static final int[] XP_PER_LEVEL = {300, 900, 2700, 6500, 14000, 23000, 34000, 48000, 64000, 85000, 100000, 120000, 140000, 165000, 195000, 225000, 265000, 305000, 355000};

    private String name;
    private Race race;
    private ArrayList<Class> dndclass_s;
    private int xp, level;
    //private Feat[] feats;
    private int[] maxSpellSlots = new int[9], currentSpellSlots = new int[9];

    private Armor armor;
    private Weapon weapon;
    //inventory size is unlimited, but there's a weight limit
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private int weight = 0, weightLimit = 100;

    private ArrayList<Weapon.WeaponType> weaponProficiencies;
    private ArrayList<Armor.ArmorType> armorProficiencies;
    //public enum ToolProficiencies {}
    public enum Skills {ATHLETICS, ACROBATICS, SLEIGHTOFHAND, STEALTH, ARCANA, HISTORY, INVESTIGATION, NATURE, RELIGION,
        ANIMALHANDLING, INSIGHT, MEDICINE, PERCEPTION, SURVIVAL, DECEPTION, INTIMIDATION, PERFORMANCE, PERSUASION}

    private ArrayList<Language> languages = new ArrayList<Language>();


    public Character(String name, Race race, Class dndclass){
        this.name = name;
        level = 1; xp = 0;
        this.chooseRace(race);
        class_s.add(dndclass);
    }

    public String getName() {
        return name;
    }

    //player's choice / true polymorph
    public void chooseRace(Race race){
        this.race = race;
        this.size = race.size;
        this.speed = race.speed;
        this.vision = race.vision;
        race.applyRacialBonuses(this);
        for(Language language : race.languages)
            this.languages.add(language);
    }

    public Race getRace() {
        return race;
    }

    public ArrayList<Class> getDNDClass_s() {
        return class_s;
    }

    //polymorph
    public void changeRace(Race race) {
        //later I have this initialize and update everything for feats and items
        this.race = race;
        this.size = race.size;
        this.speed = race.speed;
        this.vision = race.vision;
    }

    //I should roll 4 and drop the lowest die. also, people should choose which rolls go to which stats, better
    public void rollStats(){
        int r1, r2, r3, r4;
        strength = D20.rolld6() + D20.rolld6() + D20.rolld6();
        dexterity = D20.rolld6() + D20.rolld6() + D20.rolld6();
        intelligence = D20.rolld6() + D20.rolld6() + D20.rolld6();
        wisdom = D20.rolld6() + D20.rolld6() + D20.rolld6();
        constitution = D20.rolld6() + D20.rolld6() + D20.rolld6();
        charisma = D20.rolld6() + D20.rolld6() + D20.rolld6();
    }

    //this is messy.. might be cleaner with an array, but I like my explicit variable names for stats
    private int changeStat(int stat, int change){
        if(stat + change > 20)
            return 20;
        else if(stat + change < 3)
            return 3;
        else
            return(stat + change);
    }

    public void changeStrength(int c){
        strength = changeStat(strength, c);
    }

    public void changeDexterity(int c){
        dexterity = changeStat(dexterity, c);
    }

    public void changeIntelligence(int c){
        intelligence = changeStat(intelligence, c);
    }

    public void changeWisdom(int c){
        wisdom = changeStat(wisdom, c);
    }

    public void changeConstitution(int c){
        constitution = changeStat(constitution, c);
    }

    public void changeCharisma(int c){
        charisma = changeStat(charisma, c);
    }

    public void gainXP(int xp){
        this.xp =+ xp;
        while(this.xp > XP_PER_LEVEL[level]){
            levelUp();
        }
    }


    private void levelUp(Class c){
        level++;
        if(dndclass_s.contains(c))
            dndclass_s.get(dndclass_s.indexOf(c)).levelUp();
        else
            dndclass_s.add(c);


    }

    public void learnLanguage(Language language){
        languages.add(language);
    }

    //also messy
    public void pickUpItem(Item item){
        if(weight < weightLimit) {
            inventory.add(item);
            //weight =+ item.weight;
        }
        else
            System.out.println("Weight limit reached.!");
    }

    private void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        inventory.remove(weapon);
    }

    private void equipArmor(Armor armor) {
        this.armor = armor;
        inventory.remove(armor);
    }

    public void describe(){
        System.out.println( name + " the " + race + " " + class_s.get(0) );
        System.out.println("Str: " + strength);
        System.out.println("Dex: " + dexterity);
        System.out.println("Int: " + intelligence);
        System.out.println("Wis: " + wisdom);
        System.out.println("Con: " + constitution);
        System.out.println("Cha: " + charisma);
    }
}