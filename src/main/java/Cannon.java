import processing.core.PApplet;
import processing.core.PVector;

public class Cannon {
PApplet p;
  PVector CVelocity = new PVector(1,0);
PVector location = new PVector((p.width/2,p.height));
Cannon(PApplet p) {
  this.p = p;


}

  void display(){
p.ellipse(1,1,1,1);

  }


}
