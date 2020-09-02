import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Ducks {
    int posX;
    int posY;
    PImage d;



    PVector location = new PVector(posX,posY);
    PVector Velocity = new PVector();
    PApplet p;
    Ducks(PApplet p, PImage d){
this.p=p;
this.d=d;
posY=0;
posX=0;
    }

    Ducks(PApplet p,int x,int y,PImage d){
       posX = x;
       posY = y;
       this.p =p;
       this.d = d;

    }

    void drawduck(){

    p.image(d,100,100,64,64);

    }






}
