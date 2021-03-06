
import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Barrel {
    ArrayList<Ducks> duckList;
    ArrayList<Cactus> cacList;
    PVector bLocation = new PVector();
    PVector vMouse = new PVector();
   float x,y;
   float angle;
    Cannon c;
    PApplet p;

    ImageLoader iL;
    int score;

    ArrayList<Bullet> bullets = new ArrayList<Bullet>();

    Barrel(PApplet p,Cannon c,ImageLoader iL,ArrayList<Ducks> aD,int score,ArrayList<Cactus> aC){

        this.c=c;
        this.p = p;
        this.iL = iL;
        duckList=aD;
        cacList= aC;
        this.score=score;

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

        if(bullets.size()==0)
bullets.add(new Bullet(angle-p.radians(90),bLocation.x,bLocation.y,p,iL,duckList,score,cacList));





    }


boolean display(){

    p.pushMatrix();
    p.imageMode(p.CENTER);
    p.translate(bLocation.x,bLocation.y);
    //p.println(angle);
    p.rotate(angle);

    p.image(iL.barrel,0,0);
    p.imageMode(p.CORNER);
    p.popMatrix();

    for(int i=0;i<bullets.size();i++) {
      /*
        if(score<bullets.get(i).score){
        score = bullets.get(i).score;
        }*/
        bullets.get(i).display();
        int checkScore = bullets.get(i).checkCollide();
        if(checkScore!=0) {

            if(checkScore==1){
                bullets.remove(i);
                System.out.println("Bruh");
                return true;}
            else{
                bullets.remove(i);
                return false;}
        }
      if(bullets.get(i).move()==true) {

          bullets.remove(i);
          return false;
      }

    }


    return false;
}
}
