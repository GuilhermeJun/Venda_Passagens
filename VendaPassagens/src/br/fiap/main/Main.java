package br.fiap.main;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;
import br.fiap.passageiro.Passageiro;
import br.fiap.tipodepassageiro.TipodePassageiro;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome, tipodepassageiro, cpf, telefone, cnpj;
		Passageiro[] passageiro = new Passageiro[7];

		nome = showInputDialog("Digite seu nome:");
		telefone = showInputDialog("Digite seu telefone:");
		tipodepassageiro = showInputDialog("Informe se o tipo de passageiro � F�sico ou Jur�dico: ");
		if (tipodepassageiro.equalsIgnoreCase("F�sico")) {
			cpf = showInputDialog("Digite seu cpf: ");
		} else if (tipodepassageiro.equalsIgnoreCase("Jur�dico")) {
			cnpj = showInputDialog("Digite seu cnpj: ");
		} else {
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida,tente novamente");
		}

		String aux = getDados(passageiro);
		showMessageDialog(null, aux);

		leitor.close();

	}

}
