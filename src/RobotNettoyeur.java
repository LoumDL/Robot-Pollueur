package diara.ciss;

import sougou.fara.Monde;
import mame.faye.Robot;

public class RobotNettoyeur extends Robot {
    public RobotNettoyeur(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }

    public void nettoyer() {
        boolean estSale = m.estSale(posx, posy);
        if (estSale) {
            m.prendPapierGras(posx, posy);
        }
    }

    @Override
    public void parcourir() {
        for (int i = 0; i < m.getnbL(); i++) {
            for (int j = 0; j < m.getnbC(); j++) {
                if (i % 2 == 0) {
                    // Parcours de gauche à droite sur les lignes paires
                    vaEn(i, j);
                    nettoyer();
                } else {
                    // Parcours de droite à gauche sur les lignes impaires
                    vaEn(i, m.getnbC() - 1 - j);
                    nettoyer();
                }
            }
        }
    }
}
