package KataRubenToni.validator;

/**
 * Created by toni on 29/11/15.
 */
public class BetterCallFirstIsValidMethodException extends Exception{
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