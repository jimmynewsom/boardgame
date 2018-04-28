package DND;

import java.util.Scanner;

import DND.Actors.*;

public class CharacterCreator {
    static DND.Actors.Character player;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hello! Welcome to Jimmy Newsom's RPG Simulator v1.0!");
        System.out.println("This is an implementation of a popular board game, using open game content.");
        System.out.println("Technically, I don't think I'm allowed to say the name of the game, but I have also have to include a license which includes the name of the game.");
        System.out.println("So it seems reasonable that an intelligent person could figure it out pretty easily... rhymes with \"sponges & flagons\"...");
        System.out.println();

        System.out.println("Anyways, yeah, it's that game. You want to make a character?");

        System.out.println("    1 -> Sure");  //begin character creation process
        System.out.println("    2 -> Not really");   //end program (because it's funny)
        if(in.nextInt() == 2)
            return;

        String name;

        do {
            in.nextLine();
            System.out.println("Ok. What do you want to name your character?");
            name = in.nextLine();
            System.out.println("Is " + name + " correct?");

            System.out.println("   1 -> yes");
            System.out.println("   2 -> no");
        } while(in.nextInt() == 2);

        System.out.println("Ok, cool.");
        player = new DND.Actors.Character(name);

        do {
            System.out.println("What race do you want to be?");
            System.out.println("1 - human, 2 - elf, 3 - dwarf, 4 - halfing");
            System.out.println("5 - gnome, 6 - half-elf, 7 - half-orc, 8 - dragonborn");
            int currentRace = in.nextInt();

            System.out.println("And what class do you want to be?");
            System.out.println("1 - fighter, 2 - rogue, 3 - cleric, 4 - wizard, 5 - paladin");
            System.out.println("6 - druid, 7 - ranger, 8 - bard, 9 - monk, 10 - sorceror, 11 - warlock");
            int currentClass = in.nextInt();

            System.out.println("A " + currentRace + " " + currentClass + ", correct? (1 yes, 2 no)");
        } while(in.nextInt() == 2);

        //player.chooseRace(...)
        //player.chooseClass(...)

        do {
            System.out.println("Ok cool, rolling stats.....");
            player.rollStats();
            System.out.println("your stats are:");
            player.describe();
            System.out.println("reroll? (1 yes, 2 no)") ;
        } while(in.nextInt() != 2);

        System.out.println("Character creation complete. Loading game world......");





    }
}
