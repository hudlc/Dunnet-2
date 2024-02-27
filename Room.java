import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Room {
    private String name;
    private String description;
    private HashMap<String, Room> exits;
    private ArrayList<Item> items;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.exits = new HashMap<String, Room>();
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void addExit(String exit, Room room) {
        exits.put(exit, room);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public HashMap<String, Room> getExits() {
        return exits;
    }

    public Set<String> listExits() {
        return exits.keySet();
    }
}
