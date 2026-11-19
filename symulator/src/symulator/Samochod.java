package symulator;

public class Samochod extends Silnik {
    private int stanWlaczenia;
    private String nrRejest;
    private String model;
    private int predkoscMax;

    Silnik silnik =  new Silnik();
    SkrzyniaBiegow skrzynia =  new SkrzyniaBiegow();

    void wlacz() {
        silnik.uruchom();
    }
    void wylacz() {
        silnik.zatrzymaj();
    }


}
