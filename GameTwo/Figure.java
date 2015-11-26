package GameTwo;

/**
 * Created by toni on 26/11/15.
 */
public abstract class Figure {

    protected int height;
    protected int width;
    protected String name;

    public Figure(int height, int width) {
        this.height = height;
        this.width = width;
        this.name = "Triangle";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract String[][] draw();

    @Override
    public String toString() {
        return "Figure: "+name+" Height: "+ height + " Width: "+width;
    }
}
