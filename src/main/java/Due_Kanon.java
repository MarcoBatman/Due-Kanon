import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

import java.util.ArrayList;


public class Due_Kanon extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Due_Kanon");
    }
    boolean gameover = false;
    int width = 1830/2;
    int height = 873/2;
    ArrayList<Shit> shitlist= new ArrayList<Shit>();
    @Override
    public void settings() {
        super.settings();

        size(width, height);

    }
  

    @Override
    public void setup() {
        super.setup();
       iL.load();


    }

    imageLoader iL= new imageLoader(this);
    Cactus cac1 = new Cactus(this,200,iL);
    Ducks duck1 = new Ducks(this,100, (int) random(20,100),5,iL);
    Cannon pCannon = new Cannon(this,width,height,iL);
    Barrel pBarrel = new Barrel(this,pCannon,iL);

    @Override
    public void draw() {

        clear();
        image(iL.sky,0,0);
        cac1.drawcac();
        pCannon.display();
        pBarrel.display();
        pCannon.checkVel();
        pCannon.move();
        pBarrel.cannonPlacement();
        duck1.shit();
        duck1.drawduck();
        duck1.move();
        duck1.hitwall();

        if(duck1.iShitNow==true){
            shitlist.add(new Shit(this,duck1.location.x,duck1.location.y));
        }
        for(int i =0;i<shitlist.size();i++){
            shitlist.get(i).moveshit();
            shitlist.get(i).drawshit();
            if(shitlist.get(i).location.y>=height){
            //shitlist.remove(i);
            shitlist.get(i).hitTank(pCannon,gameover);
            }
        println(gameover);
        if(gameover == true){
            text("Du er blevet skidt på",width/2,height/2);
        }
        }






    }

    public void mousePressed(){
        if(mouseButton == LEFT){
            pBarrel.shoot();

        }
    }

    public void keyPressed() {

        pCannon.setMove(keyCode, true);


    }

    public void keyReleased() {

        pCannon.setMove(keyCode, false);

    }
}


