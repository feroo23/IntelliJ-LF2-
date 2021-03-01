public class Banane extends Obst{
    private double kruemungsgrad;

    /**
     * Konstruktor
     */
    public Banane(String bananne){
        super( "Banane");
    }

    /**
     * Speichert den Krümmungsgrad
     * @param kruemungsgrad
     */
    public void setKruemungsgrad(double kruemungsgrad) {
        this.kruemungsgrad = kruemungsgrad;
    }

    public double getKruemungsgrad() {
        return kruemungsgrad;
    }

    @Override
    public String toString() {
        String text = "Banane";
        text += super.toString();
        text += "\n\tKrpmmungsgrad: " + kruemungsgrad;
        return "Banane{}";
    }

}
