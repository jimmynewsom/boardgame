package DND;

import DND.Actors.Monster;
import DND.Actors.NPC;
import DND.Items.Item;

import java.util.ArrayList;

//1 zone class with builder methods
public class Zone {
    private String name, description;
    private ArrayList<Zone> connectingZones;
    private ArrayList<NPC> npcs;

    public Zone(){}

    public void setName(String n){
        name = n;
    }

    public void setDescription(String desc){
        description = desc;
    }

    //this fails silently. wont be a problem until it is, maybe it should throw exceptions though
    public void connectToZone(Zone z){
        if(!connectingZones.contains(z)) {
            connectingZones.add(z);
            z.connectingZones.add(this);
        }
    }

    public void addNPC(NPC npc){
        npcs.add(npc);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<NPC> getNpcs() {
        return npcs;
    }

    public ArrayList<Zone> getConnectingZones() {
        return connectingZones;
    }

    public class Town extends Zone {
        private ArrayList<Building> buildings;

        public ArrayList<Building> getBuildings() {
            return buildings;
        }

        public void addBuilding(Building b){
            buildings.add(b);
        }
    }

    public class Building extends Zone {
        private Town parentTown;
        public Building(Town z){
            parentTown = z;
        }
    }

    public class Dungeon extends Zone {
        private ArrayList<Monster> monsters;
        private ArrayList<Item> loot;

        public ArrayList<Monster> getMonsters() {
            return monsters;
        }

        public ArrayList<Item> getLoot() {
            return loot;
        }

        public void addMonster(Monster m){
            monsters.add(m);
        }

        public void addItem(Item i){
            loot.add(i);
        }
    }
}
