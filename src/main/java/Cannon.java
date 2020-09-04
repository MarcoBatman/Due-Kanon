import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Cannon {
    PApplet p;
    boolean dUp, dDown, dLeft, dRight;
    int width;
    int height;
    PImage tank;
    PVector CVelocity = new PVector(1, 0);
    PVector CLocation = new PVector();


    Cannon(PApplet p, int width, int height) {
        this.p = p;
        this.height = height;
        this.width = width;
        p.println(width);
        CLocation.set(width / 2, height - 120);


    }

    void checkVel() {
        int mX = 0;
        int mY = 0;

        if (dUp) mY -= 1;
        if (dDown) mY += 1;
        if (dLeft) {
            if (CLocation.x == 0) {
                mX += 1;
            }
            mX -= 1;
        }
        if (dRight) {
            if (CLocation.x + 26 * 4 == width) {
                mX -= 1;
            }
            mX += 1;
        }

        CVelocity.set(mX, mY);
        //p.println(mX);
    }


    void move() {

        CLocation.add(CVelocity);
    }

    void loadimage() {

        tank = p.loadImage("TankTrimmed.png");
        tank.resize(26 * 4, 25 * 4);
    }

    void display() {
        p.image(tank, CLocation.x, CLocation.y);
//p.ellipse(CLocation.x,CLocation.y,100,100);


    }

    boolean setMove(int k, boolean b) {


        switch (k) {
        /*  case +'W':
          case 38:
            return dUp = b;

          case +'S':
          case 40:
            return dDown = b;
*/
            case +'A':
            case 37:
                return dLeft = b;

            case +'D':
            case 39:
                return dRight = b;

            default:
                return b;
        }

    }

}


