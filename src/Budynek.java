public interface Budynek {

            /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int Ovalue);
    void liczbaieszkancow(int Mvalue);
    void kolorDomu(KolorEnum kolor);
    String WlascicielBudynku(String Imie, String Nazwisko);



    public class KolorEnum {
        enum Kolor {
            Zielony, Niebieski, Czerwony, Biały
        }
}   }
