import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Ducks {

    PImage dl;
    PImage dr;
    PVector location = new PVector();
    PVector velocity = new PVector();
    PApplet p;
    Ducks(PApplet p){
this.p=p;
location.set(0,0);
velocity.set(0,0);
    }

    Ducks(PApplet p,int x,int y,int speedX){
       location.set(x,y);
       this.p =p;
       velocity.set(speedX,0);
    }

    void drawduck(){
    p.image(dl,location.x,location.y,64,64);

     p.image(dr,location.x,location.y,64,64);
    }

    void loadimage(){
        dl = p.loadImage("Duck Duck Go Left.png");
        dr = p.loadImage("Duck Duck Go Right.png");
    }
    void move(){
        location.add(velocity);
    }



}
