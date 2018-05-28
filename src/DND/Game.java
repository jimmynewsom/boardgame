package DND;

import DND.Actors.*;
import DND.Actors.Character;

import java.util.LinkedList;
import java.util.Random;

/*
top level Game object. Most of the combat methods will change if I add graphics later
 */

public class Game {
    private static Random r = new Random();

    public enum DamageType {ACID, BLUDGEONING, COLD, FIRE, FORCE, LIGHTNING, NECROTIC, PIERCING,
        POISON, PSYCHIC, RADIANT, SLASHING, THUNDER}

    public enum Condition {BLINDED, CHARMED, DEAFENED, FRIGHTENED, GRAPPLED, INCAPACITATED, INVISIBLE,
        PARALYZED, PETRIFIED, POISONED, PRONE, RESTRAINED, STUNNED, UNCONSCIOUS}

    //combat is hard. all of this will change if i change the presentation layer (text based vs 2d or 3d)
    public void combat(Character[] party, Actor[] enemies){
        //determine surprise, establish positions*, roll intiative, take turns
        boolean battleInProgress = true;
        LinkedList<Actor> orderedCombatants = rollInitiative(party, enemies);
        while(battleInProgress){

        }

    }

    public LinkedList<Actor> rollInitiative(Character[] party, Actor[] enemies){
        //this might be a little messy, but I think it's good enough. First I take in 2 arrays as input, players and monsters
        //then I combine them in to 1 array, build a 2nd array for the rolls, and use the roll array to sort both
        //this way I dont have to build a new data structure, and since all the logic is in one place i think its ok. messy but fully contained

        //also, this way I can do this once and then let the returned object track turn order
        //also, im returning a linkedlist instead of a queue, because i want flexibility, so you can skip people turns and stuff

        Actor[] combatants = new Actor[party.length + enemies.length];
        int[] rolls = new int[combatants.length];
        for(int i = 0; i < rolls.length; i++){
            if(i < party.length)
                combatants[i] = party[i];
            else
                combatants[i] = enemies[i - party.length];
            rolls[i] = 1 + r.nextInt(20) + combatants[i].getAbilityModifier(combatants[i].getDexterity());
        }
        //I'm just going to use selection sort for now, because n <= 10, and I want this to be simple
        for(int i = 0; i < rolls.length; i++){
            for(int j = i; j < rolls.length; j++){
                if(rolls[j] > rolls[i]){   //not super important, but this way if there is a tie the earlier actor goes first. right now that also means players win ties, which is good
                    int temp = rolls[j];
                    rolls[j] = rolls[i];
                    rolls[i] = temp;
                    Actor t2 = combatants[j];
                    combatants[j] = combatants[i];
                    combatants[i] = t2;
                }
            }
        }
        LinkedList<Actor> orderedCombatants = new LinkedList<Actor>();
        for(int i = 0; i < combatants.length; i++)
            orderedCombatants.add(combatants[i]);

        return orderedCombatants;
    }

    public void playerTurn(){
        //get input, do something
        System.out.println();
    }

    public void aiTurn(){
        //make decision, do something
    }
}
