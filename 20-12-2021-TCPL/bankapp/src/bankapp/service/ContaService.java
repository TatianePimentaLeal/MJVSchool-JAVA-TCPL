package bankapp.service;

import bankapp.model.Conta;
//import bankapp.model.Historico;

public class ContaService {
	public void depositar (Conta conta, double valorDepositado) {
		conta.setSaldo(conta.getSaldo() + valorDepositado);
	}
	public void sacar (Conta conta, double valorSacado) {
		conta.setSaldo(valorSacado);
	}
	public void tranferir (Conta conta, double valorTransferido) {
		conta.setSaldo(valorTransferido);
	}
}
