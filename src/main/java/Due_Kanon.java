import processing.core.PApplet;

import java.util.ArrayList;


public class Due_Kanon extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Due_Kanon");
    }
    boolean gameover;
    int width = 1830/2;
    int height = 873/2;
    boolean alredyRemoved;

    ArrayList<Shit> shitlist= new ArrayList<>();
    ArrayList<Ducks> duckList= new ArrayList<>();
    ArrayList<Cactus> cacList= new ArrayList<>();
    @Override
    public void settings() {
        super.settings();

        size(width, height);

    }
  

    @Override
    public void setup() {
        super.setup();
       iL.load();
        duckList.add(new Ducks(this,(int) random(50,width-50), (int) random(20,100),5,iL));
        cacList.add(new Cactus(this,200,iL));
    }

    ImageLoader iL= new ImageLoader(this);
    Cannon pCannon = new Cannon(this,width,height,iL);
    Barrel pBarrel = new Barrel(this,pCannon,iL,duckList,cacList);

    @Override
    public void draw() {
        if(!gameover) {
            fill(255);
            clear();
            image(iL.sky, 0, 0);
            for (int i = 0; i < cacList.size(); i++){
                cacList.get(i).drawcac();
                cacList.get(i).imHit(pCannon);

            }

            pCannon.display();
            pBarrel.display();
            pCannon.checkVel();
            pCannon.move();
            pBarrel.cannonPlacement();
            for (int i = 0; i < duckList.size(); i++){
            if (duckList.get(i).iShitNow == true) {
                shitlist.add(new Shit(this, duckList.get(i).location.x, duckList.get(i).location.y));
            }}

            for (int i = 0; i < shitlist.size(); i++) {
                shitlist.get(i).moveshit();
                shitlist.get(i).drawshit();



                if (shitlist.get(i).location.x <= pCannon.CLocation.x + 25 * 3 && shitlist.get(i).location.x >= pCannon.CLocation.x && shitlist.get(i).location.y <= pCannon.CLocation.y + 25 * 3 && shitlist.get(i).location.y >= pCannon.CLocation.y) {
                    pCannon.hp -= 1;
                    shitlist.remove(i);
                    alredyRemoved = true;

                }
                if(alredyRemoved == false && shitlist.get(i).location.y > height){
                    shitlist.remove(i);
                } else {
                    alredyRemoved = false;
                }
            }
            textSize(30);
            text("HP: " + pCannon.hp,50,150);

            if(pCannon.hp == 0){
                gameover = true;
            }
                for (int i = 0; i < duckList.size(); i++) {
                    duckList.get(i).shit();
                    duckList.get(i).drawduck();
                    duckList.get(i).move();
                    duckList.get(i).hitwall();
                }
            }
        textSize(80);
        fill(0,255,0);

        if(gameover){
            clear();
            text("Du er blevet skidt på",0,height/2);
        }







    }

    public void mousePressed(){
        if(mouseButton == LEFT){
            pBarrel.shoot();

        }
    }

    public void keyPressed() {

        pCannon.setMove(keyCode, true);


    }

    public void keyReleased() {

        pCannon.setMove(keyCode, false);

    }}



