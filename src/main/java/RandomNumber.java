import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {

    public static String generateRandomNumber() {
        List<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        int count = 4;
        String result = "";
        while ( count > 0 ) {
            int num = r.nextInt(10);
            if (!list.contains(num)) {
                list.add(num);
                result += num;
                count --;
            }
        }

        return  result;
    }
}
