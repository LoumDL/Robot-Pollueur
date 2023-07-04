package Robbot_Pollueur.src.Robot;
import Monde.Monde;

public abstract class Robot {
    protected int posx;
    protected int posy;
    protected Monde m;

    public Robot(int x, int y, Monde m) {
        this.posx = x;
        this.posy = y;
        this.m = m;
    }

    // Constructeur avec position aléatoire
    public Robot(Monde m) {
        int maxX = m.nbL;
        int maxY = m.nbC;
        this.posx = (int) (Math.random() * maxX);
        this.posy = (int) (Math.random() * maxY);
        this.m = m;
    }


    public void vaEn(int i, int j) {
        if (m.estPositionValide(i, j)) {
            posx = i;
            posy = j;
            System.out.println("Le robot s'est déplacé en (" + i + ", " + j + ").");
        } else {
            System.out.println("La position (" + i + ", " + j + ") est invalide.");
        }
    }

    public abstract void parcourir();
}
