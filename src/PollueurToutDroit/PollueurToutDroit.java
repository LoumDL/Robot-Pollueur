package Robot_Pollueur.src.PollueurToutDroit;

import Robot_Pollueur.src.Robot.Robot ;
import Robot_Pollueur.src.Monde.Monde;

public class PollueurToutDroit extends Robot {
    private int colDepart;

    public PollueurToutDroit(int colDepart, Monde m) {
        super(0, colDepart, m);
        this.colDepart = colDepart;
    }

    public void parcourir() {
        for (int i = 0; i < m.getnbL(); i++) {
            m.metPapierGras(i, posy);
            
        }
    }
}