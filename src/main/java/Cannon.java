import processing.core.PApplet;
import processing.core.PVector;

public class Cannon {
PApplet p;
boolean dUP,dDown,dLeft,dRight;
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
    if(p.key== 'a'||p.key== 'A'||p.keyCode== p.LEFT)
      CVelocity.set(-2,0);
    else if(p.key == 'd'||p.key== 'D'||p.keyCode==p.RIGHT)
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
  boolean setMove(int k, boolean b) {

      switch (k) {

        switch (k) {
          case +'W':
          case p.UP:
            return dUp = b;

          case +'S':
          case p.DOWN:
            return dDown = b;

          case +'A':
          case p.LEFT:
            return dLeft = b;

          case +'D':
          case p.RIGHT:
            return dRight = b;

          default:
            return b;
        }

  }

}

}
