package Robot_Pollueur.src.Tester;

import Robot_Pollueur.src.Monde.Monde;

public class MainApp {

  public static void main(String[] args) {

    // Monde monde = new Monde();
    Monde monde = new Monde(10, 10);
    monde.afficher();
    System.out.println(monde.toString());

    // boolean reponse = monde.estSale(2,3);
    // System.out.println(reponse);

    int compteur = monde.nbPapierGras();
    System.out.println(compteur);
  }
}
