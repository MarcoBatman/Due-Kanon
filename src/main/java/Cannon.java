import processing.core.PApplet;
import processing.core.PVector;

public class Cannon {
PApplet p;
boolean dUp,dDown,dLeft,dRight;
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

void checkVel(){
  int mX=0;
  int mY=0;

if(dUp)mY-=1;
if(dDown)mY+=1;
if(dLeft)mX-=1;
if(dRight)mX+=1;
  CVelocity.set(mX,mY);
  p.println(mX);
  }


void move(){

  CLocation.add(CVelocity);
}

  void display(){
p.ellipse(CLocation.x,CLocation.y,100,100);



  }
  boolean setMove(int k, boolean b) {



        switch (k) {
        /*  case +'W':
          case 38:
            return dUp = b;

          case +'S':
          case 40:
            return dDown = b;
*/
          case +'A':
          case 37:
            return dLeft = b;

          case +'D':
          case 39:
            return dRight = b;

          default:
            return b;
        }

  }

}


