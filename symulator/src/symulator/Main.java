package symulator;

public class Main {
    public static void main(String[] args) {
        Samochod auto1 = new Samochod();
        auto1.wlacz();
        System.out.println(auto1.silnik.getObroty());
        System.out.println(auto1.skrzynia.getAktualnyPrzelozenie());
        auto1.skrzynia.zwiekszBieg();
        System.out.println(auto1.skrzynia.getAktualnyPrzelozenie());
        System.out.println(auto1.skrzynia.getAktualnyPrzelozenie());


    }
}

