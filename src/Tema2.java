public class Tema2 extends SkeletonJava {

    /*
    Se se calculeze suma primelor n numere naturale,
    unde n este declarat ca si
    int n = 20; //sau o alta valoare
    */

    public static void main(String[] args) {
        int n = readIntGUI("Introduceti numar natural:");
        int count = 0;
        int sum = 0;

        do {
            //adauga fiecare numar natural la suma anteriora
            sum = sum + count;
            count++;
        } while (count <= n); //pana cand count <= n


        printGUI("Suma primelor " + n + " numere naturale este: " + sum);


    }
}