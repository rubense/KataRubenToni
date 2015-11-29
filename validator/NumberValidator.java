package KataRubenToni.validator;

/**
 * Created by toni on 26/11/15.
 */
public class NumberValidator implements Validator<String, Integer> {

    private boolean hasCallFirstIsValidMethod = false;
    private int validData;

    public void setHasCallFirstIsValidMethod(boolean hasCallFirstIsValidMethod) {
        this.hasCallFirstIsValidMethod = hasCallFirstIsValidMethod;
    }

    @Override
    public boolean isValid(String entity) {
        try{
            hasCallFirstIsValidMethod = true;
            return (validData = Integer.parseInt(entity)) >= 0;
        }catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * You must call first #isValid method.
     *
     * @return
     */
    @Override
    public Integer getValid() throws BetterCallFirstIsValidMethodException {
        if(!hasCallFirstIsValidMethod){
            throw new BetterCallFirstIsValidMethodException("You must call first isValid method");
        }
        hasCallFirstIsValidMethod = false;
        return this.validData;
    }
}
