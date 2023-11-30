import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(800, 800);

    }
    // circle recursion from learning processing d. shiffman.

    public void ssetup() {

    }

    public void draw() {
        if (mousePressed == true) {
            fill(150, 0, 0);
            strokeWeight(2);
            stroke(255, 15, 0);
            drawDifferentCircle(width / 2, height / 2, 300);
        } else {
            noFill();
            background(100, 130, 100);
            strokeWeight(0);
            stroke(255, 0, 0);
            drawCircle(width / 2, height / 2, 200);

        }
    }

    public void drawCircle(float x, float y, float radius) {
        ellipse(x, y, radius, radius);
        if (radius > 10) {

            drawCircle(x + radius / 2, y, radius / 2);
            drawCircle(x - radius / 2, y, radius / 2);
            stroke(0, 0, 100);
            drawCircle(x, y + radius / 2, radius / 2);
            drawCircle(x, y - radius / 2, radius / 2);
        }
    }

    public void drawDifferentCircle(float x, float y, float radius) {
        ellipse(x, y, radius, radius);
        if (radius > 10) {

            drawCircle(x + radius / 2, y, radius / 2);
            drawCircle(x - radius / 2, y, radius / 2);
            stroke(0, 0, 100);
            drawCircle(x, y + radius / 4, radius / 2);
            drawCircle(x, y - radius / 4, radius / 2);
        }
    }

}
