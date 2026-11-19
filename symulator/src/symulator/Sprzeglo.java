package symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzegla;


    Boolean getStanSprzegla() {
        return stanSprzegla;
    }
    public void wcisnij() {
        stanSprzegla =true;
    }

    public void zwolnij() {
        stanSprzegla =false;
    }
}
