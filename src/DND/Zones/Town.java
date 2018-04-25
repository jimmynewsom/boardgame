package DND.Zones;

import DND.Actors.NPC;

import java.util.ArrayList;

public class Town extends Zone {
    ArrayList<Building> buildings = new ArrayList<Building>();

    public Town(String name, String desc){
        super(name, desc);
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }

    class Building{
        public String buildingName;
        public ArrayList<NPC> npcs = new ArrayList<NPC>();

        public Building(String name){
            buildingName = name;
        }

        public void addNPC(NPC npc){
            npcs.add(npc);
        }
    }
}
