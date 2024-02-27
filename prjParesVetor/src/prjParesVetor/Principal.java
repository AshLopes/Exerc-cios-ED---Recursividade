package prjParesVetor;
import javax.swing.*;
public class Principal {

	public static void main(String[] args) {
		
		MetRecursivoParesVet met = new MetRecursivoParesVet();

		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		int[] vet1 = new int[tamanho];
		for (int i = 0; i < tamanho; i ++){
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para incluir no vetor:"));
		}
		JOptionPane.showMessageDialog(null,"O vetor contêm "+met.contaPares(vet1, tamanho - 1, 0)+" número(s) par(es)");

	}

}
