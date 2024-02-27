package prjMdc;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {


		MetRecursivoMdc met = new MetRecursivoMdc ();
		int num1 , num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));	
		JOptionPane.showMessageDialog(null,"O MDC é: "+met.calcularMdc(num1, num2));

	}

}
