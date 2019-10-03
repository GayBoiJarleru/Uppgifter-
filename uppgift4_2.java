import javax.swing.*;
import java.util.Scanner;

public class uppgift4_2 {
	public static void main(String[] args) {
		
	Scanner tgb = new Scanner(System.in);
	
	System.out.println("Hur mycket kostar ett arskort:");
	
	int arskort = tgb.nextInt();
	
	System.out.println("hur mycket kostar en billjat:");
	
	int billjat = tgb.nextInt();
	
	System.out.println("Humyngangdugymgangpaar:");
	
	int munggi = tgb.nextInt();
	
	if (billjat * munggi > arskort){
		JOptionPane.showMessageDialog(null, "arskort billigare");
	}
	else {
		JOptionPane.showMessageDialog(null, "billjat billigare");
	}
	
	
	}
}