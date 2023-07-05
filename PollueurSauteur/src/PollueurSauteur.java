package Robot_Pollueur.src.PolleurSauteur;

import Robot_Pollueur.src.Monde.Monde;
import Robot_Pollueur.src.Robot.Robot;
import Robot_Pollueur.src.RobotPolleur.RobotPolleur;

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
        this.posx = 0;
        this.posy = 2; // colonne de depart dans parcourir() de Robot genere automatiquement donc j'ai pris 2 comme exemple, on en reparlera

	int i= this.posx;
	int j= this.posy;  

        while (i < m.nbL && j < m.nbC) { 
            m.metPapierGras(i,j); // Pour mettre un papier gras 
            i++;
	    
	    if (j > m.nbC) {
		j = 0;
	     } else j += this.deltax;


        }
    }
}
