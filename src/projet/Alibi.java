package projet;


import java.util.Collections;
import java.util.Stack;


public class Alibi extends StartDistrict {

    public static Stack<District> DeckAlibi = new Stack<District>(); //cr�ation d'une pile
    public static int sablierAlibi;
    public static District Jack;
    public static void CreaDeck() { //m�thode qui compl�te la pile de deckAlibi
    	



     DeckAlibi.push(InspecteurLestrade); 
     DeckAlibi.push(MissStealthy); 
     DeckAlibi.push(JeremyBert); 
     DeckAlibi.push(JohnPizer); 
     DeckAlibi.push(JohnSmith); 
     DeckAlibi.push(JosephLane); 
     DeckAlibi.push(Madame);
     DeckAlibi.push(SgtGoodley);
     DeckAlibi.push(WilliamGull);
     Collections.shuffle(DeckAlibi);
     //System.out.println(DeckAlibi ); 
    }
    public static void piocheDeMrJack() { //m�thode qui pioche Jack et l'initialise
        Jack = DeckAlibi.pop();
        Jack.setMrJack();

    }
    public static void piocheSablier() { // m�thode qui sort le chiffre correspondant au sablier
        sablierAlibi= DeckAlibi.pop().getSablier();

    }
}