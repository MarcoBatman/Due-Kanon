import processing.core.PApplet;
import processing.core.PVector;

public class Cannon {
PApplet p;
  PVector CVelocity = new PVector(1,0);
int width;
int height;
Cannon(PApplet p,int width,int height) {
  this.p = p;
this.height = height;
this.width=width;

}
  PVector Clocation = new PVector(width/2,height/2);
  void display(){
p.ellipse(Clocation.x,Clocation.y,100,100);

  }


}
