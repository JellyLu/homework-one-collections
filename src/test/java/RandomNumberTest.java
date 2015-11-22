import org.junit.Test;

import java.util.HashSet;

//import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class RandomNumberTest {

    private  RandomNumber randomNumberObj;
    @Test
    public void setUp() throws Exception {
        randomNumberObj = new RandomNumber();
    }

    @Test
    public void test_random_number_length_equalto_4() throws Exception {
        String  randomNumber = randomNumberObj.generateRandomNumber();

        int randomNumLen = randomNumber.length();
        assertThat( randomNumLen, is( 4 ));
    }

    @Test
    public void test_random_number_no_repeat() throws Exception {
        String  randomNumber = randomNumberObj.generateRandomNumber();

        boolean result = randomNumber.chars().allMatch( Character::isDigit);
        assertThat( result, is(true) );
//        int len = randomNumber.length();
//        for ( int i = 0; i < len - 1; ++i ){
//            for ( int j = i+1; j < len; ++j ){
//                if ( randomNumber.charAt( i ) == randomNumber.charAt( j ) ){
//                    fail();
//                }
//            }
//        }
    }

    @Test
    public void test_random_number_each_number_is_int() throws Exception {

        String  randomNumber = randomNumberObj.generateRandomNumber();

        int count  = (int)randomNumber.chars().distinct().count();
        assertThat( count, is(4));

//        int len = randomNumber.length();
//        boolean isNumber = true;
//        for ( int i = 0; i < len - 1; ++i ){
//            if ( !Character.isDigit( randomNumber.charAt(i) ) ){
//                isNumber = false;
//                break;
//            }
//        }
//        assertThat( isNumber, is( true ));
    }

    @Test
    public void test_random_number_is_random_in_5_times() throws Exception {
        HashSet<String> randomNumbers = new HashSet<String>( );
        int times = 5;

        while ( times > 0 ) {
            randomNumbers.add(RandomNumber.generateRandomNumber());
            times --;
        }

        assertThat( randomNumbers.size(), is( 5 ));
    }

    @Test
    public void test_random_number_is_random_in_10_times() throws Exception {
        Set<String> randomNumbers = new HashSet<String>( );
        int times = 10;

        while ( times > 0 ) {
            randomNumbers.add(RandomNumber.generateRandomNumber());
            times --;
        }

        assertThat( randomNumbers.size(), is( 10 ));
    }

    @Test
    public void test_random_number_is_random_in_100_times() throws Exception {
        Set<String> randomNumbers = new HashSet<String>( );
        int times = 100;

        while ( times > 0 ) {
            randomNumbers.add(RandomNumber.generateRandomNumber());
            times --;
        }

        assertThat( randomNumbers.size(), is( 100 ));
    }

}
