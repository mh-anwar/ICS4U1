import processing.core.PApplet;

public class Sketch extends PApplet {
    // Global variables
    int level = 6;
    int radius = 280;
    int x;

    public void settings() {
        size(800, 600); // width, heighet

    }

    public void setup() {
        background(152, 190, 100);
    }

    public void draw() {
        noStroke();
        drawCircle(width / 2, radius, level);
    }

    public void drawCircle(int x, int radius, int level) {
        float shade = 126 * level / 4.0f;
        fill(255, 0, 0);
        text("" + level, x, (height - 100) / level);
        fill(shade);
        ellipse(x, height / 2, radius * 2, radius * 2);
        if (level > 1) {
            level -= 1;
            drawCircle(x - radius / 2, radius / 2, level);
            drawCircle(x + radius / 2, radius / 2, level);
            // drawCircle(x, radius / 2, level, y - radius);
            // drawCircle(x, radius / 2, level, y + radius);
        }
    }

}
