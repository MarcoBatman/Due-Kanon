import processing.core.PApplet;
import processing.core.PVector;

public class Shit {

PApplet p;
PVector location = new PVector();
PVector velocity = new PVector(0,2);




    Shit(PApplet p,float x, float y){
        this.p=p;
        location.x=x+31;
        location.y=y+20;

    }

    void drawshit(){

        p.ellipse(location.x,location.y,10,10);
    }
    void moveshit(){

    location.add(velocity);
    }

}

