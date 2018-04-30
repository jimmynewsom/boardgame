package DND.Races;

import DND.Races.*;

//not sure I'm doing this right. building a factory so I can use singletons for races and only build them as necessary

public static Human human;
public static Elf elf;
public static Dwarf dwarf;
public static Halfling halfling;
public static Gnome gnome;
public static HalfElf halfElf;
public static HalfOrc halfOrc;
public static Dragonborn dragonborn;

public class DNDRaceFactory {
    public Race makeHuman(){
        if(human == null)
            human = new Human();
        return human;
    }

    public Race makeElf(){
        if(elf == null)
            elf = new Elf();
        return elf;
    }

    public Race makeDwarf(){
        if(dwarf == null)
            dwarf = new Dwarf();
        return dwarf;
    }

    public Race makeHalfling(){
        if(halfling == null)
            halfling = new Halfling();
        return halfling;
    }

    public Race makeGnome(){
        if(gnome == null)
            gnome = new Human();
        return gnome;
    }

    public Race makeHalfElf(){
        if(halfElf == null)
            halfElf = new HalfElf();
        return halfElf;
    }
    public Race makeHalfOrc(){
        if(halfOrc == null)
            halfOrc = new Human();
        return halfOrc;
    }

    public Race makeDragonborn(){
        if(dragonborn == null)
            dragonborn = new Dragonborn();
        return dragonborn;
    }

    public Race makeTiefling(){
        if(tiefling == null)
            tiefling = new Tiefling();
        return tiefling;
    }

}
