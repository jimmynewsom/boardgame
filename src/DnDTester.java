import java.util.Random;
import java.util.Scanner;

//this is an implementation of dnd v1. im doing it for practice. its not going online or anything
//since this is dnd, its designed to be as extensible as possible
//so dnd races and classes get their own java classes, that way its easy to add more races and classes later

public class DnDTester {

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

        System.out.println("You enter a dark dungeon.");

        Room[] dungeon = new Room[6];
        for(int i = 0; i < dungeon.length; i++){
            System.out.println("you enter the next room.");
            dungeon[i].describe();

            //redo combat later
            System.out.println("you fight the monsters!");
            System.out.println("Victory!");
        }



    }
}
