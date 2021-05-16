package projet;

public class Play extends StartDistrict{

    static boolean visionDeJack;


    public static void AppelTemoin() {//méthode de l'appel à témoin qui élimine les suspects 
        visionDeJack = Alibi.Jack.getMrJack();
        if (visionDeJack == true) {
            for (int i=0; i<ListeDistrict.size();i ++) {
                if (ListeDistrict.get(i).getVisble() == false) {
                    ListeDistrict.get(i).Retourne();
                }
            }
        }
        else {
            for (int i=0; i<ListeDistrict.size();i ++) {
                if (ListeDistrict.get(i).getVisble() == true) {
                    ListeDistrict.get(i).Retourne();}}

            }}

    public static void ResetDeVisible() {//méthode qui reset la visibilité des tuiles
        for (int i=0; i<ListeDistrict.size();i ++) {
            ListeDistrict.get(i).pasVisible();
        }}

    public static void VictoireDeJack() { //methode de condition de victoire de Jack
        if (Sablier.hourglass >= 8) {
            System.out.println("Jack a gagné !");}
    }

    public static void VictoireDeEnqueteur() { //méthode de condition de victoire de l'enquêteur
        int nbSuspect = 9;
        for (int i=0; i<ListeDistrict.size();i ++) {
            if (ListeDistrict.get(i).getRetourne() == true) {
                nbSuspect --;}}
        if (nbSuspect == 1){
            System.out.println("L'enquêteur a gagné !");
        }

}
}