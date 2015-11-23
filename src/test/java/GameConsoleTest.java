import org.junit.Test;

public class GameConsoleTest {
    private  GameConsole gameConsole;

    @Test
    public void setUp() throws Exception {
        gameConsole = new GameConsole();
    }

    @Test
    public void test_console_when_win_game() throws Exception {
        boolean win = true;

        gameConsole.outPutInConsole( win );


    }

    @Test
    public void test_console_when_lose_game() throws Exception {
        boolean win = false;

        gameConsole.outPutInConsole( win );


    }

}
