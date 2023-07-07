package fatou.thiam;

import mame.faye.Robot;
import sougou.fara.Monde;

/**
 * La classe PollueurToutDroit représente un robot pollueur qui parcourt le monde en ligne droite et pollue chaque case.
 * Elle hérite de la classe Robot.
 */
public class PollueurToutDroit extends Robot {
    private int colDepart; // Colonne de départ du parcours

    /**
     * Constructeur de la classe PollueurToutDroit.
     * 
     * @param colDepart La colonne de départ du parcours.
     * @param m Le monde dans lequel le robot pollueur évolue.
     */
    public PollueurToutDroit(int colDepart, Monde m) {
        super(0, colDepart, m);
        this.colDepart = colDepart;
    }

    /**
     * Méthode qui définit le comportement de parcours du robot pollueur.
     * Le robot se déplace en ligne droite sur chaque ligne du monde et pollue chaque case.
     */
    public void parcourir() {
        for (int i = 0; i < m.getnbL(); i++) {
            m.metPapierGras(i, posy);
        }
    }
}
