package Robot_Pollueur.src.Tester;

import Robot_Pollueur.src.PollueurSauteur.PollueurSauteur;
import Robot_Pollueur.src.PollueurToutDroit.PollueurToutDroit;
import Robot_Pollueur.src.RobotPollueur.RobotPollueur;
import Robot_Pollueur.src.Monde.Monde;
import Robot_Pollueur.src.Robot.Robot;
import Robot_Pollueur.src.RobotNettoyeur.RobotNettoyeur;

public class MainApp {

  public static void main(String[] args) {

    Monde monde = new Monde(10, 10);
    monde.afficher();
    System.out.println(monde.toString());

    int compteur = monde.nbPapierGras();
    System.out.println(compteur);

    PollueurToutDroit pd = new PollueurToutDroit(4,monde);
                      pd.parcourir();
    PollueurSauteur ps = new PollueurSauteur(3,4,monde,5);
    RobotNettoyeur rn = new RobotNettoyeur(monde);
    rn.parcourir();
    NettoyeurDistrait nd = new  NettoyeurDistrait(monde);
    nd.parcourir();
  }
}
