package projet;


public class Sablier {
    static int hourglass = 0 ;
    static int sablierDesAlibis;
    static int sablierDuTour;

    public static void SablierAlibis () {
        sablierDesAlibis = sablierDesAlibis + Alibi.sablierAlibi;

    }

    public static void SablierDuTour() {
        sablierDuTour ++;}

    public static void TotalSablier() {
        hourglass = sablierDuTour + sablierDesAlibis;

    }
    }