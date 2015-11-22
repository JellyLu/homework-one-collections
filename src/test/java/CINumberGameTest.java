import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CINumberGameTest {

    @Test
    public void test_input_numer_random_numer_game() throws Exception {
            String inputNumber = "1234";
            RandomNumber randomNumberObj = new RandomNumber();
            String randomNumber = randomNumberObj.generateRandomNumber();

            String result = NumberGame.compareNumbers(inputNumber, randomNumber );

            assertThat( result, equalTo("4A0B") );

    }
}
