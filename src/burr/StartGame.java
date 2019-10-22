package burr;

/**
 * Created 
 */
public class StartGame {
    public void start() {
        GameRules gr = new GameRules(3,5);
        gr.startGame();
    }
}