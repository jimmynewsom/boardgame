package DND.Actors;

import DND.Classes.Class;
import DND.Races.Race;
import DND.Items.Item;
import DND.Items.Weapon;
import DND.Items.Armor;
import DND.Items.Consumable;

import java.util.ArrayList;
import java.util.Random;

/*
depending on what's public & private, I can change how ridiculous my game is.
For example - name would normally be private, because the player chooses it and that's that.
but you could also take it the other way, and have monsters change player's names. kinda funny

same for stats. they should be private with rules for access
but if they were public your less limited in terms of how you can throw mechanics together
& people can have fun doing crazy builds
*/


public class Character extends Actor {
    public static Random r = new Random();  //should have a singleton random for the game....
    private static final int[] XP_PER_LEVEL = {300, 900, 2700, 6500, 14000, 23000, 34000, 48000, 64000, 85000, 100000, 120000, 140000, 165000, 195000, 225000, 265000, 305000, 355000};

    private String name;
    private Race race;
    private Size size;
    private int speed;
    private Vision vision;
    private Class dndclass;
    private int strength, dexterity, intelligence, wisdom, constitution, charisma;
    private int hp = 20, maxHealth = 20, mp = 0, maxMP = 0, xp = 0, level = 1;
    private boolean isAlive = true;

    private Alignment alignment;
    private Morality morality;
    private ArrayList<Language> languages;

    private Armor armor;
    private Weapon weapon;
    private Item[] inventory;

    public Character(String name){
        this.name = name;
    }

    public void rollStats(){
        strength = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        dexterity = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        intelligence = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        wisdom = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        constitution = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
        charisma = 3 + r.nextInt(6) + r.nextInt(6) + r.nextInt(6);
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


    void gainXP(int xp){
        this.xp =+ xp;
        while(this.xp > XP_PER_LEVEL[level]){
            levelUp();
        }
    }

    void levelUp(){
        maxHealth =+ 10;
        hp =+ 10;
        level++;
    }

    public void setVision(Vision vision){
        this.vision = vision;
    }

    public void setSizeAndSpeed(Size size, int speed){
        this.size = size;
        this.speed = speed;
    }

    //player's choice
    public void chooseRace(Race race){
        this.race = race;
        race.applyRacialBonuses(this);
        for(Language language : race.languages)
            this.languages.add(language);
    }

    public Race getRace() {
        return race;
    }

    //polymorph
    public void changeRace(Race race) {
        this.race = race;
        this.size = race.size;
    }

    public void chooseClass(Class c){
        dndclass = c;
    }

    public void learnLanguage(Language language){
        languages.add(language);
    }

    /*
    private void pickUpItem(Item item){
        if(inventory.size() )
    }
    */

    private void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private void equipArmor(Armor armor) {
        this.armor = armor;
    }

    private void useConsummable(Consumable consumable) {
        consumable.use(this);
    }



    public void describe(){
        System.out.println( name + " the " + race + " " + dndclass );
        System.out.println("Str: " + strength);
        System.out.println("Dex: " + dexterity);
        System.out.println("Int: " + intelligence);
        System.out.println("Wis: " + wisdom);
        System.out.println("Con: " + constitution);
        System.out.println("Cha: " + charisma);
    }


    public void attack(Monster target) {
        target.takeDamage(5);
    }

    public boolean takeDamage(int damage){
        hp =- damage;
        if(hp <= 0){
            hp = 0;
            isAlive = false;
            return false;
        } else
            return true;
    }

    public void heal(int healing){
        if(hp + healing > maxHealth)
            hp = maxHealth;
        else
            hp =+ healing;
    }

    public void restoreMana(int m){
        if(mp + m > maxMP)
            mp = maxMP;
        else
            mp = mp + m;
    }



}