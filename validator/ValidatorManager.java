package KataRubenToni.validator;

import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by toni on 26/11/15.
 */
public class ValidatorManager {

    public static Validator valid(Validator<String, ?> validator, String message, String errorMessage, Scanner sc){
        System.out.print(message);
        while (!validator.isValid(sc.nextLine())){
            System.out.println(errorMessage);
            System.out.print(message);
        }

        return validator;
    }
}
