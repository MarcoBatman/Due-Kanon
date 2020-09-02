import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Ducks {
    int posX;
    int posY;
    PImage duck;
    PVector location = new PVector(posX,posY);
    PVector Velocity = new PVector();
    PApplet p;
    Ducks(PApplet p, PImage duck){
this.p=p;
this.duck=duck;
posY=0;
posX=0;
    }

    Ducks(PApplet p,int x,int y,PImage i){
       posX = x;
       posY = y;
       this.p =p;
       duck = i;

    }

    void drawduck(){

    p.image(duck,location.x,location.y);

    }






}
