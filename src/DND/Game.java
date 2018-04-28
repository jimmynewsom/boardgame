package DND;

import DND.Actors.*;

import java.util.Scanner;

/*
top level Game object. Most of the combat methods will change if I add graphics later
 */

public class Game {
    Scanner in = new Scanner(System.in);

    //combat v1. only works for combat between 2 factions
    public boolean combat(DND.Actors.Character[] party, Monster[] enemies){
        //determine surprise, establish positions*, roll intiative, take turns
        Actor[] combatants = new Actor[party.length + enemies.length];
    }

    private void playerTurn(DND.Actors.Character player, Monster[] enemies){
        //move*, 1 action, bonus action
        System.out.println(player.getName() + ", it's your turn.");
        System.out.println("Would you like to attack or cast a spell? (1 - attack, 2 - spell)");
        int input = in.nextInt();
        if(input == 2){
            System.out.println("What spell would you like to cast?");
            System.out.println("all you have is fireball");
            //for(DND.Spells.Spell spell : player.spellList)
                //System.out.println()
        }
        System.out.println("who would you like to target");
        for(int i = 0; i < enemies.length; i++)
            System.out.print(enemies[i].type + " " + i + ",");
        int target = in.next();
        if(input == 1)
            player.attack(enemies[target]);
        else
            player.attack(enemies[target]);
    }

}
