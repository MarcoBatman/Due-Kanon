import processing.core.PApplet;
import processing.core.PVector;

public class Cannon {
PApplet p;
  PVector CVelocity = new PVector(1,0);

Cannon(PApplet p,int width,int height) {
  this.p = p;


}
  //PVector Clocation = new PVector(p.width/2,p.height/2);
  void display(){
p.ellipse(1,1,1,1);

  }


}
