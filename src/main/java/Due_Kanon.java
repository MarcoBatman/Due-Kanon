import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Due_Kanon extends PApplet{
    public static void main(String[] args ) {
        PApplet.main("Due_Kanon");
    }
    PImage duckpic;
    Ducks duck1 = new Ducks(this,duckpic);

    @Override
    public void settings() {
        super.settings();
        size(500,500);
    }
    Cannon pCannon = new Cannon(this,width,height);

    @Override
    public void setup() {
        super.setup();
        duckpic = loadImage("Duck Duck go.png");

    }

    @Override
    public void draw() {
        pCannon.display();
        duck1.drawduck();

}
}
