package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Produto;

public class TesteSistemaCliente {

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
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		List<Empresa> listaEmpresa = new ArrayList<Empresa>();
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		Cliente objCliente = null;
		Empresa objEmpresa = null;
		Produto objProduto = null;
		
		int indice = 0;
		
		// entrada
		do {
			
			// cliente
			objCliente = new Cliente(
					texto("Nome do Cliente"),
					texto("Sobrenome do Cliente"),
					texto("Telefone do Cliente"),
					texto("País do Cliente"),
					texto("Idioma do Cliente")
					);
			
			listaCliente.add(objCliente);
			
			// empresa
			objEmpresa = new Empresa(
					texto("Nome da Empresa"),
					texto("Tamanho da Empresa"),
					texto("E-mail")
					);
			
			listaEmpresa.add(objEmpresa);
			
			// produto
			objProduto = new Produto(
				texto("Nome do Produto"),
				inteiro("Quantidade de Licença")
				);
			
			listaProduto.add(objProduto);
			
			indice++;
			
			
		}while (JOptionPane.showConfirmDialog(null, "Deseja adicionar outro produto?",
				"PRODUTOS",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0);
		
		// saida
		for (int contador = 0; contador < indice; contador++) {
			
			System.out.println("\nCLIENTE" + "\nNome: " + listaCliente.get(contador).getNome() + " " + objCliente.getSobrenome() + 
					"\nTelefone: " + listaCliente.get(contador).getTelefone() + 
					"\nPaís: " + listaCliente.get(contador).getPais() + 
					"\nIdioma: " + listaCliente.get(contador).getIdioma() + 
					"\nEmpresa: " + listaEmpresa.get(contador).getEmpresa() + 
					"\nTamanho da Empresa: " + listaEmpresa.get(contador).getTamanhoEmpresa() + 
					"\nE-mail Empresarial: " + listaEmpresa.get(contador).getEmail() + 
					"\nPRODUTO" + "\nNome: " + listaProduto.get(contador).getNomeProduto() + 
					"\nQuantidade de Licenças: " + listaProduto.get(contador).getQuantidadeLicenca() + 
					"\n\n---------------------------------");

			
		}
		
	}

}
