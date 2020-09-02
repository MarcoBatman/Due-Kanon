import processing.core.PApplet;
import processing.core.PVector;

public class Ducks {
    int posX;
    int posY;
    PVector location = new PVector(posX,posY);
    PVector Velocity = new PVector();
    PApplet p;
    Ducks(PApplet p){


    }

    Ducks(PApplet p,int x,int y){
       posX = x;
       posY = y;
       this.p =p;
    }

    void drawduck(){
        

    }






}
