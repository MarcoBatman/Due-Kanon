import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Due_Kanon extends PApplet{
    public static void main(String[] args ) {
        PApplet.main("Due_Kanon");
    }

    PImage coolduck;


    @Override
    public void settings() {
        super.settings();
        size(500,500);
    }
    Cannon pCannon = new Cannon(this,width,height);

    @Override
    public void setup() {
        super.setup();
        coolduck = loadImage("Duck Duck Go.png");

    }

    Ducks duck1 = new Ducks(this,100,100, coolduck);
    @Override
    public void draw() {

        pCannon.display();
        duck1.drawduck();

}
}
