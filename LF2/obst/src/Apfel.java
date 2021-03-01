public class Apfel extends Obst {
    // construckter
    public Apfel(String Apfel) {
        super("Apfel");
    }

    @Override
    public String toString() {
        String text = "Apfel";
        text += super.toString();
        return "Apfel{}";
    }
}