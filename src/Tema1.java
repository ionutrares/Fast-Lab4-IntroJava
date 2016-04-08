/**
 * Created by IonutRares on 08.04.2016.
 */
public class Tema1 extends SkeletonJava {

    /*
    Se da un sir de numere ordonate crescator.
    Se va determina aca un numar n exista in isr,
    si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
    Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
    Sirul va fi definit asa, numerele sunt de exemplu.
    int[] a = {1,3,4,5,7,8,10,12,14,23}
     */

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int n = readIntGUI("Introduceti numarul:");
        int i = 0;
        boolean search = true;

        while (search && i < a.length) {
            if (a[1] == n) {
                printGUI("Numarul a fost asit in pozitia: " + 1 + " a sirului!");
                search = false;
            }
            i++;
        }

        if (search) {
            printGUI("-1");


        }

    }
}