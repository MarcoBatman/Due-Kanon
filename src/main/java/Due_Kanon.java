import processing.core.PApplet;

public class Due_Kanon extends PApplet{
    public static void main(String[] args ) {
        PApplet.main("name");
    }

Cannon pCannon = new Cannon(this);

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        pCannon.display();

}
}
