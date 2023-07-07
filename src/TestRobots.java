package plis.sarr;

import sougou.fara.Monde;
import mareme.sarr.NettoyeurDistrait;
import djiby.loum.PollueurSauteur;
import fatou.thiam.PollueurToutDroit;
import sonko.fall.RobotPollueur;
import mame.faye.Robot;
import diara.ciss.RobotNettoyeur;

/**
 * La classe TestRobots est la classe principale du programme.
 * Elle contient la méthode main qui exécute les différentes actions.
 */
public class TestRobots {

  public static void main(String[] args) {
    System.out.println(" Le Monde");
    Monde m = new Monde();
    m.afficher();
    int compteur = m.nbPapierGras();
    System.out.println(" Le Nombre de papier gras dans le monde est: " + compteur);

    System.out.println(" ------------------------------------------------------" );

    // Apparition des robots pollueurs
    System.out.println("Apparition des robots sauteurs dans le Monde ");
    PollueurSauteur pollueursauteur = new PollueurSauteur(0, 9, m, 2);
    pollueursauteur.parcourir();
    m.afficher();
    compteur = m.nbPapierGras();
    System.out.println(" Le Nombre de papier gras dans le monde " + compteur);

    System.out.println(" ------------------------------------------------------" );

    System.out.println("Apparition des robots PollueurToutDroit ");
    PollueurToutDroit pollueurtoutdroit = new PollueurToutDroit(4, m);
    pollueurtoutdroit.parcourir();
    m.afficher();
    compteur = m.nbPapierGras();
    System.out.println(" Le Nombre de papier gras dans le monde " + compteur);

    System.out.println(" ------------------------------------------------------" );

    System.out.println("Apparition des Nettoyeurs Distaits");
    NettoyeurDistrait nettoyeurdistrait = new NettoyeurDistrait(0, 0, m);
    nettoyeurdistrait.parcourir();
    m.afficher();
    compteur = m.nbPapierGras();
    System.out.println(" Le Nombre de papier gras dans le monde " + compteur);

    System.out.println(" ------------------------------------------------------" );
    System.out.println("Apparition des Robots Nettoyeurs");
    RobotNettoyeur robotnettoyeur = new RobotNettoyeur(0, 0, m);
    robotnettoyeur.parcourir();
    m.afficher();
    compteur = m.nbPapierGras();
    System.out.println(" Le Nombre de papier gras dans le monde " + compteur);
  }
}
