import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(700, 700);
    }

    public void setup() {
    }

    public void draw() {
        translate(width / 2, height / 2); // sets the 0,0 point to be the centre of the screen

        drawTriangle(0f, -200f*2.5f, 173f*2.5f, 100f*2.5f, -173f*2.5f, 100f*2.5f,8);

    }

    public void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3, float level) {

        //textSize(15);
        //fill(0, 0, 0);
        // My testing suitess
        // text(". X1 (" + x1 + ", " + y1 + ")", x1, y1);
        // text(". X2 (" + x2 + ", " + y2 + ")", x2, y2);
        // text(". X3 (" + x3 + ", " + y3 + ")", x3, y3);
        // text(". X1 " + round(x1), x1, y1);
        // text(". X2 " + round(x2), x2, y2);
        // text(". X3 " + round(x3), x3, y3);
        // text(".1 ", x1, y1);
        // text(".2 ", x2, y2);
        // text(".3 ", x3, y3);

       fill(19*level, 41*level, 53*level);

        triangle(x1, y1, x2, y2, x3, y3);

        if (level > 1) {
            level -= 1;
            float firstX;
            float firstY;

            float secondX;
            float secondY;

            float thirdX;
            float thirdY;

            // This is the TOP triangle
            firstX = x1;
            firstY = y1;

            secondX = x1 + abs(abs(x3) - abs(x1)) / 3;
            secondY = y1 + (y2 - y1) / 3;

            thirdX = x1 + (x3 - x1) / 3;
            thirdY = secondY;

            drawTriangle(firstX, firstY, secondX, secondY, thirdX,
                    thirdY, level);

            // 3rd Row MOSt Left
            // right most point
            secondX = x3 + ((x2 - x3) / 3);
            secondY = y3;
            // left most point
            thirdX = x3;
            thirdY = y3;
            // top most point
            firstX = (thirdX + secondX) / 2;
            firstY = (y2 + y3) / 3 + y1 / 3;
            drawTriangle(firstX, firstY, secondX, secondY, thirdX,
                    thirdY, level);

            // 3rd Row Middle
            // right most point
            secondX = x2 - (x2 - x3) / 3;
            secondY = y2;
            // left most point
            thirdX = x3 + ((x2 - x3) / 3);
            thirdY = y3;
            // top most point
            firstX = (secondX + thirdX) / 2;
            firstY = ((y2 + y3) / 3) + y1 / 3;
            drawTriangle(firstX, firstY, secondX, secondY, thirdX,
                    thirdY, level);

            // 3rd Row Farthest Right
            // Right most point
            secondX = x2;
            secondY = y2;
            // Left most point - two thirds (from the left of the triangle)
            thirdX = x2 - (x2 - x3) / 3;
            thirdY = y2;
            // Top most point
            firstX = (secondX + thirdX) / 2;
            firstY = (y2 + y3) / 3 + y1 / 3;

            drawTriangle(firstX, firstY, secondX, secondY, thirdX,
                    thirdY, level);

            // 2nd Row Right
            secondX = (x2 + x2 - (x2 - x3) / 3)/2;
            secondY = (y2 + y3) / 3 + y1 / 3;
            thirdX = x1;
            thirdY = secondY;
            firstX = (secondX + thirdX) / 2;
            firstY = y1 + (y2 - y1) / 3;
            drawTriangle(firstX, firstY, secondX, secondY,
                    thirdX, thirdY, level);

            // 2nd Row Left
            secondX = x1;
            secondY = (y2 + y3) / 3 + y1 / 3;
            // left most point
            thirdX = (x3 + x3 - (x3-x2) / 3)/2;
            thirdY = secondY;
            firstX = (secondX + thirdX) / 2;
            firstY = y1 + (y2 - y1) / 3;
            drawTriangle(firstX, firstY, secondX, secondY, thirdX,
                    thirdY, level);
        }
    }
}
/*
 * // 2nd Row Middle
 * // First x, y must be middle of triangle
 * firstX = x1;
 * firstY = (y2 + y3) / 2 + y1 / 2;
 * 
 * secondX = (x2 + x1) / 3;
 * secondY = (y2 + y1);
 * 
 * thirdX = -(abs(x3) + x1) / 3;
 * thirdY = (y3 + y1);
 * 
 * // 3rd Row Left
 * // in first iteration this is 0,0
 * // right most point
 * firstX = x1;
 * firstY = (y2 + y3) / 2 + y1 / 2;
 * 
 * // bottom most point, touches the bottom triangle
 * secondX = -(abs(x3) + x1) / 3;
 * secondY = y3;
 * // left most point
 * thirdX = -(abs(x3) + x2) / 3;
 * thirdY = (y2 + y3) / 2 + y1 / 2;
 * 
 * drawTriangle(firstX, firstY, secondX, secondY, thirdX,
 * thirdY, level);
 * 
 * // 3rd Row Right
 * // in first iteration this is 0,0
 * firstX = x1;
 * firstY = (y2 + y3) / 2 + y1 / 2;
 * 
 * secondX = (x2 + x1) / 3;
 * secondY = y2;
 * 
 * thirdX = (abs(x3) + x2) / 3;
 * thirdY = (y2 + y3) / 2 + y1 / 2;
 * 
 * drawTriangle(firstX, firstY, secondX, secondY,
 * thirdX,thirdY, level);
 * 
 */