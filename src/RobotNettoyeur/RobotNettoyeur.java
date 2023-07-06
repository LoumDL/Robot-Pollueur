package Robot_Pollueur.src.RobotNettoyeur;
import Robot_Pollueur.src.Monde.Monde;
import Robot_Pollueur.src.Robot.Robot;

public class RobotNettoyeur extends Robot {
    public RobotNettoyeur(Monde m) {
        super(0, 0, m);
    }

    public void nettoyer() {
        m.prendPapierGras(posx, posy);
        System.out.println("case nettoyée");
    }

    @Override
    public void parcourir() {
        int nbL = m.getnbL();
        int nbC = m.getnbC();
        int x = posx;
        int y = posy;

        while (x < nbL) {
            while (y < nbC) {
                if (m.estSale(x, y)) {
                    nettoyer();
                }
                y++;
            }
            y = 0;
            x++;
            if (x < nbL) {
                while (y < nbC) {
                    if (m.estSale(x, y)) {
                        nettoyer();
                    }
                    y++;
                }
                y = nbC - 1;
                x++;
            }
        }
    }
}
