import processing.core.PApplet;
import processing.core.PVector;

public class Shit {

PApplet p;
PVector location = new PVector();
PVector velocity = new PVector();
PVector accelaration = new PVector(0,1);



    Shit(PApplet p,float x, float y){
        this.p=p;
        location.x=x;
        location.y=y;

    }
    void drawshit(){
        p.ellipse(location.x,location.y,10,10);
    }
    void moveshit(){
    velocity.add(accelaration);
    location.add(velocity);
    }
    void hitTank(Cannon Tank,boolean gameover){
        float afstand = p.dist(location.x,location.y,Tank.CLocation.x,Tank.CLocation.y);
        float minAfstand=5;
            if(afstand <= minAfstand){
                p.text("Du er blevet skidt på",p.width/2,p.height/2);
            gameover=true;
        }

    }
}

