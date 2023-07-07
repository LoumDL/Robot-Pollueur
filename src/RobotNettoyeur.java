package diara.ciss;

import sougou.fara.Monde;
import mame.faye.Robot;

/**
 * La classe RobotNettoyeur représente un robot spécialisé dans le nettoyage dans un monde donné.
 * Elle hérite de la classe abstraite Robot.
 */
public class RobotNettoyeur extends Robot {

    /**
     * Constructeur de la classe RobotNettoyeur avec une position spécifique.
     * 
     * @param posx La position en x du robot nettoyeur.
     * @param posy La position en y du robot nettoyeur.
     * @param m Le monde dans lequel le robot nettoyeur évolue.
     */
    public RobotNettoyeur(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }

    /**
     * Méthode qui permet au robot nettoyeur de nettoyer la case actuelle s'il est sale.
     * Si la case est sale, le robot prend le papier gras pour la nettoyer.
     */
    public void nettoyer() {
        boolean estSale = m.estSale(posx, posy);
        if (estSale) {
            m.prendPapierGras(posx, posy);
        }
    }

    /**
     * Méthode qui définit le comportement de parcours du robot nettoyeur.
     * Le robot nettoie les cases du monde en suivant un parcours spécifique.
     */
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
