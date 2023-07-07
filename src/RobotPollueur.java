package sonko.fall;

import mame.faye.Robot;
import sougou.fara.Monde;

/**
 * La classe abstraite RobotPollueur représente un robot spécialisé dans la pollution dans un monde donné.
 * Elle hérite de la classe abstraite Robot.
 */
public abstract class RobotPollueur extends Robot {

    /**
     * Constructeur de la classe RobotPollueur avec une position spécifique.
     * 
     * @param posx La position en x du robot pollueur.
     * @param posy La position en y du robot pollueur.
     * @param m Le monde dans lequel le robot pollueur évolue.
     */
    public RobotPollueur(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }

    /**
     * Constructeur de la classe RobotPollueur avec une position aléatoire.
     * 
     * @param m Le monde dans lequel le robot pollueur évolue.
     */
    public RobotPollueur(Monde m) {
        super(m);
    }

    /**
     * Méthode qui permet au robot pollueur de polluer la case actuelle.
     * Le robot dépose du papier gras sur la case et affiche un message.
     */
    public void polluer() {
        this.m.metPapierGras(this.posx, this.posy);
        System.out.println("Je pollue à la position " + this.posx + ", " + this.posy + ".");
    }
}
