import processing.core.PApplet;
import processing.core.PImage;

public class imageLoader {
    PApplet p;
    PImage tank,dl,dr,d;
    imageLoader(PApplet p){
        this.p=p;

    }
void load(){
    tank = p.loadImage("TankTrimmed.png");
    tank.resize(26*4,25*4);
    dl = p.loadImage("Duck Duck Go Left.png");
    dr = p.loadImage("Duck Duck Go Right.png");
    d = p.loadImage("New Catus.png");

}

}
