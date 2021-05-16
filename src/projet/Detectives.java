package projet;


public class Detectives {
    String detec;
    int position;

    public Detectives (String detective, int pos) {
        detec =detective;
        position = pos;


    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}