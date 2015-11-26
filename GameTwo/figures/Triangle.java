package GameTwo.figures;

import GameTwo.Figure;

/**
 * Created by toni on 26/11/15.
 */
public class Triangle extends Figure {


    public Triangle(int height, int width) {
        super(height, width);
    }

    @Override
    public String[][] draw() {
        String[][] canvas = new String[height][width];
        String arg = "*";

        for (int i = 0; i < canvas.length; i++){
            for (int j = 0; j < canvas[i].length; j++){
                canvas[i][j] = arg;
            }
        }

        return canvas;
    }
}
