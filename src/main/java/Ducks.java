import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Ducks {
    imageLoader iL;
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

    Ducks(PApplet p,int x,int y,int speedX,imageLoader iL){
       location.set(x,y);
       this.p =p;
       velocity.set(speedX,0);
        this.iL = iL;
    }

    void drawduck(){
        if(velocity.x<0){
            p.image(iL.dl,location.x,location.y,64,64);

        }
        if(velocity.x>=0){
            p.image(iL.dr,location.x,location.y-10,64,64);
        }
    }


    void move(){
        location.add(velocity);
    }
    void hitwall(){
        if(location.x> p.width-64||location.x<0){
            velocity.mult(-1);
        }
    }
    void shit(){

        
    }



}
