package djiby.loum;

import sougou.fara.Monde;
import mame.faye.Robot;
import sonko.fall.RobotPollueur;

public class PollueurSauteur extends RobotPollueur {
    private int deltax; // Taille du saut à chaque déplacement

    // Constructeur
    public PollueurSauteur(int posx, int posy, Monde m, int deltax) {
        super(posx, posy, m); 
        this.deltax = deltax;
    }

    // Redefinition de parcourir

    @Override 
    public void parcourir() {
        

	int i= 0;
	int j= this.posy;  

        while (i < m.getnbL() && j < m.getnbC()) { 
            m.metPapierGras(i,j);
            // Pour mettre un papier gras 
            i++;
            
	    
	    if (j > m.getnbC()) {
		j = 0;
	     } else j += this.deltax;


        }

    }
}
