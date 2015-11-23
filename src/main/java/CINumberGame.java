import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CINumberGame {

    final RandomNumber randomNumberObj;
    final NumberGame   numberGame;

    public CINumberGame( RandomNumber randomNumber, NumberGame numberGame ){
        this.randomNumberObj = randomNumber;
        this.numberGame = numberGame;
    }

    public  String playNumberGame( String inputNumber ) {

       if ( inputNumber.length() == 4 && isNumber(inputNumber) ) {
           return NumberGame.compareNumbers(inputNumber, randomNumberObj.generateRandomNumber());
       }
        return null;
    }

    private static boolean isNumber(String string){
        try{
            parseInt(string);
            return true;
        }catch ( NumberFormatException exception){
            return false;
        }
    }


}
