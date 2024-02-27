package prjMultiplica;
import javax.swing.*;

public class Principal {
	public static void main (String [] Args) 
	{
		
		MetRecursivoMultiplica met = new MetRecursivoMultiplica();
		int num1 , num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+met.multiplicaSoma(num1, num2));
	}

}
