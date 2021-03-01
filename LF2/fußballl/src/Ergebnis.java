public class Ergebnis {

    private int toreHeim;
    private int toreGast;

    public Ergebnis(){

    }

    public int getToreGast() {
        return toreGast;
    }

    public void addToreGast(int toreGast) {
        toreGast = toreGast ++;
    }

    public int getToreHeim() {
        return toreHeim;
    }

    public void addToreHeim(int toreHeim) {
        toreHeim = toreHeim ++;
    }

    @Override
    public String toString() {
        String text1 = "";
        text1 += " " + toreHeim + ":" + toreGast;
        return text1;
    }
}
