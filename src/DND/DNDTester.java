package DND;

import DND.Actors.Character;
import DND.Classes.Cleric;
import DND.Classes.Fighter;
import DND.Classes.Rogue;
import DND.Classes.Wizard;
import DND.Races.Dwarf;
import DND.Races.Elf;
import DND.Races.Halfling;
import DND.Races.Human;
import DND.Zones.Room;

import java.util.Random;
import java.util.Scanner;

/*
this is an implementation of dnd. its designed to be as extensible and readable as possible
so dnd races and classes get their own java classes, that way its easy to add more races and classes later
*(some things might be better done using the factory pattern instead of direct inheritance, ill reoptimize later)

players should make characters, then their characters can explore the gameworld.
(3 pillars of gameplay are exploration, social interaction, and combat.)
combat - dungeons
exploration - include several locations to move between (like zork - this is pretty weak, but ok for a first version)
interaction - include npcs. make them interesting / funny

 */



public class DNDTester {
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
        player.getRace().applyRacialBonuses(player);

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
        //combat - dungeons, interaction - town / quest hub, exploration - zones (for now)
        //exploration will be the most limited for now. too much writing



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
