import processing.core.PApplet;
import processing.core.PVector;

public class Shit {

PApplet p;
PVector location = new PVector();
PVector velocity = new PVector(0,2);




    Shit(PApplet p,float x, float y){
        this.p=p;
        location.x=x;
        location.y=y;

    }

    void drawshit(){

        p.ellipse(location.x+31,location.y+20,10,10);
    }
    void moveshit(){

    location.add(velocity);
    }

}

