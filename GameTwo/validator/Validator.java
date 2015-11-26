package KataRubenToni.GameTwo.validator;

/**
 * Created by toni on 26/11/15.
 */
public interface Validator<E,M> {
    boolean isValid(E entity);
    M getValid() throws NumberValidator.BetterCallFirstIsValidMethodException;
}
