import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Barrel {
    PVector bLocation = new PVector();
    PVector vMouse = new PVector();
   float x,y;
   float angle;
    Cannon c;
    PApplet p;
    imageLoader iL;

    ArrayList<Bullet> bullets = new ArrayList<Bullet>();

    Barrel(PApplet p,Cannon c,imageLoader iL){
        this.c=c;
        this.p = p;
        this.iL = iL;
    }

    Barrel(){
    }

    void cannonPlacement(){

        bLocation.x= c.CLocation.x+26*(float)1.70;
        bLocation.y= c.CLocation.y+30;
        vMouse.set(p.mouseX,p.mouseY);
        vMouse.sub(bLocation);
        angle = vMouse.heading()+p.radians(90);


    }

    void shoot(){
bullets.add(new Bullet(angle-p.radians(90),bLocation.x,bLocation.y,p,iL));




    }


void display(){
    for(int i=0;i<bullets.size();i++) {
        bullets.get(i).move();
        bullets.get(i).display();
    }

    p.pushMatrix();
    p.imageMode(p.CENTER);
    p.translate(bLocation.x,bLocation.y);
    p.println(angle);
    p.rotate(angle);

p.image(iL.barrel,0,0);
p.imageMode(p.CORNER);
    p.popMatrix();
}
}
