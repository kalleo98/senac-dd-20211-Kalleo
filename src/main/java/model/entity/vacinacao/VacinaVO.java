package model.entity.vacinacao;

import java.time.LocalDate;

public class VacinaVO {

	String origem;
	String estagioPesquisa;
	LocalDate dataPesquisa;
	String pesquisadorResponsavel;

	public VacinaVO() {
		super();
	}

	public VacinaVO(String origem, String estagioPesquisa, LocalDate dataPesquisa, String pesquisadorResponsavel) {
		super();
		this.origem = origem;
		this.estagioPesquisa = estagioPesquisa;
		this.dataPesquisa = dataPesquisa;
		this.pesquisadorResponsavel = pesquisadorResponsavel;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getEstagioPesquisa() {
		return estagioPesquisa;
	}

	public void setEstagioPesquisa(String estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}

	public LocalDate getDataPesquisa() {
		return dataPesquisa;
	}

	public void setDataPesquisa(LocalDate dataPesquisa) {
		this.dataPesquisa = dataPesquisa;
	}

	public String getPesquisadorResponsavel() {
		return pesquisadorResponsavel;
	}

	public void setPesquisadorResponsavel(String pesquisadorResponsavel) {
		this.pesquisadorResponsavel = pesquisadorResponsavel;
	}

}
