package djiby.loum;

import sougou.fara.Monde;
import mame.faye.Robot;
import sonko.fall.RobotPollueur;

/**
 * La classe PollueurSauteur représente un robot pollueur qui saute lors de son parcours dans un monde donné.
 * Elle hérite de la classe RobotPollueur.
 */
public class PollueurSauteur extends RobotPollueur {
    private int deltax; // Taille du saut à chaque déplacement

    /**
     * Constructeur de la classe PollueurSauteur.
     * 
     * @param posx La position en x du robot pollueur sauteur.
     * @param posy La position en y du robot pollueur sauteur.
     * @param m Le monde dans lequel le robot pollueur sauteur évolue.
     * @param deltax La taille du saut à chaque déplacement.
     */
    public PollueurSauteur(int posx, int posy, Monde m, int deltax) {
        super(posx, posy, m);
        this.deltax = deltax;
    }

    /**
     * Redéfinition de la méthode parcourir pour le robot pollueur sauteur.
     * Le robot se déplace en sautant à chaque déplacement, en laissant une trace de pollution sur les cases visitées.
     */
    @Override
    public void parcourir() {
        int i = 0;
        int j = this.posy;

        while (i < m.getnbL() && j < m.getnbC()) {
            m.metPapierGras(i, j);
            i++;

            if (j >= m.getnbC()) {
                j = 0;
            } else {
                j += this.deltax;
            }
        }
    }
}
