import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;


public class Due_Kanon extends PApplet{
    public static void main(String[] args ) {
        PApplet.main("Due_Kanon");
    }

    int width = 500;
    int height = 500;

    @Override
    public void settings() {
        super.settings();

        size(width,height);

    }


    @Override
    public void setup() {
        super.setup();
       iL.load();
        /*
        duck1.loadimage();
        cac1.loadpic();
        pCannon.loadimage();
        */

    }
    //Ducks duck1 = new Ducks(this);
    imageLoader iL= new imageLoader(this);;
    Cactus cac1 = new Cactus(this,200,iL);
    Ducks duck1 = new Ducks(this,100, (int) random(20,100),5,iL);
    Cannon pCannon = new Cannon(this,width,height,iL);
    Barrel pBarrel = new Barrel(this,pCannon,iL);
    @Override
    public void draw() {
        clear();

        pCannon.display();
        pCannon.checkVel();
        pCannon.move();
        pBarrel.cannonPlacement();
        duck1.drawduck();
        duck1.move();
        duck1.hitwall();
        cac1.drawcac();



}
    public void keyPressed() {

        pCannon.setMove(keyCode, true);


    }

    public void keyReleased() {

        pCannon.setMove(keyCode, false);

    }
}


