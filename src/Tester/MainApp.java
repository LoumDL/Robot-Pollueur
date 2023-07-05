package Robot_Pollueur.src.Tester;

import Robot_Pollueur.src.RobotPollueur.RobotPollueur;
import Robot_Pollueur.src.Monde.Monde;
import Robot_Pollueur.src.Robot.Robot;

public class MainApp {

  public static void main(String[] args) {

    Monde monde = new Monde(10, 10);
    monde.afficher();
    System.out.println(monde.toString());

    int compteur = monde.nbPapierGras();
    System.out.println(compteur);

    RobotPollueur robP = new  RobotPollueur(10, 10, monde);
    robP.polluer();
  }
}
