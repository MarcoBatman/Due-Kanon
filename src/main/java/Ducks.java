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
    int shitRNG;
    boolean iShitNow = false;
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
        p.imageMode(p.CORNER);
        if(velocity.x<0){
            p.image(iL.dl,location.x,location.y,61,34);

        }
        if(velocity.x>=0){
            p.image(iL.dr,location.x,location.y,61,34);
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
    shitRNG = (int) p.random(0,69);
    if(shitRNG==0 && iShitNow == false){
        iShitNow=true;
    }
    else{
        iShitNow=false;
    }
      // p.println(iShitNow);
    }





}
