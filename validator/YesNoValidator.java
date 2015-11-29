package KataRubenToni.validator;

/**
 * Created by Ruben on 29/11/2015.
 */
public class YesNoValidator implements Validator<String, String> {
    private boolean hasCallFirstValidMethod = false;
    private boolean isYes;
    private String validData;

    public boolean getIsYes() {return isYes;}


    @Override
    public boolean isValid(String entity) {
        hasCallFirstValidMethod = true;
        boolean isValid = false;
        entity = entity.toLowerCase();
        switch (entity) {
            case "yes":
            case "y":
                validData = entity;
                isYes = true;
                isValid = true;
                break;
            case "no":
            case "n":
                validData = entity;
                isYes = false;
                isValid = true;
                break;
        }
        return isValid;
    }

    @Override
    public String getValid() throws BetterCallFirstIsValidMethodException {
        if(!hasCallFirstValidMethod) {
            throw new BetterCallFirstIsValidMethodException("You must call first isValid method");
        }
        hasCallFirstValidMethod = false;
        return this.validData;
    }
}
