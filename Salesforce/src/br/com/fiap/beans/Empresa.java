package br.com.fiap.beans;

public class Empresa {

	private String empresa;
	private String tamanhoEmpresa;
	private String email;

	public Empresa() {
		super();
	}

	public Empresa(String empresa, String tamanhoEmpresa, String email) {
		super();
		this.empresa = empresa;
		this.tamanhoEmpresa = tamanhoEmpresa;
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTamanhoEmpresa() {
		return tamanhoEmpresa;
	}

	public void setTamanhoEmpresa(String tamanhoEmpresa) {
		this.tamanhoEmpresa = tamanhoEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
