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
        x= c.CLocation.x+26*(float)1.75;
        y= c.CLocation.y-25/2;
    }
void display(){
p.image(iL.barrel,x,y);

}
}
