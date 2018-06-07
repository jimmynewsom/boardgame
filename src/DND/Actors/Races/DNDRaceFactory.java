package DND.Actors.Races;

import DND.Actors.Monster;

//building a factory so I can have instance control for my player/npc races
//not sure I'm doing this right though. Maybe static factory methods would be better?

public class DNDRaceFactory {
    public static Human human;
    public static Elf elf;
    public static Dwarf dwarf;
    public static Halfling halfling;
    public static Gnome gnome;
    public static HalfElf halfElf;
    public static HalfOrc halfOrc;
    public static Dragonborn blackdb, bluedb, brassdb, bronzedb, copperdb, golddb, greendb, reddb, silverdb, whitedb;
    public static Tiefling tiefling;

    //should there be one method with a string? but that just feels ugly.......

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
            gnome = new Gnome();
        return gnome;
    }

    public Race makeHalfElf(){
        if(halfElf == null)
            halfElf = new HalfElf();
        return halfElf;
    }
    public Race makeHalfOrc(){
        if(halfOrc == null)
            halfOrc = new HalfOrc();
        return halfOrc;
    }

    //I need different instances for different colors, so this cant be a singleton
    public Race makeDragonborn(Monster.Dragon.DragonColor color){
        switch (color){
            case BLACK:
                if(blackdb == null)
                    blackdb = new Dragonborn(Monster.Dragon.DragonColor.BLACK);
                return blackdb;
            case BLUE:
                if(bluedb == null)
                    bluedb = new Dragonborn(Monster.Dragon.DragonColor.BLUE);
                return bluedb;
            case BRASS:
                if(brassdb == null)
                    brassdb = new Dragonborn(Monster.Dragon.DragonColor.BRASS);
                return brassdb;
            case BRONZE:
                if(bronzedb == null)
                    bronzedb = new Dragonborn(Monster.Dragon.DragonColor.BRONZE);
                return bronzedb;
            case COPPER:
                if(copperdb == null)
                    copperdb = new Dragonborn(Monster.Dragon.DragonColor.COPPER);
                return copperdb;
            case GOLD:
                if(golddb == null)
                    golddb = new Dragonborn(Monster.Dragon.DragonColor.GOLD);
                return golddb;
            case GREEN:
                if(greendb == null)
                    greendb = new Dragonborn(Monster.Dragon.DragonColor.GREEN);
                return greendb;
            case RED:
                if(reddb == null)
                    reddb = new Dragonborn(Monster.Dragon.DragonColor.RED);
                return reddb;
            case SILVER:
                if(silverdb == null)
                    silverdb = new Dragonborn(Monster.Dragon.DragonColor.SILVER);
                return silverdb;
            case WHITE:
                if(whitedb == null)
                    whitedb = new Dragonborn(Monster.Dragon.DragonColor.WHITE);
                return whitedb;
            default:
                return null;
        }
    }

    public Race makeTiefling(){
        if(tiefling == null)
            tiefling = new Tiefling();
        return tiefling;
    }

}
