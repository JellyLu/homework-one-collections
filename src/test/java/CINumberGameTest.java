import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class CINumberGameTest {

    private  CINumberGame ciNumberGame;
    private  RandomNumber randomNumber;
    private  NumberGame   numberGame;
    private  Random       userInputNumber;

    @Before
    public void setUp() throws Exception{
        userInputNumber  = mock( Random.class );
        randomNumber     = new RandomNumber();
        numberGame       = new NumberGame();
        ciNumberGame     = new CINumberGame( randomNumber, numberGame );
    }

    @Test
    public void test_guess_number_game_success() throws Exception {
           when( userInputNumber.nextInt(10) ).thenReturn(1,2,3,4);

            String result = ciNumberGame.playNumberGame( "1234" );
            assertThat( result, is("4A0B") );
    }

}
