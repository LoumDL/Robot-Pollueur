package fatou.thiam;

import mame.faye.Robot ;
import sougou.fara.Monde;

public class PollueurToutDroit extends Robot {
    private int colDepart;

    public PollueurToutDroit(int colDepart, Monde m) {
        super(0, colDepart, m);
        this.colDepart = colDepart;
    }

    public void parcourir() {
        for (int i = 0; i < m.getnbL(); i++) {
            m.metPapierGras(i, posy);
            
        }
    }
}