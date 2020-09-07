import processing.core.PApplet;
import processing.core.PImage;

public class ImageLoader {
    PApplet p;
    PImage tank,dl,dr,d,sky,barrel,bulletdue;
    ImageLoader(PApplet p){
        this.p=p;

    }
    void load(){
        barrel = p.loadImage("Barrelmiddle.png");
        barrel.resize(7*3,17*2*3);
        tank = p.loadImage("TankTrimmed.png");
        tank.resize(26*3,25*3);
        dl = p.loadImage("Duck Duck Go Left Trim.png");
        dr = p.loadImage("Duck Duck Go Right Trim.png");
        d = p.loadImage("New Catus.png");
        d.resize(64*2,64*2);
        sky =  p.loadImage("skycool.png");
        sky.resize(1830/2,873/2);
        bulletdue = p.loadImage("Bullet due.png");
        bulletdue.resize(61,34);




    }

}
