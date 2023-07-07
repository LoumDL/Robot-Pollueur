package sougou.fara;

import java.util.Arrays;

/**
 * La classe Monde représente un monde rectangulaire avec des cases pouvant être propres ou sales.
 */
public class Monde {

  private int nbL; // Nombre de lignes du monde
  private int nbC; // Nombre de colonnes du monde
  private boolean[][] mat; // Matrice représentant l'état de chaque case du monde

  /**
   * Constructeur par défaut de la classe Monde.
   * Crée un monde de taille 10x10 avec toutes les cases initialisées à propres.
   */
  public Monde() {
    this.nbL = 10;
    this.nbC = 10;
    mat = new boolean[nbL][nbC];
    for (boolean[] row : mat) {
      Arrays.fill(row, false);
    }
  }

  /**
   * Constructeur de la classe Monde avec des dimensions spécifiées.
   * Crée un monde de taille nbL x nbC avec toutes les cases initialisées à propres.
   * 
   * @param nbL Le nombre de lignes du monde.
   * @param nbC Le nombre de colonnes du monde.
   */
  public Monde(int nbL, int nbC) {
    this.nbL = nbL;
    this.nbC = nbC;
    this.mat = new boolean[nbL][nbC];
    for (boolean[] row : mat) {
      Arrays.fill(row, false);
    }
  }

  /**
   * Retourne le nombre de lignes du monde.
   * 
   * @return Le nombre de lignes du monde.
   */
  public int getnbL(){
    return this.nbL;
  }

  /**
   * Retourne le nombre de colonnes du monde.
   * 
   * @return Le nombre de colonnes du monde.
   */
  public int getnbC(){
    return this.nbC;
  }

  /**
   * Définit le nombre de lignes du monde.
   * 
   * @param nbL Le nombre de lignes du monde.
   */
  public void setnbL(int nbL){
    this.nbL = nbL;
  }

  /**
   * Définit le nombre de colonnes du monde.
   * 
   * @param nbC Le nombre de colonnes du monde.
   */
  public void setnbC(int nbC){
    this.nbC = nbC;
  }

  /**
   * Affiche le monde avec un affichage graphique.
   * Les cases propres sont représentées par un point '.' et les cases sales par un 'o'.
   */
  public void afficher() {
    for (int i = 0; i < this.nbL; i++) {
      for (int j = 0; j < this.nbC; j++) {
        System.out.print(this.mat[i][j] ? " o" : " .");
      }
      System.out.println();
    }
  }

  /**
   * Retourne une représentation textuelle du monde.
   * Les cases propres sont représentées par un point '.' et les cases sales par un 'o'.
   * 
   * @return Une chaîne de caractères représentant le monde.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < this.nbL; i++) {
      for (int j = 0; j < this.nbC; j++) {
        sb.append(this.mat[i][j] ? " o" : " .");
      }
      sb.append("\n");
    }

    return sb.toString();
  }

  /**
   * Met de la saleté sur une case spécifiée.
   * 
   * @param i L'indice de ligne de la case.
   * @param j L'indice de colonne de la case.
   */
  public void metPapierGras(int i, int j) {
    mat[i][j] = true;
  }

  /**
   * Nettoie une case spécifiée en la marquant comme propre.
   * 
   * @param i L'indice de ligne de la case.
   * @param j L'indice de colonne de la case.
   */
  public void prendPapierGras(int i, int j) {
    mat[i][j] = false;
  }

  /**
   * Vérifie si une case spécifiée est sale.
   * 
   * @param i L'indice de ligne de la case.
   * @param j L'indice de colonne de la case.
   * @return true si la case est sale, false sinon.
   */
  public boolean estSale(int i, int j) {
    return mat[i][j];
  }

  /**
   * Retourne le nombre de cases sales dans le monde.
   * 
   * @return Le nombre de cases sales.
   */
  public int nbPapierGras() {
    int compteur = 0;
    for (int i = 0; i < this.nbL; i++) {
      for (int j = 0; j < this.nbC; j++) {
        if (mat[i][j]) {
          compteur++;
        }
      }
    }
    return compteur;
  }
}
