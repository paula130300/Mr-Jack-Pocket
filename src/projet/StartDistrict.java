package projet;

import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Random;


public class StartDistrict {
	
	public static Stack<String> ListeCoords = new Stack<String>();
	public static Stack<Integer> DeckX = new Stack<Integer>();
	public static Stack<Integer> DeckY = new Stack<Integer>();
	static Random random = new Random();
	
	static Detectives Sherlock = new Detectives("Sherlock", 12);
	static Detectives Watson = new Detectives("Watson",4 );
	static Detectives Toby = new Detectives("Toby", 8);
	
	static District district11;
    static District district12;
    static District district13;
    static District district21;
    static District district22;
    static District district23;
    static District district31;
    static District district32;
    static District district33;
	
	static District InspecteurLestrade = new District(0,0,"Inespecteur Lestrade", 0,0,"/projet/MillieumillieuLESTRADE.png");
    static District MissStealthy = new District(0,0,"Miss Stealthy", 0,1,"/projet/MilieugaucheMISS_STEALTHY.png");
    static District JeremyBert = new District(0,0,"Jeremy Bert", 0,1,"/projet/HautgaucheJEREMY_BART.png");
    static District JohnPizer = new District(0,0,"John Pizer", 0,1,"/projet/haautdroitJOHN_PIZER.png");
    static District JohnSmith = new District(0,0,"John Smith", 0,1,"/projet/BasgaucheJOHN_SMITH.png");
    static District JosephLane = new District(0,0,"Joseph Lane", 0,1,"/projet/Josephlanedroit.png");
    static District Madame = new District(0,0,"Madame", 0,2,"/projet/BasmilieuMADAME.png");
    static District SgtGoodley = new District(0,0,"Sgt Goodley", 0,0,"/projet/MillieudroitSERGENT_GOODLEY.png");
    static District WilliamGull = new District(0,0,"William Gull", 0,1,"/projet/HautmillieuWILLIAM_GULL.png");
	
static ArrayList<District> ListeDistrict = new ArrayList<District>();
static ArrayList<District> case1Y = new ArrayList<District>();
static ArrayList<District> case2Y = new ArrayList<District>();
static ArrayList<District> case3Y = new ArrayList<District>();
static ArrayList<District> caseX1 = new ArrayList<District>();
static ArrayList<District> caseX2 = new ArrayList<District>();
static ArrayList<District> caseX3 = new ArrayList<District>();
	
public static void CreateCoords() {
    ListeCoords.push("1 1");
    ListeCoords.push("1 2");
    ListeCoords.push("1 3");
    ListeCoords.push("2 1");
    ListeCoords.push("2 2");
    ListeCoords.push("2 3");
    ListeCoords.push("3 1");
    ListeCoords.push("3 2");
    ListeCoords.push("3 3");
    Collections.shuffle(ListeCoords);
    String[] parts = null; 
    for (int i= 0; i<=8;i++) {
        parts = ListeCoords.pop().split(" ");

       
        int X = Integer.parseInt(parts[0]);
        int Y = Integer.parseInt(parts[1]);

        DeckX.push(X);
        DeckY.push(Y);

    }}
	public static void setInspecteurLestrade() {
		int xL=DeckX.pop();
		int yL=DeckY.pop();
		int sensL = 1+random.nextInt(3);
		
		if (xL == 1 && yL == 1) {
			sensL = 1;
		}
		if (xL == 2 && yL == 3) {
			sensL = 2;
		}
		if (xL == 3 && yL == 1) {
			sensL = 3;
		}
		InspecteurLestrade.setX(xL);
		InspecteurLestrade.setY(yL);
		InspecteurLestrade.setSens(sensL);
		System.out.println(xL);
		System.out.println(yL);
		System.out.println(sensL + "sens");
	}
	public static void setMissStealthy() {
		int xMS=DeckX.pop();
		int yMS=DeckY.pop();
		int sensMS = 1+random.nextInt(3);
		
		if (xMS == 1 && yMS == 1) {
			sensMS = 1;
		}
		if (xMS == 2 && yMS == 3) {
			sensMS = 2;
		}
		if (xMS == 3 && yMS == 1) {
			sensMS = 3;
		}
		MissStealthy.setX(xMS);
		MissStealthy.setY(yMS);
		MissStealthy.setSens(sensMS);
		System.out.println(xMS);
		System.out.println(yMS);
		System.out.println(sensMS + "sens");
	}
	public static void setJeremyBert() {
		int xJB=DeckX.pop();
		int yJB=DeckY.pop();
		int sensJB = 1+random.nextInt(3);
		
		if (xJB == 1 && yJB == 1) {
			sensJB = 1;
		}
		if (xJB == 2 && yJB == 3) {
			sensJB = 2;
		}
		if (xJB == 3 && yJB == 1) {
			sensJB = 3;
		}
		JeremyBert.setX(xJB);
		JeremyBert.setY(yJB);
		JeremyBert.setSens(sensJB);
		System.out.println(xJB);
		System.out.println(yJB);
		System.out.println(sensJB + "sens");
	}
	public static void setJohnPizer() {
		int xJP=DeckX.pop();
		int yJP=DeckY.pop();
		int sensJP = 1+random.nextInt(3);
		
		if (xJP == 1 && yJP == 1) {
			sensJP = 1;
		}
		if (xJP == 2 && yJP == 3) {
			sensJP = 2;
		}
		if (xJP == 3 && yJP == 1) {
			sensJP = 3;
		}
		JohnPizer.setX(xJP);
		JohnPizer.setY(yJP);
		JohnPizer.setSens(sensJP);
		System.out.println(xJP);
		System.out.println(yJP);
		System.out.println(sensJP + "sens");
	}
	public static void setJohnSmith() {
        int xJS=DeckX.pop();
        int yJS=DeckY.pop();
        int sensJS = 1+random.nextInt(3);

        if (xJS == 1 && yJS == 1) {
            sensJS = 1;
        }
        if (xJS == 2 && yJS == 3) {
            sensJS = 2;
        }
        if (xJS == 3 && yJS == 1) {
            sensJS = 3;
        }
        JohnSmith.setX(xJS);
        JohnSmith.setY(yJS);
        JohnSmith.setSens(sensJS);
        System.out.println(xJS);
		System.out.println(yJS);
		System.out.println(sensJS + "sens");
    }
    public static void setJosephLane() {
        int xJL=DeckX.pop();
        int yJL=DeckY.pop();
        int sensJL = 1+random.nextInt(3);

        if (xJL == 1 && yJL == 1) {
            sensJL = 1;
        }
        if (xJL == 2 && yJL == 3) {
            sensJL = 2;
        }
        if (xJL == 3 && yJL == 1) {
            sensJL = 3;
        }
        JosephLane.setX(xJL);
        JosephLane.setY(yJL);
        JosephLane.setSens(sensJL);
        System.out.println(xJL);
		System.out.println(yJL);
		System.out.println(sensJL + "sens");
    }
    public static void setMadame() {
        int xM=DeckX.pop();
        int yM=DeckY.pop();
        int sensM = 1+random.nextInt(3);

        if (xM == 1 && yM == 1) {
            sensM = 1;
        }
        if (xM == 2 && yM == 3) {
            sensM = 2;
        }
        if (xM == 3 && yM == 1) {
            sensM = 3;
        }
        Madame.setX(xM);
        Madame.setY(yM);
        Madame.setSens(sensM);
        System.out.println(xM);
		System.out.println(yM);
		System.out.println(sensM + "sens");
    }
    public static void setSgtGoodley() {
        int xSG=DeckX.pop();
        int ySG=DeckY.pop();
        int sensSG = 1+random.nextInt(3);

        if (xSG == 1 && ySG == 1) {
            sensSG = 1;
        }
        if (xSG == 2 && ySG == 3) {
            sensSG = 2;
        }
        if (xSG == 3 && ySG == 1) {
            sensSG = 3;
        }
        SgtGoodley.setX(xSG);
        SgtGoodley.setY(ySG);
        SgtGoodley.setSens(sensSG);
        System.out.println(xSG);
		System.out.println(ySG);
		System.out.println(sensSG + "sens");
    }
public static void setWilliamGull() {
        int xW=DeckX.pop();
        int yW=DeckY.pop();
        int sensW = 1+random.nextInt(3);

        if (xW == 1 && yW == 1) {
            sensW = 1;
        }
        if (xW == 2 && yW == 3) {
            sensW = 2;
        }
        if (xW == 3 && yW == 1 ) {
            sensW = 3;
        }
        WilliamGull.setX(xW);
        WilliamGull.setY(yW);
        WilliamGull.setSens(sensW);
        System.out.println(xW);
		System.out.println(yW);
		System.out.println(sensW + "sens");
    }
	
public static void addListeTuile() {
    ListeDistrict.add(InspecteurLestrade);
    ListeDistrict.add(MissStealthy);
    ListeDistrict.add(JeremyBert);
    ListeDistrict.add(JohnPizer);
    ListeDistrict.add(JohnSmith);
    ListeDistrict.add(JosephLane);
    ListeDistrict.add(Madame);
    ListeDistrict.add(SgtGoodley);
    ListeDistrict.add(WilliamGull);
}

public static void addCase() {
	int a=1;
	int b=1;
	int c=1;
	int d=1; 
	int e=1;
	int f=1;

	for (int i=0; i<ListeDistrict.size();i ++) {
		if   (ListeDistrict.get(i).getX()==1 && ListeDistrict.get(i).getY()== a) {
            case1Y.add(ListeDistrict.get(i));
            if (ListeDistrict.get(i).getY() == 1){
            	 district11 = ListeDistrict.get(i);}
            if (ListeDistrict.get(i).getY() == 2){
            	 district12 = ListeDistrict.get(i);}
            if (ListeDistrict.get(i).getY() == 3){
            	 district13 = ListeDistrict.get(i);}
            a++;
            i=0;
            }
        if (ListeDistrict.get(i).getX()==2 && ListeDistrict.get(i).getY()== b) {
            case2Y.add(ListeDistrict.get(i));
            if (ListeDistrict.get(i).getY() == 1){
            	 district21 = ListeDistrict.get(i);}
            if (ListeDistrict.get(i).getY() == 2){
            	 district22 = ListeDistrict.get(i);}
            if (ListeDistrict.get(i).getY() == 3){
            	 district23 = ListeDistrict.get(i);}
      
            b++;
            i=0;
            }
        if (ListeDistrict.get(i).getX()==3 && ListeDistrict.get(i).getY()== c) {
            case3Y.add(ListeDistrict.get(i));
          if (ListeDistrict.get(i).getY() == 1){
        	  district31 = ListeDistrict.get(i);}
          if (ListeDistrict.get(i).getY() == 2){
        	  district32 = ListeDistrict.get(i);}
          if (ListeDistrict.get(i).getY() == 3){
        	  district33 = ListeDistrict.get(i);}
            c++;
            i=0;
            }
        if (ListeDistrict.get(i).getY()==1 && ListeDistrict.get(i).getX()== d) {
            caseX1.add(ListeDistrict.get(i));
            
            d++;
            i=0;
            }
        if (ListeDistrict.get(i).getY()==2 && ListeDistrict.get(i).getX()== e) {
            caseX2.add(ListeDistrict.get(i));
            e++;
            i=0;
            }
        if (ListeDistrict.get(i).getY()==3 && ListeDistrict.get(i).getX()== f) {
            caseX3.add(ListeDistrict.get(i));
            f++;
            i=0;
            }}}
	public static void LaunchStartDistrict() {
			CreateCoords();
			setInspecteurLestrade();
			setMissStealthy();
	        setJeremyBert();
	        setJohnPizer();
	        setJohnSmith();
	        setJosephLane();
	        setMadame();
	        setSgtGoodley();
	        setWilliamGull();
	        addListeTuile();
	        addCase();
	}

}