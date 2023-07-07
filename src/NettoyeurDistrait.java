package mareme.sarr;

import sougou.fara.Monde;
import mame.faye.Robot;
import diara.ciss.RobotNettoyeur;

/**
 * La classe NettoyeurDistrait représente un robot nettoyeur qui parcourt le monde de manière distraite et nettoie les cases sales en suivant une logique particulière.
 * Elle hérite de la classe RobotNettoyeur.
 */
public class NettoyeurDistrait extends RobotNettoyeur {

    /**
     * Constructeur de la classe NettoyeurDistrait.
     * 
     * @param posx La position en x du robot nettoyeur distrait.
     * @param posy La position en y du robot nettoyeur distrait.
     * @param m Le monde dans lequel le robot nettoyeur distrait évolue.
     */
    public NettoyeurDistrait(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }

    /**
     * Redéfinition de la méthode parcourir pour le robot nettoyeur distrait.
     * Le robot nettoie les cases sales en suivant une logique particulière basée sur un compteur.
     */
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
