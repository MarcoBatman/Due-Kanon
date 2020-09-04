import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

import java.awt.*;

public class Cactus {
    PApplet p;
    PVector location = new PVector(0,100);
    PImage d;
    Cactus(PApplet p){
        this.p=p;

    }
    Cactus(PApplet p,int x){
       location.x=x;
       this.p=p;
    }
    void loadpic(){
        d = p.loadImage("New Catus.png");
    }

    void drawcac(){
        p.image(d,location.x,p.height-150,64*2,64*2);
    }
}
