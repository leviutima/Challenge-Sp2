package br.com.fiap.beans;

public class Produto {

	private String nomeProduto;
	private String descricaoProduto;
	private int quantidadeLicenca;

	public Produto() {
		super();
	}

	public Produto(String nomeProduto, int quantidadeLicenca) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidadeLicenca = quantidadeLicenca;
	}

	public Produto(String nomeProduto, String descricaoProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
	}

	public Produto(String nomeProduto, String descricaoProduto, int quantidadeLicenca) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.quantidadeLicenca = quantidadeLicenca;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getQuantidadeLicenca() {
		return quantidadeLicenca;
	}

	public void setQuantidadeLicenca(int quantidadeLicenca) {
		this.quantidadeLicenca = quantidadeLicenca;
	}

}
