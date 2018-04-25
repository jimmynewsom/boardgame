package DND.Zones;

import DND.Actors.Monster;

import java.util.Random;

public class Room {
    static Random r = new Random();

    Monster[] monsters;

    public Room(){
        monsters = new Monster[1 + r.nextInt(3)];
        for(int i = 0; i < monsters.length; i++){
            //monsters[i] = new Goblin();
        }
    }

    public void describe(){
        for(int i = 0; i < monsters.length; i++){
            System.out.println(monsters[i]);
        }
    }
}