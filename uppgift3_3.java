/*
Uppgift3.3
Skapad 2019-09-27
Jarl Bergström
*/

import javax.swing.*;
import java.util.Scanner;

public class uppgift3_3 {
	public static void main(String[] args) {
		
		double pi = 3.1415;
		double radie;
		radie = Double.parseDouble(JOptionPane.showInputDialog(null, "skriv cirkelns radie"));
		JOptionPane.showMessageDialog(null, radie*radie*pi);
}
}
   