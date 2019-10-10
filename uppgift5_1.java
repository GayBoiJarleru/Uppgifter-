/*
uppgift 5.1 i boken
skapat 2019-10-10
*/
import javax.swing.*; 

public class uppgift5_1{
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("n?");
		int n = Integer.parseInt (s);
		int Summa = 0;
	    int k = 1;
		while (k <= n) {
			Summa = Summa + k*k;
			k= k + 1;
	}
	JOptionPane.showMessageDialog(null, "Summan blir" + Summa);
  }
}
