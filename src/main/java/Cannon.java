import processing.core.PApplet;
import processing.core.PVector;

public class Cannon {
PApplet p;
  int width;
  int height;
  PVector CVelocity = new PVector(1,0);
  PVector CLocation = new PVector();


Cannon(PApplet p,int width,int height) {
  this.p = p;
this.height = height;
this.width=width;
  p.println(width);
CLocation.set(width/2,height-50);


}

void checkInput(){
  if(p.keyPressed){
    if(p.key== 'a'||p.key== 'A')
      CVelocity.set(-2,0);
    else if(p.key == 'd'||p.key== 'D')
      CVelocity.set(2,0);
    else
      CVelocity.set(0,0);
  }
  else
    CVelocity.set(0,0);
}
void move(){

  CLocation.add(CVelocity);
}

  void display(){
p.ellipse(CLocation.x,CLocation.y,100,100);

  }


}
