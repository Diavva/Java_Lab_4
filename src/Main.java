public class Main {
    public static void main(String[] args) {

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

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        class Dom implements Budynek{

            @Override
            public double powierzchnia(double pow) {
                return 0;
            }

            @Override
            public String adresBudynku(String adres) {
                return null;
            }

            @Override
            public int liczbaOkien(int Ovalue) {
                return 0;
            }

            @Override
            public void liczbaieszkancow(int Mvalue) {

            }

            @Override
            public void kolorDomu(KolorEnum kolor) {

            }

            @Override
            public String WlascicielBudynku(String Imie, String Nazwisko) {
                return null;
            }

            public int liczbaPietr(int p) {
                return 0;
            }



        }

                /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Object Dom = new Dom(){
            @Override
            public double powierzchnia(double pow) {
                return 25.50;
            }

            @Override
            public String adresBudynku(String adres) {
                return "Wesoła 5";
            }

            @Override
            public int liczbaOkien(int Ovalue) {
                return 7;
            }

            @Override
            public void liczbaieszkancow(int Mvalue) {
                super.liczbaieszkancow(5);
            }

            @Override
            public void kolorDomu(KolorEnum kolor) {
            }

            @Override
            public String WlascicielBudynku(String Imie, String Nazwisko) {
                return super.WlascicielBudynku("Felix", "Rodriguez");
            }
        };
        Object Dom1 = new Budynek() {
            @Override
            public double powierzchnia(double pow) {
                return 34.3;
            }

            @Override
            public String adresBudynku(String adres) {
                return "Słoneczna 34";
            }

            @Override
            public int liczbaOkien(int Ovalue) {
                return 12;
            }

            @Override
            public void liczbaieszkancow(int Mvalue) {
            }

            @Override
            public void kolorDomu(KolorEnum kolor) {

            }

            @Override
            public String WlascicielBudynku(String Imie, String Nazwisko) {
                return "Maja Słonko";
            }


        };


    }
}
