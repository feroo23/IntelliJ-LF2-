public class Orange extends Obst{
    private boolean Kernlos;

    public Orange(String Orange){
        super( "Orange");
    }

    public boolean isKernlos() {
        return Kernlos;
    }

    @Override
    public String toString() {
        String text = "Orange";
        text += super.toString();
        text += "\n\tKernlos : " + isKernlos();
        return "Orange{}";
    }
}
