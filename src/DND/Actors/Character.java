package DND.Actors;

import DND.Actors.Classes.Class;
import DND.Actors.Classes.Warlock;
import DND.Actors.Races.Race;
import DND.Items.Item;
import DND.Items.Weapon;
import DND.Items.Armor;

import java.util.ArrayList;
import java.util.Random;

//encapsulation is a pain in the ass...

public class Character extends Actor {
    private static Random r = new Random();

    private static final int[] XP_PER_LEVEL = {300, 900, 2700, 6500, 14000, 23000, 34000, 48000, 64000, 85000, 100000, 120000, 140000, 165000, 195000, 225000, 265000, 305000, 355000};

    private String name;
    private Race race;
    private ArrayList<Class> dndclass_s;
    private int xp, level, gold;
    //private Feat[] feats;
    private int[] maxSpellSlots = new int[9], currentSpellSlots = new int[9];

    private Armor armor;
    private Weapon weapon;
    //inventory size is unlimited, but there's a weight limit
    protected ArrayList<Item> inventory = new ArrayList<Item>();
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
        dndclass_s.add(dndclass);
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public ArrayList<Class> getClasses() {
        return dndclass_s;
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

    //polymorph
    public void changeRace(Race race) {
        //later I have this initialize and update everything for feats and items
        this.race = race;
        this.size = race.size;
        this.speed = race.speed;
        this.vision = race.vision;
    }


    //later I'll just set stats and put this logic in the view. the player will roll and choose values
    public void rollStats(){
        strength = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        dexterity = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        intelligence = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        wisdom = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        constitution = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        charisma = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
    }

    //this is messy.. might be cleaner with an array, but I like my explicit variable names for stats
    //I might use an enum map for stats. kinda unneccessary, but right now I have to write 6 methods for every stat thing that can happen, fucking annoying
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

    public boolean hasGold(int g){
        if(gold > g)
            return true;
        else
            return false;
    }

    public int getGold(){
        return gold;
    }

    public void addGold(int g){
        gold =+ g;
    }

    public void removeGold(int g){
        gold =- g;
    }

    public void gainXP(int xp){
        this.xp =+ xp;
        while(this.xp > XP_PER_LEVEL[level]){
            levelUp(new Warlock());
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

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void pickUpItem(Item item) throws Exception {
        if(weight + item.weight > weightLimit) {
            throw new Exception();
        }
        else {
            inventory.add(item);
            weight = weight + item.weight;
        }

    }

    private void equip(Weapon weapon) {
        inventory.add(this.weapon);
        this.weapon = weapon;
        inventory.remove(weapon);
    }

    private void equip(Armor armor) {
        inventory.add(this.armor);
        this.armor = armor;
        inventory.remove(armor);
    }

    public void describe(){
        System.out.println( name + " the " + race + " " + dndclass_s.get(0) );
        System.out.println("Str: " + strength);
        System.out.println("Dex: " + dexterity);
        System.out.println("Int: " + intelligence);
        System.out.println("Wis: " + wisdom);
        System.out.println("Con: " + constitution);
        System.out.println("Cha: " + charisma);
    }
}