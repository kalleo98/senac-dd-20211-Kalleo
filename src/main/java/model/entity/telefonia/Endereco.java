package model.entity.telefonia;

public class Endereco {

	private String logradouro;
	private String uf;
	private String cidade;
	private String numero;

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String uf, String cidade, String numero) {
		super();
		this.logradouro = logradouro;
		this.uf = uf;
		this.cidade = cidade;
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
