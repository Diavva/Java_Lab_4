public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        abstract class Figura {
            abstract int pole();
            abstract int obwod();
            String nazwafigury(String figura){
                return "To jest figura";
            }
        }

        class kwadrat extends Figura {

            int pole() {
                return 0;
            }

            int obwod() {
                return 0;
            }
        }

        class prostokat extends  Figura {

            int pole() {
                return 0;
            }

            int obwod() {
                return 0;
            }
        }

        Object Kwadrat = new kwadrat(){

            int pole() {
                return 9;
            }

            int obwod() {
                return 12;
            }
        };

        Object Prostokat = new prostokat(){

            int pole() {
                return 20;
            }

            int obwod() {
                return 18;
            }
        };

    }
}
