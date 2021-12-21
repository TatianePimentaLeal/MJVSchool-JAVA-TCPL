package bankapp.model;

import java.util.ArrayList
import java.util.

public class Conta {
	private double saldo;
	private String tipoConta;
	private String usuario;
	private List<Historico> historicos = new ArrayList;
	
	//todo é composto por: tipo de retorno
	//nome declarativo
	//parametros

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public List<Historico> getHistoricos() {
		return historicos;
	}
}
