import processing.core.PApplet;
import processing.core.PVector;

public class Due_Kanon extends PApplet{
    public static void main(String[] args ) {
        PApplet.main("name");
    }

Cannon pCannon = new Cannon(this);

    @Override
    public void settings() {
        super.settings();
        size(500,500);
    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {
        pCannon.display();

}
}
