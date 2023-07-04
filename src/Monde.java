package Robot_Pollueur.src.Monde;

import java.util.Arrays;

public class Monde {

  private int nbL;
  private int nbC;
  private boolean[][] mat;

  public Monde() {
    this.nbL = 10;
    this.nbC = 10;
    mat = new boolean[nbL][nbC];
    for (boolean[] row : mat) {
      Arrays.fill(row, false);
    }
  }

  public Monde(int nbL, int nbC) {
    this.nbL = nbL;
    this.nbC = nbC;
    this.mat = new boolean[nbL][nbC];
    for (boolean[] row : mat) {
      Arrays.fill(row, false);
    }
  }

  public void afficher() {
    for (int i = 0; i < this.nbL; i++) {
      for (int j = 0; j < this.nbC; j++) {
        System.out.print(this.mat[i][j] ? " o" : " .");
      }
      System.out.println();
    }
  }

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

  public void metPapierGras(int i, int j) {
    mat[i][j] = true;
  }

  public void prendPapierGras(int i, int j) {
    mat[i][j] = false;
  }

  public boolean estSale(int i, int j) {
    return mat[i][j];
  }

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
