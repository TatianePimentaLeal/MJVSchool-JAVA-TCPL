package bankapp.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private double saldo;
	private String nomeCorrentista;
	private String numero;
	private List<Historico> historicos = new ArrayList();

	// +2 a 3 atributos relevantes para o negocio
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Historico> getHistoricos() {
		return historicos;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Conta [nomeCorrentista=" + nomeCorrentista + ", numero=" + numero + "]";
	}
	
}
