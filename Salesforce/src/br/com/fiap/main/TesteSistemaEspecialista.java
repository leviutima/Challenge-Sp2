package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Especialista;
import br.com.fiap.beans.Produto;

public class TesteSistemaEspecialista {
	
	// String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	// int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	// double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		// instanciar
		List<Especialista> listaEspecialista = new ArrayList<Especialista>();
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		Especialista objEspecialista = null;
		Produto objProduto = null;
		
		int indice = 0;
		
		// entrada		
		do {
			
			// especialista
			objEspecialista = new Especialista(
					texto("Nome do Especialista"), 
					texto("E-mail do Especialista"),
					texto("Telefone do Especialista")
					);
			
			listaEspecialista.add(objEspecialista);
			
			// produto
			objProduto = new Produto(
					texto("Nome do Produto"),
					texto("Descrição do Produto")
					);
			
			listaProduto.add(objProduto);
			
			indice++;
			
		}while (JOptionPane.showConfirmDialog(null, "Deseja adicionar outro produto?",
				"PRODUTOS",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0);
		
		// saida
		for (int contador = 0; contador < indice; contador++) {
			
			System.out.println("\n\nPRODUTO" + "\nNome: " + listaProduto.get(contador).getNomeProduto() + 
					"\nDescrição do produto: " + listaProduto.get(contador).getDescricaoProduto() + 
					"\nESPECIALISTA" + "\nNome: " + listaEspecialista.get(contador).getNomeEspecialista() + 
					"\nE-mail: " + listaEspecialista.get(contador).getEmailEspecialista() + 
					"\nTelefone: " + listaEspecialista.get(contador).getTelefoneEspecialista());
		}

	}

}
