import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

import java.awt.*;

public class Cactus {
    PApplet p;
    PVector location = new PVector(0,100);
    PImage d;
    imageLoader iL;
    Cactus(PApplet p){
        this.p=p;

    }
    Cactus(PApplet p,int x,imageLoader iL){
       location.x=x;
       this.p=p;
       this.iL = iL;
    }

    void drawcac(){
        p.image(iL.d,location.x,p.height-150,64*2,64*2);
    }
}
