
import java.util.Set;

public class Parser {

    public String parseCommand(GameState gameState, String[] command) {
        String response = "Invalid command, press 'help' to see commands";
        Room currentRoom = gameState.getCurrentRoom();

        if (command[0].equals("help")) {
            response = "1 - Type 'go' + 'direction' to go somewhere (example:go left)\n";
            response += "2 - Type 'look around' to get information on the current room\n";
            response += "3 - Type 'exits' to se where you can go from that room\n";
            response += "4 - Type 'quit' to exit the game";
        }

        if (command.length > 1 && command[0].equals("look") && command[1].equals("around")) {
            response = "You are in a " + currentRoom.getName() + ", "
                    + currentRoom.getDescription();
        }

        if (command[0].equals("go")) {
            if (currentRoom.getExits().get(command[1]) != null && command.length > 1) {
                gameState.enterRoom(currentRoom.getExits().get(command[1]));
                response = "You enter that room";
            } else {
                response = "Invalid exit";
            }
        }

        if (command[0].equals("exits")) {
            response = "Your can go: ";
            Set<String> exits = currentRoom.listExits();
            for (String exit : exits) {
                response += exit + ", ";
            }
        }

        if (command[0].equals("quit")) {
            response = "Thanks for playing";
        }
        // special char sequence to clear the console before the response
        return "\033[H\033[2J" + response;
    }

}
