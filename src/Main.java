public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        boolean a = false;
        boolean b = true;
        boolean c = false;
        int x = 7;
        int y = 5;
        int z = 5;

        System.out.println(a && b);
        System.out.println(a || c);
        System.out.println(!b);
        System.out.println(x == y);
        System.out.println(y == z);
        System.out.println(x > y);
        System.out.println((!a && c) || (!a || b));
        System.out.println((y == z) && (x < y));
    }
}
