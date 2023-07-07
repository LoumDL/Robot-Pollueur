package mareme.sarr;
import sougou.fara.Monde;
import mame.faye.Robot;
import diara.ciss.RobotNettoyeur;


public class NettoyeurDistrait extends RobotNettoyeur {
    public NettoyeurDistrait(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }

    @Override
    public void parcourir() {
        int nbL = m.getnbL();
        int nbC = m.getnbC();
        int counter = 0;

        for (int i = 0; i < nbL; i++) {
            for (int j = 0; j < nbC; j++) {
                if (m.estSale(i, j) && counter % 2 == 0) {
                    vaEn(i, j);
                    nettoyer();
                }
                counter++;
            }
        }
    }
}







   