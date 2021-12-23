package bankapp.repository;

import bankapp.model.Conta;

public class ContaRepository {
	
	private Conta [] contas = new Conta [5];
	
	private int contadorContas=0;
	
	public void adicionarConta(Conta conta) {
		contas[contadorContas]=conta;
		contadorContas=contadorContas+1;
	}
	public Conta[] getContas() {
		return contas;
	}
	
}
