import processing.core.PApplet;
import processing.core.PImage;

public class imageLoader {
    PApplet p;
    PImage tank,dl,dr,d,sky,barrel;
    imageLoader(PApplet p){
        this.p=p;

    }
void load(){
    barrel = p.loadImage("Barrel.png");
    barrel.resize(7*4,17*4);
    tank = p.loadImage("TankTrimmed.png");
    tank.resize(26*4,25*4);
    dl = p.loadImage("Duck Duck Go Left.png");
    dr = p.loadImage("Duck Duck Go Right.png");
    d = p.loadImage("New Catus.png");
    sky =  p.loadImage("skycool.png");
    sky.resize(1830/2,873/2);


}

}
