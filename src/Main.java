import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        int wiek = 21;
        System.out.println("wiek = "+ wiek);

        String Imie = "JAN";
        System.out.println("Imię: "+ Imie);

        String Nazwisko = "Smolarz";
        System.out.println("Nazwisko: "+ Nazwisko);

        String Uczelnia = "WSB w Gdańsku";
        System.out.println("Uczelnia: "+ Uczelnia);

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        int liczbaA = 10;
        int liczbaB = 57;

        double liczbaX = 5.28;
        double liczbaY = 3.14;

        int wynik1 = liczbaA + liczbaB;
        System.out.println(liczbaA+" + "+liczbaB+" = "+wynik1);

        int wynik2 = liczbaB - liczbaA;
        System.out.println(liczbaA +" - "+ liczbaB +" = "+ wynik2);

        int wynik3 = liczbaA * liczbaB;
        System.out.println(liczbaA +" * "+ liczbaB +" = "+ wynik3);

        int wynik4 = liczbaB / liczbaA;
        System.out.println(liczbaB +" / "+ liczbaA +" = "+ wynik4);

        int wynik5 = liczbaA % liczbaB;
        System.out.println(liczbaA +" % "+ liczbaB +" = "+ wynik5);

        double wynik6 = liczbaX + liczbaY;
        System.out.println(liczbaX+" + "+liczbaY+" = "+wynik6);

        double wynik7 = liczbaX - liczbaY;
        System.out.println(liczbaX+" - "+liczbaY+" = "+wynik7);

        double wynik8 = liczbaX * liczbaY;
        System.out.println(liczbaX+" * "+liczbaY+" = "+wynik8);

        double wynik9 = liczbaX / liczbaY;
        System.out.println(liczbaX+" / "+liczbaY+" = "+wynik9);

        double wynik10 = liczbaX % liczbaY;
        System.out.println(liczbaX+" % "+liczbaY+" = "+wynik10);


    }
}