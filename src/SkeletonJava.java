import javax.naming.ldap.SortResponseControl;
import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.io.IOException;
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

        String user = "ana";
        String parola = "a";

        //lansareNotepad() doar daca combinatia user si parola e corecta
        boolean allowNotepad = false;

        do {
            String u = readStringGUI("User");
            String p = readStringGUI("Pass");

            if (user.equals(u) && parola.equals(p)) {
                allowNotepad = true;
            }
        }
        while (!allowNotepad);
        // if here it means we passed the while
        lansareNotepad();

    }
    //end of main method

    public static void lansareNotepad() {
        // code de pe internet
        System.out.println("lansareeee");
        try {
            Runtime.getRuntime().exec("ls"); //notepad in windows
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
// end of class
