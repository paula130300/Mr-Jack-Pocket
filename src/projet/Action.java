package projet;

public class Action extends StartDistrict{

    public static void Rotation(District district) {//méthode de rotation de district
        if (district.getSens() == 1) {
            district.setSens(4);}
        if (district.getSens() == 2) {
            district.setSens(1);}
        if (district.getSens() == 3) {
            district.setSens(2);}
        if (district.getSens() == 4) {
            district.setSens(3);}
    }
    public static void Echange(District district1, District district2) {//méthode d'échange de district
        int tempX = district1.getX();
        int tempY = district1.getY();
        district1.setX(district2.getX());
        district1.setY(district2.getY());
        district2.setX(tempX);
        district2.setY(tempY);


    }
    public static void MoveDetectives(Detectives dec,int move) {//méthode de déplacement des détectives
        dec.setPosition(dec.getPosition()+move);
        if (dec.getPosition()>12) {
            dec.setPosition(dec.getPosition()-12);}}


    public static void JetonAlibi() {
        if (Game.currentPlayer == "Enqueteur") {
            District innocent = Alibi.DeckAlibi.pop();
            innocent.Retourne();}
        if (Game.currentPlayer == "MrJack") {
            Alibi.piocheSablier();
            Sablier.SablierAlibis ();
        }}}