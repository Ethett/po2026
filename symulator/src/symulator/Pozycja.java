package symulator;

public class Pozycja extends Samochod {
    private double x;
    private double y;

    public void aktualizujPozycje(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getPozycja() {
        return "Pozycja: ("+x+","+y+")";
    }






}
