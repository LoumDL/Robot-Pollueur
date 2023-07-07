package mame.faye;

import sougou.fara.Monde;

public abstract class Robot {
    protected int posx;
    protected int posy;
    protected Monde m;

    public Robot(int x, int y, Monde m) {
        this.posx = x;
        this.posy = y;
        this.m = m;
    }

    // Constructeur avec position aléatoire
    public Robot(Monde m) {
        int maxX = m.getnbL();
        int maxY = m.getnbC();
        this.posx = (int) (Math.random() * maxX);
        this.posy = (int) (Math.random() * maxY);
        this.m = m;
    }

    public int getposy(){
        return this.posy ;
    }

    public void vaEn(int i, int j){
          this.posx = i;
          this.posy = j;
      }
      public abstract void parcourir();


}
