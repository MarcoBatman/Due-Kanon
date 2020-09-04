import processing.core.PApplet;

public class Barrel {
   float x,y;
    Cannon c;
    PApplet p;
    Barrel(PApplet p,Cannon c){
        this.c=c;
        this.p = p;

    }

    Barrel(){
    }

    void cannonPlacement(){
        x= c.CLocation.x;

    }
void display(){

     //   image
}
}
