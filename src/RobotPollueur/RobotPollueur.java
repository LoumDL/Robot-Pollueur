package Robot_Pollueur.src.RobotPollueur;

import Robot_Pollueur.src.Robot.Robot;
import Robot_Pollueur.src.Monde.Monde;

public abstract class RobotPollueur extends Robot {
    // Constructeur
    public RobotPollueur(int posx, int posy, Monde m) {
        super(posx, posy, m);
    }

    public RobotPollueur(Monde m) {
        super(m);
    }

    // Méthodes
    public void polluer() {
        this.m.metPapierGras(this.posx, this.posy);
        System.out.println("Je pollue à la position " + this.posx + ", " + this.posy + ".");
    }
}