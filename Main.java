
public class Main {
    public static void main(String[] args) {
        GameState gameEstate = new GameState(Stage1.initialize());
        Engine gameEngine = new Engine(gameEstate);
        gameEngine.run();
    }
}
