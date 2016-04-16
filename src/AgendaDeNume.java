import javax.swing.*;
import java.util.Scanner;

/**
 * Created by icondor on 26/03/16.
 */
public class AgendaDeNume {

    /* utility methods for INPUT/OUTPUT using a GUI or Console, please leave them as they are */

    // GUI
    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static double readDoubleGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        double returnValue = Double.parseDouble(input);
        return returnValue;
    }

    public static String readStringGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        return input;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(double text) {
        JOptionPane.showMessageDialog(null, text);
    }

    // CONSOLE
    public static String readStringConsole(String label) {
        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static int readIntConsole(String label) {
        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static double readDoubleConsole(String label) {
        System.out.print(label);
        double input = new Scanner(System.in).nextDouble();
        return input;
    }

    public static void printConsole(String text) {
        System.out.println(text);
    }

    public static void printConsole(int text) {
        System.out.println(text);
    }

    public static void printConsole(double text) {
        System.out.println(text);
    }
    /* end of utility methods*/

    static String[] sirDeNume = new String[3];
    static int index=0;


    /* here starts the main class */
    public static void main(String[] arguments) {


        int optiune=0;
        do {
            printConsole("1 - listare");
            printConsole("2 - adaugare");
            printConsole("3 - cautare");
            printConsole("4 - modificare");
            printConsole("5 - stergere");
            printConsole("7 - exit");
            optiune = readIntConsole("Alegeti un numar: ");
            if (optiune == 1)
                listare();

            else if (optiune == 2) {
                String v = readStringConsole("Introduceti numele: ");
                creareFaraDuplicate(v);
                if (index == sirDeNume.length) {
                    System.out.println("Agenda este plina");

                }

            }

            else if (optiune == 3){
                String v = readStringConsole("Cauta numele: ");
                cautare(v);
            }

            else if (optiune == 4){

                String v = readStringConsole("Modificati numele: ");
                modificare(v);
            }

            else if (optiune == 5){
                String v = readStringConsole("Sterge numele: ");
                stergere(v);
            }

            // listare
            // adaugare
            // modificare
            // stergere
            // cautare
            // exit
        } while(optiune!=7);


    } // end main

    public static void listare() {
        for(int i=0;i<sirDeNume.length;i++) {
            if(sirDeNume[i]!=null) {
                printConsole(sirDeNume[i]);
            }
        }
    }

    public static void creare(String valoare) {
        sirDeNume[index]=valoare;
        index++;
    }

    public static void creareFaraDuplicate(String valoare) {
        int i =cautare(valoare);
        if(i==-1) { //negasita, deci trebuie scrisa
            sirDeNume[index] = valoare;
            index++;
        }
        else
        {
            System.out.println("deja exista");
        }


    }

    public static int cautare(String valoare) {
        int r =-1; // negasit
        for(int i=0;i<sirDeNume.length;i++) {
            if(valoare.equals(sirDeNume[i])) {
                r = i; //gasit pe pozitia i
                System.out.println("Gasit pe pozitia: "+r);
                break;
            }
        }
        return r;

    }
    public static void modificare (String valoare){
        int r = -1;
        for (int i=0;i<sirDeNume.length;i++){
            if (valoare.equals(sirDeNume[i])){
                sirDeNume[i] = readStringConsole("Noul nume: ");

            }

        }

    }
    public static void stergere(String valoare){

        for (int i=0;i<sirDeNume.length;i++){
            if (valoare.equals(sirDeNume[i])){

                sirDeNume[i]=null;
            }

        }


    }
}
// end of class