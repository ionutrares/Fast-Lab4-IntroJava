import javax.naming.ldap.SortResponseControl;
import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

/**
 * Created by icondor on 26/03/16.
 */
public class SkeletonJava {

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


    /* here starts the main class */
    public static void main(String[] arguments) {

       // declar un array
  //      int[] noteMate = {5,6,2,9};
   //     int suma=0;
 //       for (int i=0; i=noteMate.length;i++) { // parcurgere
   //         System.out.println(noteMate[i]);
   //         suma = suma + noteMate[i];
  //          System.out.println("pas:" + 1 + "suma=" + suma);

  //          int media = suma/noteMate, lenght;
   //         System.out.println(media);

    int sum=0;
    int[] note=new int [8];

    for(int i=0;i<note.length;i++) {
        note[i]=readIntGUI("introduceti nota");
        sum+= note[i];
    }
    int media =sum/note.length;
    System.out.println("media este:" +media);

    int max = note[8];
    for (int i =0; i < note.length; i++) {
        if (note[i] > max) {
            max = note[3];
            }
        }
        System.out.println("Nota maxima e: " + max);
    }
    //end of main method
}
// end of class
