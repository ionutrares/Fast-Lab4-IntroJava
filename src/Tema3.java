public class Tema3 extends SkeletonJava {

    /*
    Se citesc numere naturale pânã când se introduce numãrul 0.
    Afisati suma obtinutã prin adunarea primei si a ultimei cifre din fiecare numar citit.
    Numerele cu mai putin de 2 cifre nu se iau in considerare.
    Exemplu: dacã se introduc numerele 3455 66 7 8 23 11221 0
    atunci se va afisa 27 (3+5+6+6+2+3+1+1).
    */

    public static void main(String[] args) {
        int nr;
        //String space = " ";
        int sum = 0;
        int firstdigit;
        int lastdigit;

        do {
            nr = readIntGUI("Introduceti numere naturale:");
            firstdigit = nr/10;

            while (nr >= 10) {
                firstdigit = nr;

            }

            lastdigit = nr % 10;
            sum = sum + (firstdigit + lastdigit);

        } while (nr != 0);

        printGUI("Suma este: " + sum);

    }
}