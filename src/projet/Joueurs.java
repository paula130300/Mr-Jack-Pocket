package projet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Joueurs {
    public static String nomPlayer1;
    public static String nomPlayer2;
    public static void NomsJoueurs() {
        // players names
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le nom du Joueur1 :");
        setNomPlayer1(sc.nextLine());
        System.out.println("Entrez le nom du Joueur2 :");
        setNomPlayer2(sc.nextLine());

        ArrayList<String> ListeJoueurs = new ArrayList<String>();
        ListeJoueurs.add(nomPlayer1);
        ListeJoueurs.add(nomPlayer2);
        Random random = new Random();

        int pos = random.nextInt(ListeJoueurs.size());
        String JoueurJack = ListeJoueurs.get(pos);
        System.out.println(JoueurJack + " est MrJack");
        }
	public static String getNomPlayer1() {
		return nomPlayer1;
	}
	public static void setNomPlayer1(String nomPlayer1) {
		Joueurs.nomPlayer1 = nomPlayer1;
	}
	public static String getNomPlayer2() {
		return nomPlayer2;
	}
	public static void setNomPlayer2(String nomPlayer2) {
		Joueurs.nomPlayer2 = nomPlayer2;
	}
    }