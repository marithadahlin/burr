
import burr.GameRules;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class GameRulesTest {
    private int nrOfPLayers;
    private int divider;
    private GameRules gr;

    /*
    Setup class for this test.
     */
    
    public void setUp(){
        nrOfPLayers = 35;
        divider = 13;
        gr = new GameRules(nrOfPLayers,divider);
    }

    /*
    The current number must be a positive one to make the game work.
     */
    @Test
    public void testCurrentNumber(){
        assert (gr.getCurrentNumber()>0);
    }

    /*
    The increaseNumber method is used to
     */
    @Test
    public void testIncreaseCurrentNumber() {
        int cn = gr.getCurrentNumber();
        gr.increaseCurrentNumber();
        assertEquals(gr.getCurrentNumber(),cn+1);
    }
}