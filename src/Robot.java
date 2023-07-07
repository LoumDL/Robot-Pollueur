package mame.faye;

import sougou.fara.Monde;

/**
 * La classe abstraite Robot représente un robot dans un monde donné.
 */
public abstract class Robot {
    protected int posx; // Position en x du robot
    protected int posy; // Position en y du robot
    protected Monde m; // Le monde dans lequel le robot évolue

    /**
     * Constructeur de la classe Robot avec une position spécifique.
     * 
     * @param x La position en x du robot.
     * @param y La position en y du robot.
     * @param m Le monde dans lequel le robot évolue.
     */
    public Robot(int x, int y, Monde m) {
        this.posx = x;
        this.posy = y;
        this.m = m;
    }

    /**
     * Constructeur de la classe Robot avec une position aléatoire.
     * 
     * @param m Le monde dans lequel le robot évolue.
     */
    public Robot(Monde m) {
        int maxX = m.getnbL();
        int maxY = m.getnbC();
        this.posx = (int) (Math.random() * maxX);
        this.posy = (int) (Math.random() * maxY);
        this.m = m;
    }

    /**
     * Retourne la position en y du robot.
     * 
     * @return La position en y du robot.
     */
    public int getposy(){
        return this.posy;
    }

    /**
     * Déplace le robot vers les coordonnées spécifiées.
     * 
     * @param i La nouvelle position en x du robot.
     * @param j La nouvelle position en y du robot.
     */
    public void vaEn(int i, int j){
        this.posx = i;
        this.posy = j;
    }

    /**
     * Méthode abstraite qui définit le comportement de parcours du robot.
     */
    public abstract void parcourir();
}
