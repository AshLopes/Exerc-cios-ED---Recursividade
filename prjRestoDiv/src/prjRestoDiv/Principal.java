package prjRestoDiv;
import javax.swing.*;
public class Principal {
	public static void main (String [] Args1) {
		
		MetRecursivoResto met = new MetRecursivoResto();
		int num1 , num2;
	
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));	
		JOptionPane.showMessageDialog(null,"O resto da divisão é: "+met.restoDivisao(num1, num2));
}
}