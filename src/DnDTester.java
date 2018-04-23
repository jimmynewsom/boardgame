import java.util.Random;
import java.util.Scanner;

//this is an implementation of dnd. its designed to be as extensible as possible
//so dnd races and classes get their own java classes, that way its easy to add more races and classes later
//*(some things might be better done using the abstract factory pattern instead of direct inheritance, ill reoptimize later)


/*
    players should make characters, then their characters can explore the gameworld.
    3 pillars of gameplay are exploration, interaction, and combat.
    combat - dungeons
    exploration - include several locations to move between (like zork)
    interaction - include npcs
 */



public class DnDTester {
    static Random r = new Random();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name.");
        Character player = new Character(in.nextLine());

        //replace with buttons later
        System.out.println("Choose your race.");
        System.out.println("(1 for human, 2 for elf, 3 for dwarf, 4 for halfling.)");
        switch(in.nextInt()){
            case 1: player.chooseRace(new Human());
                    break;
            case 2: player.chooseRace(new Elf());
                    break;
            case 3: player.chooseRace(new Dwarf());
                    break;
            default: player.chooseRace(new Halfling());
                     break;
        }
        player.race.applyRacialBonuses(player);

        System.out.println("Choose your class.");
        System.out.println("(1 for cleric, 2 for fighter, 3 for rogue, 4 for wizard.)");
        switch(in.nextInt()){
            case 1: player.chooseClass(new Cleric());
                break;
            case 2: player.chooseClass(new Fighter());
                break;
            case 3: player.chooseClass(new Rogue());
                break;
            default: player.chooseClass(new Wizard());
                break;
        }

        System.out.println("Rolling stats...");
        player.rollStats();
        player.describe();

        //once I've created a character, the "3 pillars of adventure" are exploration, interaction, and combat
        //combat is easy. what's the best way to implement interaction and exploration??????


        System.out.println("You enter a dark dungeon.");

        Room[] dungeon = new Room[6];
        for(int i = 0; i < dungeon.length; i++){
            dungeon[i] = new Room();
            System.out.println("you enter the next room.");
            dungeon[i].describe();
        }

    }

    static void combat(Character player, Room room){
        //determine surprise, establish positions, roll initiative, take turns, etc.
        //need to represent ground?
        room.describe();
        //redo combat later
        System.out.println("you fight the monsters!");
        System.out.println("Victory!");


    }
}
