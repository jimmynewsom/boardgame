package DND.Zones;

//gonna use zones like nodes in a graph
public class Zone {
    private String zoneName, description;

    public Zone(String name, String desc){
        zoneName = name;
        description = desc;
    }

    public void describe() {
        System.out.println(description);
    }
}
