package br.fiap.passageiro;

import br.fiap.tipodepassageiro.TipodePassageiro;

public class Passageiro {
	private String nome, tipodepassageiro, telefone;
	private int cpf, cnpj;
	private TipodePassageiro tipo;

	public Passageiro(String nome, String tipodepassageiro, int cpf, String telefone, int cnpj) {
		super();
		this.nome = nome;
		this.tipodepassageiro = tipodepassageiro;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cnpj = cnpj;
	}

	public String getDados(Passageiro[] passageiro) {
		String aux = "";
		aux += "Passageiro " + "\n";
		aux += "Nome -> " + nome + "\n";
		aux += "Telefone -> " + telefone + "\n";
		aux += "CPF -> " + cpf + "\n";
		aux += "CNPJ - > " + cnpj + "\n";
		aux += "Tipo de Passageiro -> " + tipo + "\n";
		aux += "------------------------------------------------------\n";
		return aux;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipodepassageiro() {
		return tipodepassageiro;
	}

	public void setTipodepassageiro(String tipodepassageiro) {
		this.tipodepassageiro = tipodepassageiro;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

}
