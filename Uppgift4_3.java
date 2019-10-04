import javax.swing.*;
import java.util.Scanner;

public class Uppgift4_3 {
	public static void main(String[] args) {
		int poang = Integer.parseInt(JOptionPane.showInputDialog(null,"Hurmangepoangefickedue"));
		
		if (poang < 25) {
			JOptionPane.showMessageDialog(null,"Noob");
		}
		    else if (poang < 30) {
			JOptionPane.showMessageDialog(null,"E");
		}
		    else if (poang < 35) {
			JOptionPane.showMessageDialog(null,"D");
		}	
		    else if (poang < 40) {
			JOptionPane.showMessageDialog(null,"C");
		}
			else if (poang < 45) {
			JOptionPane.showMessageDialog(null,"B");
		}
			else if (poang < 50) {
			JOptionPane.showMessageDialog(null,"A");
		}	
		    else if (poang > 50) {
			JOptionPane.showMessageDialog(null,"Fusk");
		}
	}
}