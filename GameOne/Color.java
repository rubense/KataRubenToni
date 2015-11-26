package KataRubenToni.GameOne;

/**
 * Created by Ruben on 26/11/2015.
 */
public class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
