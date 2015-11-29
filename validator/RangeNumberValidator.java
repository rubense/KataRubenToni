package KataRubenToni.validator;

/**
 * Created by Ruben on 29/11/2015.
 */
public class RangeNumberValidator extends NumberValidator{
    private int inferior;
    private int superior;

    public RangeNumberValidator(int inferior, int superior) {

        this.inferior = inferior;
        this.superior = superior;
    }


    @Override
    public boolean isValid(String entity) {
        boolean isValid = super.isValid(entity);
        try {
            int num = getValid();
            if (isValid && inferior <= num && num <= superior) {

                return true;
            } else
                return false;
        } catch (BetterCallFirstIsValidMethodException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Integer getValid() throws BetterCallFirstIsValidMethodException {
        setHasCallFirstIsValidMethod(true); //TONI REVISAR
        return super.getValid();
    }
}
