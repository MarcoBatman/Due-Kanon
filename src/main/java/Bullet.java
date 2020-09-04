import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Bullet {
    PVector bLocation = new PVector();
    PVector bVelocity = new PVector(5,0);
    PVector cLocation = new PVector();
    PVector actualLocation = new PVector();
    imageLoader iL;
    PApplet p;
    float angle;
    ArrayList<Ducks> duckList;

    Bullet(float a, float x, float y, PApplet p,imageLoader iL,ArrayList<Ducks>aD){
         angle=a;
         cLocation.x = x;
         cLocation.y=y;
         this.p = p;
         this.iL = iL;
duckList = aD;
    }

    void checkCollide(){
      actualLocation.set(p.cos(angle)*bLocation.x+cLocation.x,p.sin(angle)*bLocation.x+cLocation.x);
        System.out.println(actualLocation);
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
    boolean move(){

        bLocation.add(bVelocity);
    if(bLocation.x>1830/2)
        return true;
    else return false;

    }
}
