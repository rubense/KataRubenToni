package KataRubenToni.validator;

import java.util.Scanner;

/**
 * Created by toni on 26/11/15.
 */
public class ValidatorManager {

    public static Validator valid(Validator<String, ?> validator, String errorMessage, Scanner sc){
        while (!validator.isValid(sc.nextLine())){
            System.out.println(errorMessage);
        }

        return validator;
    }
}
