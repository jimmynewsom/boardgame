package DND.Actors;

import DND.Actors.Classes.Class;
import DND.Actors.Races.Race;

import java.util.ArrayList;

public class NPC extends Character {
    private ArrayList<String> respondsTo;
    private ArrayList<String[]> respondsWith;

    public NPC(String name, Race race, Class dndclass){
        super(name, race, dndclass);
        respondsTo = new ArrayList<String>();
        respondsWith = new ArrayList<String[]>();
    }

    public void addLine(String prompt, String[] response){
        respondsTo.add(prompt);
        respondsWith.add(response);
    }

    public void removeLine(int i){
        //kind of a hack, but I doubt I'll ever use this method
        respondsTo.remove(i);
        respondsWith.remove(i);
    }

    public String[] getPrompts(){
        return (String[]) respondsTo.toArray();
    }

    public String[] getResponse(int inputPrompt){
        return respondsWith.get(inputPrompt);
    }
}
