import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj numer indeksu: ");
        String nri = scan.next();

        System.out.printf("Masz na imię %s a na nazwisko %s i masz %d lat.\n", imie, nazwisko, wiek);
        System.out.println("Twój numer indeksu to: "+ nri);




        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.print("Podaj pierwszą liczbę: ");
        int l1 = scan.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int l2 = scan.nextInt();

        int w1 = l1+l2;
        System.out.printf("%d + %d = %d \n",l1, l2, w1);

        int w2 = l1-l2;
        System.out.printf("%d - %d = %d\n",l1, l2, w2);

        int w3 = l1*l2;
        System.out.printf("%d * %d = %d\n",l1, l2, w3);

        int w4 = l1/l2;
        System.out.printf("%d / %d = %d\n",l1, l2, w4);

        int w5 = l1%l2;
        /*System.out.printf("%d % %d = %d\n",l1, l2, w5); //problem ze znakiem % w printf */
        System.out.println(l1 +" % "+ l2 +" =" + w5);



    }
}
