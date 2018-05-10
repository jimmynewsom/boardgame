package DND.Actors;

import java.util.ArrayList;

public class NPC extends Character {
    private ArrayList<String> respondsTo;
    private ArrayList<String[]> respondsWith;

    public NPC(String name){
        super(name);
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
