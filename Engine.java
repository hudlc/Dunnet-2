
import java.util.Scanner;

public class Engine {
    GameState gameState;
    Scanner myObj;
    Parser parser;

    public Engine(GameState gameState) {
        myObj = new Scanner(System.in);
        this.gameState = gameState;
        this.parser = new Parser();
    }

    public void run() {
        System.out.println("\033[H\033[2J" + "Welcome to Dunnet 2, type 'help' to see how to play");
        // enters a infinite loop
        while (true) {
            // reads the user's input
            String input = myObj.nextLine();
            // converts all strings chars to lower case
            input.toLowerCase();
            // splits the input intro various strings
            String[] inputArray = input.split(" ", 0);
            // parse the commands
            System.out.println(parser.parseCommand(gameState, inputArray));
            // prints the first and second word on the console
            if (inputArray[0] == "quit") {
                break;
            }
        }
    }
}
