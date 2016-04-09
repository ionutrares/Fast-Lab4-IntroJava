<<<<<<< HEAD
public class Tema1 extends SkeletonJava{

    /*
    Se da un sir de numere ordonate crescator.
    Se va determina daca un numar n exista in sir,
    si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
    Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
    sirul va fi definit asa, numerele sunt de exemplu.
    int[] a = {1,3,4,6,7,8,10,12,14,23};
    */
=======
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
>>>>>>> origin/master

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int n = readIntGUI("Introduceti numarul:");
        int i = 0;
        boolean search = true;

<<<<<<< HEAD
        while (search && i<a.length) {
            if (a[i] == n) {
                printGUI("Numarul a fost gasit la pozitia: " + i + " a sirului!");
=======
        while (search && i < a.length) {
            if (a[1] == n) {
                printGUI("Numarul a fost asit in pozitia: " + 1 + " a sirului!");
>>>>>>> origin/master
                search = false;
            }
            i++;
        }

        if (search) {
            printGUI("-1");
<<<<<<< HEAD
        }
=======


        }

>>>>>>> origin/master
    }
}