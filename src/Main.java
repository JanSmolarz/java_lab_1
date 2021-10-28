import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj swój wiek: ");
        int wiek = scan.nextInt();

        int modulo = wiek%3;
        if (modulo == 0) {
            System.out.println("Twój wiek jest podzielny przez 3");
        }else {
            System.out.println("Twój wiek nie dzieli się przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println("Podaj swój numer albumu: ");
        int indeks = scan.nextInt();
        int dzielnik = 2;
        int czyParzysty = (indeks % 2 == 1) ? 0 : 1 ;
        System.out.println("Czy parzysty : " + czyParzysty);


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("Wypisz swój wzrost: ");
        double wzrost= scan.nextDouble();

        if (wzrost < 153) {
            System.out.println("Wzrost karłowaty");
        } else if (wzrost < 163) {
            System.out.println("Wzrost niski");
        }else if (wzrost < 173) {
            System.out.println("Wzrost średni");
        }else if (wzrost < 178) {
        System.out.println("Wzrost wysoki");
        }else if (178 < wzrost) {
            System.out.println("Wzrost bardzo wysoki");
        }





    }
}
