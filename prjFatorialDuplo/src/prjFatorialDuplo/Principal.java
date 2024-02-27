package prjFatorialDuplo;
import javax.swing.*;
public class Principal {
	public static void main (String[] args) {
		MetRecursivoFatDuplo met = new MetRecursivoFatDuplo();
		int num1 , num2;
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ímpar para fazer o Fatorial Duplo:"));
		} 
		while ((num1 % 2) == 0 );
		JOptionPane.showMessageDialog(null,"O resultado do Fatorial Duplo é "+met.fatorialDuplo(num1));
}
}