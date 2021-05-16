package projet;

import java.util.ArrayList;
import java.util.Random;

public class Jetons {
    int numero;
    String face;
    String pile ;
    boolean cote;
    boolean played;

static Jetons J1 = new Jetons(1,"Sherlock","Alibis" );
static Jetons J2 = new Jetons(2,"Watson","Toby");
static Jetons J3 = new Jetons(3,"echange","rotation");
static Jetons J4 = new Jetons(4,"joker","rotation");

static ArrayList<Jetons> ListeJetons = new ArrayList<Jetons>();




    public Jetons(int num,String f, String p) {
        numero = num;
        face = f;
        pile = p;
        cote = true;
        played = false;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getPile() {
        return pile;
    }

    public void setPile(String pile) {
        this.pile = pile;
    }

    public boolean isCote() {
        return cote;
    }

    public void setCote(boolean cote) {
        this.cote = cote;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }
    public void addJetons() {
        ListeJetons.add(J1);
        ListeJetons.add(J2);
        ListeJetons.add(J3);
        ListeJetons.add(J4);

        for (int i = 0; i<=ListeJetons.size(); i++) {
            Random PileOuFace = new Random();
            ListeJetons.get(i).setCote(PileOuFace.nextBoolean());

        }

 
    }
}