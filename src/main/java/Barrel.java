import processing.core.PApplet;

public class Barrel {
   float x,y;
    Cannon c;
    PApplet p;
    imageLoader iL;
    Barrel(PApplet p,Cannon c,imageLoader iL){
        this.c=c;
        this.p = p;
        this.iL = iL;
    }

    Barrel(){
    }

    void cannonPlacement(){
        x= c.CLocation.x;

    }
void display(){


}
}
