
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody
        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów */

        class Student implements Student1{

            public String imie() {
                return null;
            }

            public double wzrost() {
                return 0;
            }

            public int klasa() {
                return 0;
            }

            public String profil() {
                return null;
            }

            public double srednia() {
                return 0;
            }
        }

        class Pracownik implements Pracownik1{

            public String imie() {
                return null;
            }

            public double wzrost() {
                return 0;
            }

            public double wyplata() {
                return 0;
            }

            public String firma() {
                return null;
            }

            public String pozycja() {
                return null;
            }
        }

        Object student1 = new Student(){

            public String imie() {
                return "Kasia Janowska";
            }

            public double wzrost() {
                return 1.23;
            }

            public int klasa() {
                return 5;
            }

            public String profil() {
                return "Fizyczna";
            }

            public double srednia() {
                return 3.5;
            }
        };

        Object student2 = new Student1() {

            public int klasa() {
                return 8;
            }

            public String profil() {
                return "Humanistyczny";
            }

            public double srednia() {
                return 5.0;
            }

            public String imie() {
                return "Asia Mormon";
            }

            public double wzrost() {
                return 1.55;
            }
        };

        Object pracownik1 = new Pracownik1() {

            public double wyplata() {
                return 120.50;
            }

            public String firma() {
                return "ToysRU";
            }

            public String pozycja() {
                return "Ksjerka";
            }

            public String imie() {
                return "Maja Royland";
            }

            public double wzrost() {
                return 1.81;
            }
        };

        Object pracownik2 = new Pracownik1() {

            public double wyplata() {
                return 300.00;
            }

            public String firma() {
                return "ToysRU";
            }

            public String pozycja() {
                return "Menadżer";
            }

            public String imie() {
                return "Artur Mormon";
            }

            public double wzrost() {
                return 1.78;
            }
        };




        }






    }

