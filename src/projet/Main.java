package projet;

public class Main  {

    public static void main(String[] args) {
        Game.Initialisation();
        for (int i = 1; i<=8; i++) {
            switch (i%2) {
            case 1:
                Game.TourImpairs();
                break;
            case 0:
                Game.TourPairs();
                break;
            }

        }}}