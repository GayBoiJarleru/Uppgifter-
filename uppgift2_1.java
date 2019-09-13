import javax.swing.*;
/*
Uppgift 2.1 i boken sida 34
Skapad 2019 09 13
Av Jarl Bergström
*/
public class uppgift2_1{
	public static void main(String[] args) {
		String namn;
		String adress;
		String tfnr;
		String allt;
		
		namn="Jarl Bergström";
		adress="Kronbodsvägen 11";
		tfnr="076123456678";
		allt= namn +
		"\n"+ adress +
		"\n"+ tfnr;
		
		
		
		JOptionPane.showMessageDialog(null,allt);
	}
}