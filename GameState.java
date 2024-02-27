
import java.util.ArrayList;

public class GameState {
    private Room currentRoom;
    private ArrayList<Item> inventory;

    public GameState(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void grabItem(Item item) {
        inventory.add(item);
    }

    public void enterRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }

}
