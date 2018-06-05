package DND.Items;

public abstract class Item {
    public final String itemName;
    public final String description;
    public final int weight, cost;

    Item(String name, String desc, int w, int c){
        itemName = name;
        description = desc;
        weight = w;
        cost = c;
    }
}