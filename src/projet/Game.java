package projet;

public class Game {
    public static String currentPlayer = "Enqueteur";



    public static void Initialisation() {
        Joueurs.NomsJoueurs();
        Alibi.CreaDeck();
        Alibi.piocheDeMrJack();
        StartDistrict.LaunchStartDistrict();
        DeckDistrict.MrJackNotVisible(); //test
        for (int i=0; i<StartDistrict.ListeDistrict.size();i ++) { // test
        	
        if (StartDistrict.ListeDistrict.get(i).getVisble() == false) {
        	System.out.println("perso visible"+StartDistrict.ListeDistrict.get(i).getName());
        }}
    }


    public static void TourImpairs() {
        currentPlayer = "Enqueteur";
        while (currentPlayer == "Enqueteur") {

        currentPlayer = "MrJack";}
        while (currentPlayer == "MrJack") {

        currentPlayer = "Enqueteur";}

        DeckDistrict.MrJackNotVisible();
        Play.AppelTemoin();
        Sablier.SablierDuTour();
        Sablier.TotalSablier();
        Play.VictoireDeJack();
        Play.VictoireDeEnqueteur();
        Play.ResetDeVisible();
}

    public static void TourPairs() {
        currentPlayer = "MrJack";
        while (currentPlayer == "MrJack") {

            currentPlayer = "Enqueteur";}
        while (currentPlayer == "Enqueteur") {

            currentPlayer = "MrJack";}
        DeckDistrict.MrJackNotVisible();
        Play.AppelTemoin();
        Sablier.SablierDuTour();
        Sablier.TotalSablier();
        Play.VictoireDeJack();
        Play.VictoireDeEnqueteur();
        Play.ResetDeVisible();



    }
    }