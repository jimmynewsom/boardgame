import java.util.ArrayList;

public class NPC {
    private String name;
    private ArrayList<String> respondsTo;
    private ArrayList<String[]> respondsWith;

    public NPC(String n){
        name = n;
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
    }
    /*
    public String[] getPrompts(){
        return respondsTo.toArray();
    }
    */

    public String[] getResponses(int inputPrompt){
        return respondsWith.get(inputPrompt);
    }
}
