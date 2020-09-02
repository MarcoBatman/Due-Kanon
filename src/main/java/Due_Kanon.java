import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;


public class Due_Kanon extends PApplet{
    public static void main(String[] args ) {
        PApplet.main("Due_Kanon");
    }
    PImage duckpic;
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
        duckpic = loadImage("Duck Duck go.png");

    }
  //  Ducks duck1 = new Ducks(this,duckpic);

    @Override
    public void draw() {
        clear();
        pCannon.display();
        pCannon.checkInput();
        pCannon.move();
     //   duck1.drawduck();

}
}
