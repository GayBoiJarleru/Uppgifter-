import javax.swing.*;
import java.util.*;

public class Medelvarde {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hur många tal vill du skriva in?");
        int langd = in.nextInt();
        int[] tal = new int [langd];
        int y = 0;
        for (int i = 0; i < langd; i++) {
            System.out.println("skriv ett tal");
            y += tal[i];
        }

        double summa = 0;
        for (int i = 0; i < langd; i++) {
            summa += y[i]; }


        System.out.println(y);



    }
}
