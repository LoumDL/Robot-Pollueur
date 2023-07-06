package Robot_Pollueur.src.NettoyeurDistrait;
import Robot_Pollueur.src.Monde.Monde;
import Robot_Pollueur.src.Robot.Robot;
import Robot_Pollueur.src.RobotNettoyeur.RobotNettoyeur;
public class NettoyeurDistrait extends RobotNettoyeur {
    public NettoyeurDistrait(Monde m) {
        super(m);
    }

    @Override
    public void parcourir() {
        int nbL = m.getnbL();
        int nbC = m.getnbC();
        int x = posx;
        int y = posy;
        int counter = 0;

        while (x < nbL) {
            while (y < nbC) {
                if (m.estSale(x, y) && counter % 2 == 0) {
                    nettoyer();
                }
                y++;
                counter++;
}
                y = 0;
                x++;
            }
        }
    }