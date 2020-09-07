import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class Bullet {
    PVector bLocation = new PVector();
    PVector bVelocity = new PVector(5,0);
    PVector cLocation = new PVector();
    PVector actualLocation = new PVector();
    ImageLoader iL;
    PApplet p;
    float angle;
    ArrayList<Ducks> duckList;
    ArrayList<Cactus> cacList;

    Bullet(float a, float x, float y, PApplet p, ImageLoader iL, ArrayList<Ducks> aD,ArrayList<Cactus> cD){
         angle=a;
         cLocation.x = x;
         cLocation.y=y;
         this.p = p;
         this.iL = iL;
duckList = aD;
cacList =cD;
    }
    float smallestX(float x,float y){

return Math.min(actualLocation.x-x-p.sin(angle)*y,actualLocation.x+x-p.sin(angle)*y);
    }
    float smallestY(float x,float y){
        return Math.min(actualLocation.y-y-x*p.cos(angle),actualLocation.y+y-x*p.cos(angle));
    }
    float biggestX(float x,float y){
        return Math.max(actualLocation.x-x+p.sin(angle)*y,actualLocation.x+x+p.sin(angle)*y);
    }
    float biggestY(float x,float y){
        return Math.max(actualLocation.y-y+x*p.cos(angle),actualLocation.y+y+x*p.cos(angle));
    }

    void checkCollide(){

        actualLocation.set(p.cos(angle)*bLocation.x+cLocation.x,p.sin(angle)*bLocation.x+cLocation.y);
        float pLengthX = p.cos(angle)*(61/2);//Pigeon Length X
        float pLengthY =p.sin(angle)*(34/2);//Pigeon Length X

        float dLX = 61; //Duck Length X
        float dLY=34;//Duck Length Y

        float cLX=64*2;
        float cLY=64*2;

        float bigY= biggestY(pLengthX,pLengthY);
        float smallX =smallestX(pLengthX,pLengthY);
        float bigX =biggestX(pLengthX,pLengthY);
        float smallY =smallestY(pLengthX,pLengthY);

        for(int i =0;i<duckList.size();i++){
        float dX = duckList.get(i).location.x ;//Duck Position X
        float dY=duckList.get(i).location.y;//Duck Position X

            //Duck Collsion
        if (((bigX>dX && bigX<dX+dLX)||(smallX>dX && smallX<dX+dLX))&&((smallY>dY && smallY<dY+dLY)||(bigY>dY && bigY<dY+dLY))) {
        duckList.remove(i);
        duckList.add(new Ducks(p,(int) p.random(50,p.width-50), (int) p.random(20,100),5,iL));
        }}

        for(int i =0;i<cacList.size();i++){
            float cX = cacList.get(i).location.x ;//Duck Position X
            float cY=  cacList.get(i).location.y;//Duck Position X

            if((((bigX>cX && bigX<cX+cLX)||(smallX>cX && smallX<cX+cLX))&&((smallY>cY && smallY<cY+cLY)||(bigY>cY && bigY<cY+cLY)))){
            cacList.remove(i);
            }
        }

    }

    void display(){

        p.pushMatrix();
        p.imageMode(p.CENTER);
        p.translate(cLocation.x,cLocation.y);

        p.rotate(angle);
        p.image(iL.bulletdue,bLocation.x,bLocation.y);
        p.imageMode(p.CORNER);
        p.popMatrix();



    }
    boolean move(){

        bLocation.add(bVelocity);
    if(actualLocation.x>1830/2||actualLocation.x<0||actualLocation.y<0||actualLocation.y>p.height)
        return true;
    else return false;

    }
}
