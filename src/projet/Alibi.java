package projet;


import java.util.Collections;
import java.util.Stack;


public class Alibi extends StartDistrict {

    public static Stack<District> DeckAlibi = new Stack<District>(); //création d'une pile
    public static int sablierAlibi;
    public static District Jack;
    public static void CreaDeck() { //méthode qui complète la pile de deckAlibi
    	



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
    public static void piocheDeMrJack() { //méthode qui pioche Jack et l'initialise
        Jack = DeckAlibi.pop();
        Jack.setMrJack();

    }
    public static void piocheSablier() { // méthode qui sort le chiffre correspondant au sablier
        sablierAlibi= DeckAlibi.pop().getSablier();

    }
}