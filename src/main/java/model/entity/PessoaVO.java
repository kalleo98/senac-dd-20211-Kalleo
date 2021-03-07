package model.entity;

import java.time.LocalDate;

public class PessoaVO {

	String nome;
	LocalDate dataNascimento;
	String sexo;
	String cpf;
	int reacaoVacina;

	public PessoaVO() {
		super();
	}

	public PessoaVO(String nome, LocalDate dataNascimento, String sexo, String cpf, int reacaoVacina) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.reacaoVacina = reacaoVacina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getReacaoVacina() {
		return reacaoVacina;
	}

	public void setReacaoVacina(int reacaoVacina) {
		this.reacaoVacina = reacaoVacina;
	}

}
