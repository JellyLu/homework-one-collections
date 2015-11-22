import java.util.ArrayList;
import java.util.List;

public class CollectionsOps {

    public static List<Integer> odd(List<Integer> numbers) {
        List<Integer> resultNumbers = new ArrayList<Integer>();
        for ( int current: numbers ) {
            if (current % 2 == 1) resultNumbers.add(current);
        }


        return resultNumbers;
    }

    public static List<Integer> doubleEvens(List<Integer> numbers) {
        List<Integer> resultNumbers = numbers;
        int len = numbers.size();
        for ( int i = 0; i < len; ++i ) {
            if (numbers.get(i) % 2 == 0) {
                int newNumber = numbers.get(i) * 2;
                resultNumbers.set(i, newNumber);
            }
        }

        return resultNumbers;
    }

    public static String tryFind(Integer toFind, List<Integer> numbers) {
        return numbers.indexOf( toFind ) == -1 ? "Not Found" : "Hello, " + toFind;
    }
}
