package DND;

import DND.Actors.NPC;

import java.util.ArrayList;

//1 zone class with a builder
public class Zone {
    private String name, description;
    private ArrayList<NPC> npcs = new ArrayList<NPC>();
    private ArrayList<Zone> zones;


    public Zone(String name){
        this.name = name;
    }


}
