import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

import java.util.ArrayList;


public class Due_Kanon extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Due_Kanon");
    }

    int width = 500;
    int height = 500;
    ArrayList<Shit> shitlist= new ArrayList<Shit>();
    @Override
    public void settings() {
        super.settings();

        size(width, height);

    }
    Ducks duck1 = new Ducks(this, 100, (int) random(20, 100), 5);
    Cactus cac1 = new Cactus(this,200);

    Cannon pCannon = new Cannon(this,width,height);
    Barrel pBarrel = new Barrel(this,pCannon);

    @Override
    public void setup() {
        super.setup();
        duck1.loadimage();
        cac1.loadpic();
        pCannon.loadimage();
    }


    @Override
    public void draw() {
        clear();
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
        }
        cac1.drawcac();
        pCannon.display();
        pCannon.checkVel();
        pCannon.move();
        pBarrel.cannonPlacement();




    }

    public void keyPressed() {

        pCannon.setMove(keyCode, true);


    }

    public void keyReleased() {

        pCannon.setMove(keyCode, false);

    }
}


