public class Tema4 extends SkeletonJava {

    /*
    Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24].
    Altfel sa se afiseze ‘false'.
    */

    public static void main(String[] args) {
        int n = readIntGUI("Introduceti nr:");

        if (n >= 9 && n <= 24) {
            printGUI("True");
        } else {
            printGUI("False");
        }

    }
}
