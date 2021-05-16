package projet;

public class District {
    int districtX;
    int districtY;
    String suspect;
    int sens;
    boolean retourne;
    boolean isMrJack;
    int sablier;
    boolean visible;
    String Image;

    public District(int x,int y, String s,int orient,int sab,String img) {
        districtX = x;
        districtY = y;
        suspect = s;
        sens = orient;
        retourne = false;
        isMrJack = false;
        sablier = sab;
        visible = false;
        Image = img;




    }
    public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public int getSens() {
        return sens;
    }

    public void setSens(int newSens) {
        sens = newSens;
    }

    public int getX() {
        return districtX;
    }

    public void setX(int X) {
        districtX =X;
    }

    public int getY() {
        return districtY;
    }

    public void setY(int Y) {
        districtY =Y;
    }

    public String getName() {
        return suspect;
    }

    public void Retourne() {
        retourne = true;
        }

    public boolean getRetourne() {
        return retourne;
    }

    public void setMrJack() {
        isMrJack = true;
    }
    public boolean getMrJack() {
        return isMrJack;
    }
    public int getSablier() {
        return sablier;
    }
    public void estVisible() {
    visible =true;
}
    public void pasVisible() {
        visible =false;
    }
    public boolean getVisble() {
        return visible;
    }
}