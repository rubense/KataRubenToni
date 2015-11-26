package GameTwo.validator;

/**
 * Created by toni on 26/11/15.
 */
public class NumberValidator implements Validator<String, Integer> {

    private boolean hasCallFirstIsValidMethod = false;
    private int model;

    @Override
    public boolean isValid(String entity) {
        try{
            hasCallFirstIsValidMethod = true;
            return (model = Integer.parseInt(entity)) >= 0;
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
        return this.model;
    }

    class BetterCallFirstIsValidMethodException extends Exception{
        public BetterCallFirstIsValidMethodException() {
        }

        public BetterCallFirstIsValidMethodException(String message) {
            super(message);
        }

        public BetterCallFirstIsValidMethodException(String message, Throwable cause) {
            super(message, cause);
        }

        public BetterCallFirstIsValidMethodException(Throwable cause) {
            super(cause);
        }

        public BetterCallFirstIsValidMethodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
