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

    Cannon pCannon = new Cannon(this,width,height);

    @Override
    public void setup() {
        super.setup();
        duck1.loadimage();
        cac1.loadpic();
    }
    //Ducks duck1 = new Ducks(this);
    Cactus cac1 = new Cactus(this,200);
     Ducks duck1 = new Ducks(this,100, (int) random(20,100),5);
    @Override
    public void draw() {
        clear();
        pCannon.display();
        pCannon.checkInput();
        pCannon.move();
        duck1.drawduck();
        duck1.move();
        duck1.hitwall();
        cac1.drawcac();

}
}
