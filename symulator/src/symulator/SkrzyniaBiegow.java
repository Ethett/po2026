package symulator;

public class SkrzyniaBiegow extends Komponent {
    private int aktualnyPrzebieg;
    private int iloscBiegow;
    private int aktualnePrzelozenie =1;
    private Sprzeglo sprzeglo =  new Sprzeglo();

    public void zwiekszBieg() {
        if(sprzeglo.getStanSprzegla() == true) {
            if (aktualnePrzelozenie>=1 || aktualnePrzelozenie==-1) aktualnePrzelozenie++;
        }
    }

    public void zmniejszBieg() {
        if (sprzeglo.getStanSprzegla() == true) {
            if (aktualnePrzelozenie == 1) aktualnePrzelozenie = -1;
            else if (aktualnePrzelozenie > 1) {
                aktualnePrzelozenie--;
            }
        }
    }

    public int getAktualnyPrzelozenie() {
        return aktualnePrzelozenie;
    }
}
