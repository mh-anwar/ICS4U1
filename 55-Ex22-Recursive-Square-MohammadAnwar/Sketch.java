import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        background(152, 190, 100);
    }

    public void draw() {
        drawSquares(10, 10, 600, 6);

    }

    public void drawSquares(int x, int y, int size, int level) {
        noFill();
        rect(x, y, size, size);
        if (level > 1) {
            level -= 1;
            drawSquares(x, y, (size / 2) - (size / 10), level);
            drawSquares(x, y + (size / 2), (size / 2) - (size / 10), level);
            drawSquares(x + (size / 2), y, (size / 2) - (size / 10), level);
            drawSquares(x + (size / 2), y + (size / 2), (size / 2) - (size / 10), level);

        }
    }
}