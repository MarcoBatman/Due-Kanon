import processing.core.PApplet;
import processing.core.PVector;

public class Bullet {
    PVector bLocation = new PVector();
    PVector bVelocity = new PVector(5,0);
    PVector cLocation = new PVector();
    imageLoader iL;
    PApplet p;
    float angle;

    Bullet(float a, float x, float y, PApplet p,imageLoader iL){
         angle=a;
         cLocation.x = x;
         cLocation.y=y;
         this.p = p;
         this.iL = iL;

    }
    void display(){

        p.pushMatrix();
        p.imageMode(p.CENTER);
        p.translate(cLocation.x,cLocation.y);

        p.rotate(angle);
        p.image(iL.dr,bLocation.x,bLocation.y);
        p.imageMode(p.CORNER);
        p.popMatrix();



    }
    void move(){
bLocation.add(bVelocity);


    }
}
