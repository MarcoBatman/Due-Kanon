import processing.core.PApplet;
import processing.core.PVector;

public class Shit {

PApplet p;
PVector location = new PVector();
PVector velocity = new PVector();
PVector accelaration = new PVector(0,1);



    Shit(PApplet p,float x, float y){
        this.p=p;
        location.x=x;
        location.y=y;

    }
    void drawshit(){
        p.ellipse(location.x,location.y,10,10);
    }
    void moveshit(){
    velocity.add(accelaration);
    location.add(velocity);
    }
}

