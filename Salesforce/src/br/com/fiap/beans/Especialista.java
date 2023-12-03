package br.com.fiap.beans;

public class Especialista {

	private String nomeEspecialista;
	private String emailEspecialista;
	private String telefoneEspecialista;

	public Especialista() {
		super();
	}

	public Especialista(String nomeEspecialista, String emailEspecialista, String telefoneEspecialista) {
		super();
		this.nomeEspecialista = nomeEspecialista;
		this.emailEspecialista = emailEspecialista;
		this.telefoneEspecialista = telefoneEspecialista;
	}

	public String getNomeEspecialista() {
		return nomeEspecialista;
	}

	public void setNomeEspecialista(String nomeEspecialista) {
		this.nomeEspecialista = nomeEspecialista;
	}

	public String getEmailEspecialista() {
		return emailEspecialista;
	}

	public void setEmailEspecialista(String emailEspecialista) {
		this.emailEspecialista = emailEspecialista;
	}

	public String getTelefoneEspecialista() {
		return telefoneEspecialista;
	}

	public void setTelefoneEspecialista(String telefoneEspecialista) {
		this.telefoneEspecialista = telefoneEspecialista;
	}

}
