import javax.swing.*;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[] args) {
        int min=1;
        int max=10;

        Random rnd = new Random();
       int zufallszahl = rnd.nextInt(max - min + 1) + min; /* die methode kann verwendet werde wenn das rot unterstrichene mit Alt+Enter importiert wird*/


       if ((zufallszahl%2)==0) /* erste klammer: er schaut wieviel rest bei der zufallszahl ist, 2te klammer: er vergleicht es mit 0 */
       {
           JOptionPane.showMessageDialog(null,"die zahl ist gerade");
       }
       else
       {
           JOptionPane.showMessageDialog(null,"die zahl ist ungerade");
       }
    }
}
